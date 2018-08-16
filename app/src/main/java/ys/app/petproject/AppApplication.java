package ys.app.petproject;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Log;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

import com.sunmi.payservice.hardware.aidl.HardwareOpt;

import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

import cn.finalteam.okhttpfinal.OkHttpFinal;
import cn.finalteam.okhttpfinal.OkHttpFinalConfiguration;
import rx.Scheduler;
import rx.schedulers.Schedulers;
import sunmi.payservicelib.SunmiPayService;
import ys.app.petproject.service.BlueToothService;
import ys.app.petproject.shangmi.printer.AidlUtil;
import ys.app.petproject.utils.AppInfoUtils;
import ys.app.petproject.utils.Cockroach;
import ys.app.petproject.utils.DeviceUtils;
import ys.app.petproject.utils.GlideUtil;

/**
 * Created by lyy on 2017/1/5 16:06.
 * email：2898049851@qq.com
 */

public class AppApplication extends Application {

    private static AppApplication instance;
    private ExecutorService executorService;
    private Scheduler scheduler;
    public static HardwareOpt mHardwareOpt;//pos机nfc
    private SunmiPayService sunmiPayService;

    private static BlueToothService mService = null;

    public static AppApplication get(Context context){
        return (AppApplication)context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        initOkHttpFinal();
        setExecutorService(Executors.newFixedThreadPool(5));

        if (!"M1".equals(Build.MODEL)){
            AidlUtil.getInstance().connectPrinterService(this);//连接打印机
            //连接nfc服务
            connectPayService();
        }

    }

    /**
     * 连接服务
     */
    private void connectPayService() {
        sunmiPayService = SunmiPayService.getInstance();
        sunmiPayService.connectPayService(AppApplication.getAppContext(), connCallback);
    }

    private SunmiPayService.ConnCallback connCallback = new SunmiPayService.ConnCallback() {

        @Override
        public void onServiceConnected() {
            AppApplication.mHardwareOpt = sunmiPayService.mHardwareOpt;
        }

        @Override
        public void onServiceDisconnected() {

        }

    };

    private void initOkHttpFinal() {
        OkHttpFinalConfiguration.Builder builder = new OkHttpFinalConfiguration.Builder();
        OkHttpFinal.getInstance().init(builder.build());
    }


    private void initCrash() {
        Cockroach.install(new Cockroach.ExceptionHandler() {
            // handlerException内部建议手动try{  你的异常处理逻辑  }catch(Throwable e){ } ，
            // 以防handlerException内部再次抛出异常，导致循环调用handlerException
            @Override
            public void handlerException(final Thread thread, final Throwable throwable) {
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    @Override
                    public void run() {
                        try {
                            Log.e("Cockroach", thread + "\n" + throwable.toString());
                            throwable.printStackTrace();
                            Toast.makeText(AppApplication.this, "Exception Happend\n" + thread + "\n" + throwable.toString(), Toast.LENGTH_SHORT).show();
//                        throw new RuntimeException("..."+(i++));
                        } catch (Throwable e) {

                        }
                    }
                });
            }
        });
    }


    /**
     * get the application.
     * @return
     */
    public static AppApplication getInstance() {
        return instance;
    }

    /**
     * get the application context.
     * @return
     */
    public static Context getAppContext(){
        return instance == null ? null : instance.getApplicationContext();
    }
    /**
     * @return the executorService
     */
    public ExecutorService getExecutorService() {
        return executorService;
    }

    /**
     * @param executorService
     *            the executorService to set
     */
    public void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onTrimMemory(int level) {
        //清除图片内存缓存
        GlideUtil.getInstance().clearImageMemoryCache();
    }

    @SuppressLint("MissingSuperCall")
    @Override
    public void onLowMemory() {
        //清除图片内存缓存
        GlideUtil.getInstance().clearImageMemoryCache();
    }

    public Scheduler subscribeScheduler() {
        if (scheduler == null)
            scheduler = Schedulers.io();
        return scheduler;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }



    private final static AtomicReference<WeakReference<String>> USER_AGENT = new AtomicReference<>();
    @TargetApi(17)
    public String userAgent() {
        while (true) {
            WeakReference<String> userAgent = USER_AGENT.get();
            if (userAgent != null && userAgent.get() != null) {
                return userAgent.get();
            }
            String defaultUserAgent;
            if (DeviceUtils.getSDKVersionInt() >= 17) {
                defaultUserAgent = WebSettings.getDefaultUserAgent(getAppContext());
            } else {
                defaultUserAgent = new WebView(getAppContext()).getSettings().getUserAgentString();
            }
            userAgent = new WeakReference<String>(defaultUserAgent + " petproject/" + AppInfoUtils.getVersionName(getAppContext()));
            if (USER_AGENT.compareAndSet(null, userAgent)) {
                return userAgent.get();
            }
        }
    }
    /**
     * 设置蓝牙连接
     */
    private void service_init() {
            Intent bindIntent = new Intent(this, BlueToothService.class);
            bindService(bindIntent, mServiceConnection, Context.BIND_AUTO_CREATE);
            LocalBroadcastManager.getInstance(this).registerReceiver(UARTStatusChangeReceiver, makeGattUpdateIntentFilter());

    }
    //服务连接
    private ServiceConnection mServiceConnection = new ServiceConnection() {
        public void onServiceConnected(ComponentName className, IBinder rawBinder) {
            try{
                mService = ((BlueToothService.LocalBinder) rawBinder).getService();
                if (!mService.initialize()) {
                }
            }catch(Exception e){
                e.printStackTrace();
            }


        }

        public void onServiceDisconnected(ComponentName classname) {
            mService = null;
        }
    };


    private final BroadcastReceiver UARTStatusChangeReceiver = new BroadcastReceiver() {

        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();

            //*********************//
            if (action.equals(BlueToothService.ACTION_GATT_DISCONNECTED)) {
                mService.close();

            }


            //*********************//
            if (action.equals(BlueToothService.ACTION_GATT_SERVICES_DISCOVERED)) {
                mService.enableTXNotification();
            }

            //*********************//
            if (action.equals(BlueToothService.DEVICE_DOES_NOT_SUPPORT_UART)){
                showMessage("Device doesn't support UART. Disconnecting");
                mService.disconnect();
            }
        }
    };

    private static IntentFilter makeGattUpdateIntentFilter() {
        final IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(BlueToothService.ACTION_GATT_CONNECTED);
        intentFilter.addAction(BlueToothService.ACTION_GATT_DISCONNECTED);
        intentFilter.addAction(BlueToothService.ACTION_GATT_SERVICES_DISCOVERED);
        intentFilter.addAction(BlueToothService.ACTION_DATA_AVAILABLE);
        intentFilter.addAction(BlueToothService.DEVICE_DOES_NOT_SUPPORT_UART);
        return intentFilter;
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }



    private void showMessage(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();

    }
    public static void openBox(){
        byte[] value = new byte[4];
        value[0] = (byte) 'o';
        value[1] = (byte) 'p';
        value[2] = (byte) 'e';
        value[3] = (byte) 'n';

        mService.writeRXCharacteristic(value);
    }

}
