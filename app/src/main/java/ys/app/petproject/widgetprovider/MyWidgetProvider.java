package ys.app.petproject.widgetprovider;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.format.Time;
import android.util.Log;
import android.widget.RemoteViews;
import android.widget.Toast;

import com.greendao.AppWidgetIdInfoDao;

import org.greenrobot.greendao.query.CursorQuery;

import java.util.ArrayList;
import java.util.List;

import ys.app.petproject.R;
import ys.app.petproject.activity.AchievementActivity;
import ys.app.petproject.activity.CollectMoneyActivity;
import ys.app.petproject.activity.LoginActivity;
import ys.app.petproject.activity.manage.ManagerActivity;
import ys.app.petproject.activity.SaleActivity;
import ys.app.petproject.activity.appointment.AppointmentMainActivity;
import ys.app.petproject.activity.inventory.InventoryActivity;
import ys.app.petproject.activity.vip.VipActivity;
import ys.app.petproject.db.GreenDaoUtils;

/*
 * @author : skywang <wangkuiwu@gmail.com>
 * description : 提供App Widget
 */

public class MyWidgetProvider extends AppWidgetProvider {
    public static final String pkgName = "ys.app.petproject.provider.widget";
    // 发送服务对应action
    public static final String MY_ERVICE_INTENT = pkgName + "_APP_WIDGET_SERVICE";
    // 更新 widget 的广播对应的action
    public static final String ACTION_UPDATE_ALL = pkgName + "_UPDATE_ALL";

    private static final String TAG = "MyWidgetProvider";


    // 关闭点击页面请求
    private static final int REQUEST_CLICK_RL0_EVENT = 1;// 点击事件
    private static final int REQUEST_CLICK_RL1_EVENT = 2;// 点击事件
    private static final int REQUEST_CLICK_RL2_EVENT = 3;// 点击事件
    private static final int REQUEST_CLICK_RL3_EVENT = 4;// 点击事件
    private static final int REQUEST_CLICK_RL4_EVENT = 5;// 点击事件
    private static final int REQUEST_CLICK_RL5_EVENT = 6;// 点击事件
    private static final int REQUEST_CLICK_RL6_EVENT = 7;// 点击事件
    List<AppWidgetIdInfo> idList=new ArrayList<>();


    // onUpdate() 在更新 widget 时，被执行，
    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        Log.d(TAG, " ------ onUpdate(): appWidgetIds.length=" + appWidgetIds.length);

        AppWidgetIdInfoDao infoDao = GreenDaoUtils.getmDaoSession().getAppWidgetIdInfoDao();
        infoDao.deleteAll();
        List<AppWidgetIdInfo> list=new ArrayList<>();
        for (int appWidgetId : appWidgetIds) {
            AppWidgetIdInfo info=new AppWidgetIdInfo();
            info.setAppWidgetId(appWidgetId+"");
            list.add(info);
        }
        infoDao.insertInTx(list);

        // 解决CashierWidgetProvider没有定时刷新问题（不刷新则不会变化layout 已经按钮触发事件）
        Log.d(TAG, " ------ onUpdate(): CashierWidgetService");
        Time time = new Time();
        time.setToNow();
        Intent intent = new Intent(context, MyWidgetService.class);
        intent.setPackage(context.getApplicationContext().getPackageName());
        PendingIntent refreshIntent = PendingIntent.getService(context, 0, intent, 0);
        AlarmManager alarm = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        alarm.setRepeating(AlarmManager.RTC, time.toMillis(true), 1000, refreshIntent);
        context.startService(intent);
    }

    // 当 widget 被初次添加 或者 当 widget 的大小被改变时，被调用
    @Override
    public void onAppWidgetOptionsChanged(Context context, AppWidgetManager appWidgetManager, int appWidgetId,
                                          Bundle newOptions) {
        Log.d(TAG, " ------ onAppWidgetOptionsChanged");
        super.onAppWidgetOptionsChanged(context, appWidgetManager, appWidgetId, newOptions);
    }

    // widget被删除时调用
    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        Log.d(TAG, " ------ onDeleted(): appWidgetIds.length=" + appWidgetIds.length);

        // 当 widget 被删除时，对应的删除set中保存的widget的id
