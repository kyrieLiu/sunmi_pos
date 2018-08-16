package ys.app.petproject.nfc;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.nfc.NfcAdapter;
import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import android.nfc.tech.MifareClassic;
import android.nfc.tech.Ndef;
import android.nfc.tech.NfcA;
import android.nfc.tech.NfcB;
import android.nfc.tech.NfcF;
import android.nfc.tech.NfcV;
import android.os.Build;
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

import sunmi.payservicelib.SunmiPayService;
import ys.app.petproject.AppApplication;
import ys.app.petproject.Constants;
import ys.app.petproject.R;


/**
 * Created by liuyin on 2017/9/30.
 */

public class NFCFraggment extends Fragment {

    private TextView stapInfoTv;

    private IsoDep na;
    private View view;
    private String intentFlag;
    private VipCardModel vipCardModel;
    private int vipFlag;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_nfc, null);
        Bundle bundle = getArguments();
        intentFlag = bundle.getString(Constants.intent_flag);
        vipFlag = bundle.getInt(Constants.intent_vip_name);
        vipCardModel = new VipCardModel(this, intentFlag, vipFlag);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        stapInfoTv = (TextView) view.findViewById(R.id.test_content_stap_info);
        setTestRange();
    }

    public void onNewIntent(Intent intent) {
        if (isEnabled()) {
            Tag tag = intent.getParcelableExtra(NfcAdapter.EXTRA_TAG);
            try {
                na = IsoDep.get(tag);
                //na.connect();
                //在这里可以进行nfc交互处理

                String msg=HEX.bytesToHex(tag.getId());
                if (!"93F17B45".equals(msg)){
                    updateLogInfo(msg);
                }
            }catch (Exception e) {
                e.printStackTrace();
                Log.i("info",e.toString());
                Toast.makeText(getActivity(),"查不到相关数据",Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(getActivity(),"NFC不可用",Toast.LENGTH_SHORT).show();
        }
    }

    public boolean isEnabled() {
        return true;
    }

    private void enableDialog(final Context context) {
        AlertDialog.Builder ab = new AlertDialog.Builder(context);
        ab.setTitle("提醒");
        ab.setMessage("手机NFC开关未打开，是否现在去打开？");
        ab.setNeutralButton("否", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        ab.setNegativeButton("是", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                context.startActivity(new Intent(android.provider.Settings.ACTION_WIRELESS_SETTINGS));
                dialog.dismiss();
            }
        });
        ab.create().show();
    }

    private void showMsgDialog(String msg) {
        AlertDialog.Builder ab = new AlertDialog.Builder(getActivity());
        ab.setTitle("提醒");
        ab.setMessage(msg);
        ab.setNeutralButton("确定", new DialogInterface.OnClickListener() {

            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        ab.create().show();
    }

    public void updateLogInfo(String msg) {
        if ("xinzenghuiyuan".equals(intentFlag)) {
            Intent intent = new Intent();
            intent.putExtra("cardNo", msg);
            getActivity().setResult(10, intent);
            getActivity().finish();
        } else {
            //msg="20170928084555915325";
            Log.i("info", "msg==" + msg);
            vipCardModel.getVip(msg);
        }
    }

    /**
     * 设置当前检测进度
     */
    private void setTestRange() {
        StringBuilder sb = new StringBuilder();
        sb.append("NFC读卡:\n");
        sb.append("1、NFC卡放在设备头部带有NFC标志处。\n");
        sb.append("2、观察是否能够获取NFC卡号信息。\n");

        stapInfoTv.setText(sb.toString());
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        vipCardModel.clear();
    }
}
