package ys.app.petproject.widget.dialog;

import android.app.Activity;
import android.app.Dialog;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import ys.app.petproject.R;
import ys.app.petproject.adapter.SelectAdapter;
import ys.app.petproject.callback.OnItemClickListener;
import ys.app.petproject.model.DiscountInfo;
import ys.app.petproject.model.EmployeeInfo;
import ys.app.petproject.model.GoodTypeInfo;
import ys.app.petproject.model.ServiceTypeInfo;
import ys.app.petproject.widget.FullyLinearLayoutManager;

/**
 * Created by aaa on 2017/3/20.
 */

public class SelectDialog extends Dialog{

    private Activity activity;

    private String mUrlTag ;
    private RecyclerView mRecyclerView;
    private SelectAdapter mAdapter;
//    private TextView mCancelTv;
//    private TextView mOkTv;
    private SelectListenner listenner;


    public SelectDialog(Activity activity, SelectAdapter adapter) {
        super(activity, R.style.ThemeCustomDialog);
        super.setContentView(R.layout.select_dialog);
        this.activity = activity;
        this.mAdapter = adapter;
        init();
    }

    private void init() {
//        mCancelTv = (TextView)findViewById(R.id.cancel_tv);
//        mOkTv = (TextView)findViewById(R.id.ok_tv);
        mRecyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        mRecyclerView.setLayoutManager(new FullyLinearLayoutManager(activity));
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setListener(new OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                int selectPosition = mAdapter.getPosition();
                if(-1 != selectPosition){
                    if(listenner!=null){
                        listenner.onSelect(selectPosition);
                        dismiss();
                    }
                }else {
                    Toast.makeText(activity,"请选择后再确定",Toast.LENGTH_SHORT).show();
                }
            }
        });

//        mOkTv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int selectPosition = mAdapter.getPosition();
//                if(-1 != selectPosition){
//                    if(listenner!=null){
//                        listenner.onSelect(selectPosition);
//                        dismiss();
//                    }
//                }else {
//                    Toast.makeText(activity,"请选择后再确定",Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

//        mCancelTv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                dismiss();
//            }
//        });
    }

    public void setData(List<GoodTypeInfo> list){
        mAdapter.setData(list);
    }

    public void setDiscountData(List<DiscountInfo> list){
        mAdapter.setData(list);
    }

    public void setServiceData(List<ServiceTypeInfo> list){
        mAdapter.setData(list);
    }

    public void setListenner(SelectListenner listenner) {
        this.listenner = listenner;
    }

    public void setModifyTransactionData(List<EmployeeInfo> list) {
        mAdapter.setData(list);
    }

    public interface SelectListenner{
        void onSelect(int position);
    }

}