//        for (int appWidgetId : appWidgetIds) {
//            idsSet.remove(Integer.valueOf(appWidgetId));
//        }
        AppWidgetIdInfoDao infoDao = GreenDaoUtils.getmDaoSession().getAppWidgetIdInfoDao();
        infoDao.deleteAll();
        super.onDeleted(context, appWidgetIds);
    }

    // 第一个widget被创建时调用
    @Override
    public void onEnabled(Context context) {
        Log.d(TAG, " ------ onEnabled");
        // 在第一个 widget 被创建时，开启服务
        Intent intent=new Intent(MY_ERVICE_INTENT);
        intent.setPackage(context.getPackageName());
        context.startService(intent);

        super.onEnabled(context);
    }

    // 最后一个widget被删除时调用
    @Override
    public void onDisabled(Context context) {
        Log.d(TAG, " ------ onDisabled");

        // 在最后一个 widget 被删除时，终止服务
        Intent intent=new Intent(MY_ERVICE_INTENT);
        intent.setPackage(context.getPackageName());
        context.stopService(intent);

        super.onDisabled(context);
    }

    // 接收广播的回调函数
    @Override
    public void onReceive(Context context, Intent intent) {
        if (context == null) {
            return;
        }
        final String action = intent.getAction();
        Log.d(TAG, " ------ OnReceive:Action: " + action);
        if (ACTION_UPDATE_ALL.equals(action)) {
            // “更新”广播,当覆盖安装时：AppWidgetManager.getInstance(context)会报空指针
            updateAllAppWidgets(context, AppWidgetManager.getInstance(context));

        } else if (intent.hasCategory(Intent.CATEGORY_ALTERNATIVE)) {
            // “按钮点击”广播
            Uri data = intent.getData();
            int clickId = Integer.valueOf(data.getSchemeSpecificPart());
            Log.d(TAG, " ------ OnReceive:clickId: " + clickId);
            switch (clickId) {
                case REQUEST_CLICK_RL0_EVENT:
                    startPetApp(context, CollectMoneyActivity.class);
                    break;
                case REQUEST_CLICK_RL1_EVENT:
                    startPetApp(context,AppointmentMainActivity.class);
                    break;
                case REQUEST_CLICK_RL2_EVENT:
                    startPetApp(context,  VipActivity.class);
                    break;
                case REQUEST_CLICK_RL3_EVENT:
                    startPetApp(context, InventoryActivity.class);
                    break;
                case REQUEST_CLICK_RL4_EVENT:
                    startPetApp(context, AchievementActivity.class);
                    break;
                case REQUEST_CLICK_RL5_EVENT:
                    startPetApp(context, SaleActivity.class);
                    break;
                case REQUEST_CLICK_RL6_EVENT:
                    startPetApp(context,  ManagerActivity.class);
                    break;
                default:
                    break;
            }
        }

        super.onReceive(context, intent);
    }

    private void startPetApp(Context context,  Class<?> cls) {
        //判断是否登录成功,如果没有登录成功,则跳到登录页面
        try {
            CursorQuery greendao = GreenDaoUtils.getmDaoSession().getLoginInfoDao().queryBuilder().buildCursor();
            Cursor cursor=greendao.query();

            if (cursor.getCount() == 0) {//没有登录
                    Intent intent = new Intent(context, LoginActivity.class);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    context.startActivity(intent);
            } else {
                    Intent intent = new Intent(context,cls);
                    intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    context.startActivity(intent);
            }
            cursor.close();

        } catch (Exception e) {
            //Log.e("widget", e.getMessage());
            Toast.makeText(context, "找不到content://ys.app.pet.provider.petProvider/login", Toast.LENGTH_SHORT).show();
        }


    }

    // 更新所有的 widget
    private void updateAllAppWidgets(Context context, AppWidgetManager appWidgetManager) {

        try{
            AppWidgetIdInfoDao infoDao = GreenDaoUtils.getmDaoSession().getAppWidgetIdInfoDao();
            idList = infoDao.loadAll();
            Log.d(TAG, "CashierWidgetProvider ------ updateAllAppWidgets(): size=" + idList.size());
        }catch (Exception e){
            Log.i(TAG,"数据库异常");
        }



        // widget 的id
        int appID;
        // 迭代器，用于遍历所有保存的widget的id

        for (int i = 0; i <idList.size(); i++) {
            AppWidgetIdInfo item = idList.get(i);
            appID = Integer.parseInt(item.appWidgetId);

            // 获取 example_appwidget.xml 对应的RemoteViews
            RemoteViews remoteView = new RemoteViews(context.getPackageName(), R.layout.my_widget_layout);

            // 设置点击按钮对应的PendingIntent：即点击按钮时，发送广播。
            remoteView.setOnClickPendingIntent(R.id.rl0, getPendingIntent(context, appID, REQUEST_CLICK_RL0_EVENT));
            remoteView.setOnClickPendingIntent(R.id.rl1, getPendingIntent(context, appID, REQUEST_CLICK_RL1_EVENT));
            remoteView.setOnClickPendingIntent(R.id.rl2, getPendingIntent(context, appID, REQUEST_CLICK_RL2_EVENT));
            remoteView.setOnClickPendingIntent(R.id.rl3, getPendingIntent(context, appID, REQUEST_CLICK_RL3_EVENT));
            remoteView.setOnClickPendingIntent(R.id.rl4, getPendingIntent(context, appID, REQUEST_CLICK_RL4_EVENT));
            remoteView.setOnClickPendingIntent(R.id.rl5, getPendingIntent(context, appID, REQUEST_CLICK_RL5_EVENT));
            remoteView.setOnClickPendingIntent(R.id.rl6, getPendingIntent(context, appID, REQUEST_CLICK_RL6_EVENT));

            // 更新 widget
            appWidgetManager.updateAppWidget(appID, remoteView);
        }
    }

    // 发送点击事件广播
    private PendingIntent getPendingIntent(Context context, int appID, int clickId) {
        Intent intent = new Intent(context.getApplicationContext(), MyWidgetProvider.class);
        intent.addCategory(Intent.CATEGORY_ALTERNATIVE);
        intent.setData(Uri.parse("custom:" + clickId));
        // PendingIntent.FLAG_CANCEL_CURRENT
        PendingIntent pi = PendingIntent.getBroadcast(context, appID, intent, 0);
        return pi;
    }



    private OnSendIntentListener listener;

    public interface OnSendIntentListener{
        void sendIntent(String action);
    }

    public void setOnSendIntentListener(OnSendIntentListener listener){
        this.listener = listener;
    }
}
