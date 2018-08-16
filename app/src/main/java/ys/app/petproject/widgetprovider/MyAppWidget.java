package ys.app.petproject.widgetprovider;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.util.Log;
import android.widget.RemoteViews;

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

public class MyAppWidget extends AppWidgetProvider {

    public static final String pkgName = "ys.app.petproject.provider.widget_UPDATE_ALL";
    // 发送服务对应action

    @Override
    public void onReceive(Context context, Intent intent) {

        if (context == null) {
            return;
        }

        Log.i("info","接收到广播消息");
        if (pkgName.equals(intent.getAction())) {

            updateWidgetView(context, AppWidgetManager.getInstance(context));

        } else {
            updateWidgetView(context, AppWidgetManager.getInstance(context));

        }
        super.onReceive(context, intent);
    }

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager,
                         int[] appWidgetIds) {
        AppWidgetIdInfoDao infoDao = GreenDaoUtils.getmDaoSession().getAppWidgetIdInfoDao();
        infoDao.deleteAll();
        List<AppWidgetIdInfo> list=new ArrayList<>();
        for (int appWidgetId : appWidgetIds) {
            AppWidgetIdInfo info=new AppWidgetIdInfo();
            info.setAppWidgetId(appWidgetId+"");
            list.add(info);
        }
        infoDao.insertInTx(list);
        updateWidgetView(context, AppWidgetManager.getInstance(context));
    }

    private void updateWidgetView(Context context, AppWidgetManager appWidgetManager){

        AppWidgetIdInfoDao infoDao = GreenDaoUtils.getmDaoSession().getAppWidgetIdInfoDao();
        List<AppWidgetIdInfo> idList = infoDao.loadAll();
        Log.i("info","更新View======updateWidgetView 长度=="+idList.size());
        int appID;
        for (int i=0;i<idList.size();i++){
            AppWidgetIdInfo item = idList.get(i);
            appID = Integer.parseInt(item.appWidgetId);
            RemoteViews remote = new RemoteViews(context.getPackageName(), R.layout.my_widget_layout);

            clickView(context, remote, R.id.rl0, CollectMoneyActivity.class);
            clickView(context, remote, R.id.rl1, AppointmentMainActivity.class);
            clickView(context, remote, R.id.rl2, VipActivity.class);
            clickView(context, remote, R.id.rl3, InventoryActivity.class);
            clickView(context, remote, R.id.rl4, AchievementActivity.class);
            clickView(context, remote, R.id.rl5, SaleActivity.class);
            clickView(context, remote, R.id.rl6, ManagerActivity.class);

            appWidgetManager.updateAppWidget(appID, remote);
        }

    }

    public void clickView(Context context, RemoteViews remote, int viewId, Class<?> cls) {
        Log.i("info","产生点击事件");
        CursorQuery greendao = GreenDaoUtils.getmDaoSession().getLoginInfoDao().queryBuilder().buildCursor();
        Cursor cursor = greendao.query();
        if (cursor.getCount() == 0) {
            Intent intent = new Intent(context, LoginActivity.class);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            remote.setOnClickPendingIntent(viewId, pendingIntent);
        } else {

            Intent intent = new Intent(context, cls);
            PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            remote.setOnClickPendingIntent(viewId, pendingIntent);
        }
        cursor.close();
    }

    @Override
    public void onDeleted(Context context, int[] appWidgetIds) {
        super.onDeleted(context, appWidgetIds);
    }

    @Override
    public void onEnabled(Context context) {
        super.onEnabled(context);
    }

    @Override
    public void onDisabled(Context context) {
        super.onDisabled(context);
    }

}
