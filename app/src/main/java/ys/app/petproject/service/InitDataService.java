package ys.app.petproject.service;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

import ys.app.petproject.utils.InitDataUtils;
import ys.app.petproject.utils.Logger;

/**
 * 初始化数据
 * Created by admin on 2017/6/17.
 */

public class InitDataService extends IntentService {


    public InitDataService(){
        super("InitDataService");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Logger.e("InitDataService ------->>>> onCreate()");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Logger.e("InitDataService ------->>>> onHandleIntent()");
        InitDataUtils.getInstance()
                .getVipCardHttp()
                .getServiceTypeHttp()
                .getGoodsTypeHttp()
                .getEmployeeListHttp()
                .getBackReasonHttp()
                .getAnimalTypeHttp();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Logger.e("InitDataService ------->>>> onDestroy()");
    }
}
