package ys.app.petproject.widgetprovider;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

/*
 * @author : skywang <wangkuiwu@gmail.com>
 * description : 周期性更新AppWidget的服务
 */

public class MyWidgetService extends Service implements MyWidgetProvider.OnSendIntentListener{
	
	private static final String TAG="CashierWidgetService";

	// 周期性更新 widget 的线程
	private Context mContext;
	// 更新周期的计数

	@Override
	public void onCreate() {

		super.onCreate();
	}

	@Override
	public void onDestroy() {
		// 中断线程，即结束线程。
		super.onDestroy();
	}

	@Override
	public IBinder onBind(Intent intent) {
		return null;
	}

	/*
	 * 服务开始时，即调用startService()时，onStartCommand()被执行。
	 * onStartCommand() 这里的主要作用：
	 * (01) 将 appWidgetIds 添加到队列sAppWidgetIds中
	 * (02) 启动线程
	 */
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		Log.d(TAG, "onStartCommand");

		super.onStartCommand(intent, flags, startId);
		updateWidgetView();
		return START_STICKY;
	}

	int count = 0;

	private void updateWidgetView() {
		System.out.println("onReceive------------------------- updateWidgetView ");
		Intent updateIntent = new Intent(MyWidgetProvider.ACTION_UPDATE_ALL);
		this.getApplicationContext().sendBroadcast(updateIntent);
	}

	@Override
	public void sendIntent(String action) {
		System.out.println("onReceive----------+++--------- sendIntent ");
		Intent updateIntent = new Intent(MyWidgetProvider.ACTION_UPDATE_ALL);
		this.getApplicationContext().sendBroadcast(updateIntent);
	}
}
