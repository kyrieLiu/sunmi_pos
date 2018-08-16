package ys.app.petproject.viewmodel.appointment;

import android.content.Intent;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;
import android.widget.TextView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.functions.Action1;
import ys.app.petproject.BaseActivityViewModel;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.activity.appointment.AppointmentActivity;
import ys.app.petproject.activity.appointment.AppointmentMainActivity;
import ys.app.petproject.adapter.appointment.AppointmentMainAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.databinding.ActivityAppointmentMainBinding;
import ys.app.petproject.event.RxManager;
import ys.app.petproject.http.ApiClient;
import ys.app.petproject.http.ApiRequest;
import ys.app.petproject.http.Callback;
import ys.app.petproject.model.AppointmentMainBean;
import ys.app.petproject.model.BaseListResult;
import ys.app.petproject.utils.NetWorkUtil;
import ys.app.petproject.widget.wrapperRecylerView.LoadMoreFooterView;

/**
 * Created by liuyin on 2017/10/13.
 */

public class AppointmentMainViewModel extends BaseActivityViewModel{
    private ActivityAppointmentMainBinding mBinding;
    private AppointmentMainActivity mActivity;
    private ApiClient<BaseListResult<AppointmentMainBean>> mClient;
    private LoadMoreFooterView mLoadMoreFooterView;
    private AppointmentMainAdapter mAdapter;
    private RxManager rxManager;

    public AppointmentMainViewModel(ActivityAppointmentMainBinding mBinding,AppointmentMainActivity mActivity){
        this.mBinding=mBinding;
        this.mActivity=mActivity;
        this.mClient=new ApiClient<>();
        initView();
    }
    private void initView(){

        if (rxManager==null){
            rxManager=new RxManager();
        }
        rxManager.on(Constants.bus_type_http_result, new Action1<Integer>() {
            @Override
            public void call(Integer integer) {
                if(Constants.type_addAppointment_success == integer){
                    loadHttpData();
                }
            }
        });


        mAdapter = new AppointmentMainAdapter(mActivity);
        mBinding.recyclerView.setLayoutManager(new GridLayoutManager(mActivity,3));
        mBinding.recyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Intent intent = new Intent(mActivity,AppointmentActivity.class);
                TextView tv_date= (TextView) view.findViewById(R.id.tv_appointment_day);
                String date=tv_date.getText().toString();
                intent.putExtra(Constants.intent_flag,date);
                mActivity.startActivity(intent);
            }
        });


        loadHttpData();
    }
    private void loadHttpData() {
        if (NetWorkUtil.isNetworkAvailable(mActivity)) {//有网请求数据
            getDataList();
        } else {//无网显示断网连接
            mActivity.showToast(Constants.network_error_warn);
            isNetWorkErrorVisible.set(true);
        }
    }

    private void getDataList(){
        Map<String, String> params = new HashMap<>();
        params.put("headOfficeId", SpUtil.getHeadOfficeId()+"");
        params.put("branchId",SpUtil.getBranchId()+"");
        isLoadingVisible.set(true);
        isNetWorkErrorVisible.set(false);
        isNetWorkErrorVisible.set(false);
        mClient.reqApi("selectBespeakByDay", params, ApiRequest.RespDataType.RESPONSE_JSON)
                .updateUI(new Callback<BaseListResult<AppointmentMainBean>>() {
                    @Override
                    public void onSuccess(BaseListResult<AppointmentMainBean> result) {
                        isLoadingVisible.set(false);
                        if (result.isSuccess()) {
                            List<AppointmentMainBean> data = result.getData();
                            mAdapter.setList(data);
                        } else {
                            mActivity.showToast(result.getErrorMessage());
                        }
                    }

                    @Override
                    public void onError(Throwable e) {
                        super.onError(e);
                        isLoadingVisible.set(false);
                        isNetWorkErrorVisible.set(true);
                    }
                });

    }

    public void clear(){
        if (rxManager!=null){
            rxManager.clear();
            rxManager=null;
        }
    }

}
