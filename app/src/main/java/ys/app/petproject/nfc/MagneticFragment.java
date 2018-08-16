package ys.app.petproject.nfc;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.sunmi.payservice.hardware.aidl.AidlConstants;
import com.sunmi.payservice.hardware.aidl.HardwareOpt;
import com.sunmi.payservice.hardware.aidl.ReadCardCallback;
import com.sunmi.payservice.hardware.aidl.bean.PayCardInfo;

import ys.app.petproject.AppApplication;
import ys.app.petproject.Constants;
import ys.app.petproject.R;

/**
 * Created by liuyin on 2017/9/30.
 */

public class MagneticFragment extends Fragment {
    private View view;

    private TextView stapInfoTv;
    private String intentFlag;
    private VipCardModel vipCardModel;

    private int vipFlag;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_nfc,null);
        Bundle bundle=getArguments();
        intentFlag = bundle.getString(Constants.intent_flag);
        vipFlag=bundle.getInt(Constants.intent_vip_name);
        vipCardModel = new VipCardModel(this,intentFlag,vipFlag);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
         stapInfoTv = (TextView)view.findViewById(R.id.test_content_stap_info);
        setTestRange();
    }

    @Override
    public void onResume() {
        super.onResume();
        startTask();
    }

    @Override
    public void onPause() {
        super.onPause();
        stopTask();
    }

    class ReadMagTask extends Thread implements Handler.Callback {
        private Handler H;
        private boolean isRun = false;
        public ReadMagTask() {
            H = new Handler(this);
        }

        /*
         * (non-Javadoc)
         * 
         * @see java.lang.Thread#run()
         */
        @Override
        public void run() {
            isRun = true;
            // 磁卡刷卡后，主动获取解码后的字符串数据信息
            try {

            } catch (Exception e) {
                e.printStackTrace();
                isRun = false;
            }
        }

        @Override
        public boolean handleMessage(Message msg) {
            if (msg.obj!=null){
                updateLogInfo(msg.obj+"");
            }
            return false;
        }

    }


    private ReadMagTask mReadMagTask = null;

    private void startTask() {
        if (mReadMagTask == null) {
            mReadMagTask = new ReadMagTask();
            mReadMagTask.start();
        }
    }

    private void stopTask() {
        if (mReadMagTask != null) {
            mReadMagTask.interrupt();
            mReadMagTask = null;
        }
    }

    /**
     * 设置当前检测进度
     */
    private void setTestRange() {
        StringBuilder sb = new StringBuilder();
        sb.append("磁条读卡:\n");
        sb.append("1:将磁条卡在卡槽中进行刷卡动作\n");
        sb.append("2:等待获取数据信息\n");

        stapInfoTv.setText(sb.toString());
    }

    public void updateLogInfo(String msg) {
        if ("xinzenghuiyuan".equals(intentFlag)){
            Intent intent=new Intent();
            intent.putExtra("cardNo",msg);
            getActivity().setResult(10,intent);
            getActivity().finish();
        }else{
            //msg="20170928084555915325";
            Log.i("info","msg=="+msg);
            vipCardModel.getVip(msg);
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (null != vipCardModel) {
            vipCardModel.clear();
        }
    }
}
