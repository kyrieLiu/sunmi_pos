package ys.app.petproject;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.ObservableBoolean;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import ys.app.petproject.widget.wrapperRecylerView.IRecyclerView;
import ys.app.petproject.widget.wrapperRecylerView.LoadMoreFooterView;

/**
 * Created by aaa on 2017/4/7.
 */

public abstract class BaseFragmentViewModel extends BaseObservable {

    public ObservableBoolean isNetWorkErrorVisible = new ObservableBoolean(false);
    public ObservableBoolean isNoneDataVisible = new ObservableBoolean(false);
    public ObservableBoolean isLoadingVisible = new ObservableBoolean(false);
    protected boolean fristCome = true;
    protected int startHttp;

    protected void showToast(Context context, String toastStr) {
        if (context != null) {
            Toast.makeText(context, toastStr, Toast.LENGTH_SHORT).show();
        }
    }

    public void onClickNetWorkError(View view) {
        isNetWorkErrorVisible.set(false);
        reloadData(view);
    }

    public void reloadData(View view) {
    }


    protected void afterRefreshAndLoadMoreSuccess(List mList, final IRecyclerView recyclerView, LoadMoreFooterView loadMoreFooterView) {

        if (mList == null || recyclerView == null || loadMoreFooterView == null) return;

        if (startHttp == 0) {//如果是刷新
            recyclerView.post(new Runnable() {
                @Override
                public void run() {
                    recyclerView.setRefreshing(false);
                }
            });//刷新停止
            if (mList.size() == 0) {//list长度为0
                if (fristCome) {//第一次进来
                    isNoneDataVisible.set(true);//展示没有数据img
                    isLoadingVisible.set(false);
                }
                loadMoreFooterView.setStatus(LoadMoreFooterView.Status.Normal);//footer为正常状态
            } else {//list长度不为0
                if (fristCome) {//隐藏没有数据img,并且fristCome设置为false
                    isNoneDataVisible.set(false);
                    isLoadingVisible.set(false);
                    fristCome = false;
                }
                if (mList.size() == 10) {
                    loadMoreFooterView.setStatus(LoadMoreFooterView.Status.Normal);
                } else {
                    loadMoreFooterView.setStatus(LoadMoreFooterView.Status.TheEnd);
                }
            }
        } else {//如果是加载更多
            if (mList.size() == 10) {
                loadMoreFooterView.setStatus(LoadMoreFooterView.Status.Normal);
            } else {
                loadMoreFooterView.setStatus(LoadMoreFooterView.Status.TheEnd);
            }
        }
        startHttp += mList.size();
    }


    protected void afterRefreshAndLoadMoreFailed(final IRecyclerView recyclerView, LoadMoreFooterView loadMoreFooterView) {

        if (recyclerView == null || loadMoreFooterView == null) return;

        if(fristCome){
            isNetWorkErrorVisible.set(true);
        }else {
            if (startHttp == 0) {//如果为刷新
                recyclerView.post(new Runnable() {
                    @Override
                    public void run() {
                        recyclerView.setRefreshing(false);
                    }
                });
                if (fristCome) {
                    isNetWorkErrorVisible.set(true);
                } else {
                    loadMoreFooterView.setStatus(LoadMoreFooterView.Status.NetWorkError);
                }
            } else {//如果为加载更多
                loadMoreFooterView.setStatus(LoadMoreFooterView.Status.NetWorkError);
            }
        }

    }


    protected void afterRefreshFailed(final IRecyclerView recyclerView) {
        if (fristCome) {
            isNetWorkErrorVisible.set(true);
            isNoneDataVisible.set(false);
            isLoadingVisible.set(false);
        }
        recyclerView.post(new Runnable() {
            @Override
            public void run() {
                recyclerView.setRefreshing(false);
            }
        });
    }


    protected void afterRefreshSuccess(final IRecyclerView recyclerView, List data) {
        if (fristCome) {
            isLoadingVisible.set(false);
            if (data.size() == 0) {
                isNoneDataVisible.set(true);
            }else {
                fristCome = false;
            }
        } else {
            isNoneDataVisible.set(false);
            fristCome = false;
        }
        recyclerView.post(new Runnable() {
            @Override
            public void run() {
                recyclerView.setRefreshing(false);
            }
        });
    }

}
