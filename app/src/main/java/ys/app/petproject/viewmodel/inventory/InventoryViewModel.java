package ys.app.petproject.viewmodel.inventory;

import android.content.Intent;
import android.view.View;

import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.activity.AddGoodsActivity;
import ys.app.petproject.activity.AddServiceActivity;
import ys.app.petproject.activity.CheckActivity;
import ys.app.petproject.activity.GoodsActivity;
import ys.app.petproject.activity.ServiceActivity;
import ys.app.petproject.activity.inventory.InventoryActivity;
import ys.app.petproject.activity.inventory.InventoryRecordsActivity;
import ys.app.petproject.activity.inventory.OutPutInventoryActivity;
import ys.app.petproject.databinding.ActivityInventoryBinding;

/**
 * Created by aaa on 2017/3/3.
 */

public class InventoryViewModel extends BaseActivityViewModel {

    private final InventoryActivity mActivity;
    private final ActivityInventoryBinding mBinding;

    public InventoryViewModel(InventoryActivity activity, ActivityInventoryBinding mBinding) {
        this.mActivity = activity;
        this.mBinding = mBinding;
    }

    /**
     * 点击了商品库存
     *
     * @param v
     */
    public void clickSPKC(View v) {
        Intent intent = new Intent(mActivity, GoodsActivity.class);
        intent.putExtra(Constants.intent_search_from,Constants.intent_form_shangpin_kucunliebiao);
        mActivity.startActivity(intent);
    }


    /**
     * 点击了服务库存
     *
     * @param v
     */
    public void clickFWKC(View v) {
        Intent intent = new Intent(mActivity, ServiceActivity.class);
        intent.putExtra(Constants.intent_search_from,Constants.intent_form_fuwu_kucunliebiao);
        mActivity.startActivity(intent);
    }


    /**
     * 点击了新增商品
     *
     * @param v
     */
    public void clickXZSP(View v) {
        turnToActivity(mActivity, AddGoodsActivity.class);
    }


    /**
     * 点击了新增服务
     *
     * @param v
     */
    public void clickXZFW(View v) {
        turnToActivity(mActivity, AddServiceActivity.class);
    }


    /**
     * 点击了商品盘点
     *
     * @param v
     */
    public void clickSPPD(View v) {
        turnToActivity(mActivity, CheckActivity.class);
    }


    /**
     * 点击了商品入库
     *
     * @param v
     */
    public void clickSPRK(View v) {
        Intent intent = new Intent(mActivity, GoodsActivity.class);
        intent.putExtra(Constants.intent_search_from,Constants.intent_form_shangpin_ruku);
        mActivity.startActivity(intent);

    }


    /**
     * 点击了商品出库
     *
     * @param v
     */
    public void clickSPCK(View v) {
        Intent intent = new Intent(mActivity, GoodsActivity.class);
        intent.putExtra(Constants.intent_search_from,Constants.intent_form_shangpin_chuku);
        mActivity.startActivity(intent);
    }
    /**
     * 点击了盘点记录
     *
     * @param v
     */
    public void clickPDJL(View v) {
        Intent intent = new Intent(mActivity, InventoryRecordsActivity.class);
        mActivity.startActivity(intent);
    }
    /**
     * 点击了出入库记录
     */
    public void clickChuRuKu(View view){
        Intent intent = new Intent(mActivity, OutPutInventoryActivity.class);
        mActivity.startActivity(intent);
    }

}
