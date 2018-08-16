package ys.app.petproject.nfc;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.nfc.tech.IsoDep;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.RemoteException;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.sunmi.payservice.hardware.aidl.AidlConstants;
import com.sunmi.payservice.hardware.aidl.HardwareOpt;
import com.sunmi.payservice.hardware.aidl.ReadCardCallback;
import com.sunmi.payservice.hardware.aidl.bean.PayCardInfo;

import ys.app.petproject.AppApplication;
import ys.app.petproject.BaseActivity;
import ys.app.petproject.Constants;
import ys.app.petproject.R;
import ys.app.petproject.widget.timeselector.Utils.TextUtil;

/**
 * 读取magnetic磁条卡信息
 * 
 * @author TIANHUI
 * 
 */
public class MagneticCardActivity extends BaseActivity {

	private String intentFlag;
	private LinearLayout ll_magnetic;
	private ImageView iv_magnetic;
	private LinearLayout ll_nfc;
	private ImageView iv_nfc;
	private MagneticFragment magneticFragment;
	private NFCFraggment nfcFraggment;
	private FragmentManager manager;
	private FragmentTransaction transaction;
	private boolean isNFC=false;
	private int vipFlag;//区别次卡和会员卡

	private IsoDep na;
	private HardwareOpt hardwareOpt;
	private int time;
	private int cardType;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.nfc_normal);
		setBackVisiable();
		ll_magnetic= (LinearLayout) findViewById(R.id.ll_card_magnetic);
		iv_magnetic= (ImageView) findViewById(R.id.iv_card_magnetic);
		iv_nfc= (ImageView) findViewById(R.id.iv_card_nfc);
		ll_nfc= (LinearLayout) findViewById(R.id.ll_card_nfc);

		intentFlag = getIntent().getStringExtra(Constants.intent_flag);
		vipFlag=getIntent().getIntExtra(Constants.intent_vip_name,0);
		if (vipFlag==0){
			setTitle("会员卡");
		}else{
			setTitle("次卡");
		}
		iv_magnetic.setSelected(true);
		iv_nfc.setSelected(false);
		ll_magnetic.setEnabled(false);
		ll_nfc.setEnabled(true);

		initView();
		listenView();//监听状态
		setBgWhiteStatusBar();

		initData();
		refreshData();
	}

	private void initData() {
		hardwareOpt = AppApplication.mHardwareOpt;
		cardType = AidlConstants.CardType.MAG;
		time = 60000;
	}

	/**
	 * 刷卡监听
	 */
	private void refreshData() {
		// 终止检卡
		try {
			hardwareOpt.cancelCheckCard();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		String message;
		if (time > 0) {
			try {
				hardwareOpt.checkCard(cardType, new ReadCardCallback.Stub() {

					@Override
					public void onCardDetected(PayCardInfo payCardInfo) throws RemoteException {
						Log.e(TAG, "onCardDetected:" + payCardInfo.toString());
						Message message = new Message();
						message.what = 0x01;
						message.obj = payCardInfo;
						mHandler.sendMessage(message);
					}

					@Override
					public void onError(int i, String s) throws RemoteException {
						Log.e(TAG, "onError:" + i + " " + s);
						Message message = new Message();
						message.what = 0x02;
						message.obj = "code:" + i + " message:" + s;
						mHandler.sendMessage(message);
					}

					@Override
					public void onStartCheckCard() throws RemoteException {
						Log.e(TAG, "onStartCheckCard:正在检卡");
					}

				}, time);
			} catch (RemoteException e) {
				e.printStackTrace();
				message = "检卡失败：" + e;
				showMsgDialog(message);
			}
		} else {
			message = "时间错误，请重新输入";
			showMsgDialog(message);
		}
	}

	private void initView(){
		Bundle bundle=new Bundle();
		bundle.putString(Constants.intent_flag,intentFlag);
		bundle.putInt(Constants.intent_vip_name,vipFlag);
		magneticFragment = new MagneticFragment();
		magneticFragment.setArguments(bundle);
		nfcFraggment = new NFCFraggment();
		nfcFraggment.setArguments(bundle);
		manager = getSupportFragmentManager();
		transaction = manager.beginTransaction();
		transaction.replace(R.id.fl_nfc_container, magneticFragment);
		transaction.commit();
	}

	private void listenView(){
		ll_magnetic.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				iv_magnetic.setSelected(true);
				iv_nfc.setSelected(false);
				ll_magnetic.setEnabled(false);
				ll_nfc.setEnabled(true);
				replaceFragment(magneticFragment);
				isNFC=false;
				cardType = AidlConstants.CardType.MAG;
				refreshData();
			}
		});
		ll_nfc.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				iv_magnetic.setSelected(false);
				iv_nfc.setSelected(true);
				ll_magnetic.setEnabled(true);
				ll_nfc.setEnabled(false);
				replaceFragment(nfcFraggment);
				isNFC=true;
				cardType = AidlConstants.CardType.MIFARE;
				refreshData();
			}
		});
	}
	private void replaceFragment(Fragment fragment){
		FragmentTransaction transaction = manager.beginTransaction();
		transaction.replace(R.id.fl_nfc_container,fragment);
		transaction.commit();
	}

	private Handler mHandler = new Handler() {

		@Override
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
			switch (msg.what) {
				case 0x01:
					PayCardInfo cardInfo = (PayCardInfo) msg.obj;
					if (isNFC) {
						if(TextUtil.isEmpty(cardInfo.uuid)){
							showToast("会员卡号为空，请重试。。。");
							refreshData();
						}else {
							nfcFraggment.updateLogInfo(cardInfo.uuid);
						}
					}else {
						if (!TextUtil.isEmpty(cardInfo.cardNo)){
							magneticFragment.updateLogInfo(cardInfo.cardNo);
						}else if (!TextUtil.isEmpty(cardInfo.track2)){
							magneticFragment.updateLogInfo(cardInfo.track2);
						}else{
							showToast("会员卡号为空，请重试。。。");
							refreshData();
						}
					}
					break;
				case 0x02:
					String str = "检卡失败：" + msg.obj;
					if (hardwareOpt!=null)refreshData();
//					showMsgDialog(str);
					break;
			}
		}

	};

	private void showMsgDialog(String msg) {
		AlertDialog.Builder ab = new AlertDialog.Builder(this);
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

	@TargetApi(Build.VERSION_CODES.GINGERBREAD_MR1)
	@SuppressLint("NewApi")
	@Override
	protected void onNewIntent(Intent intent) {
		if (isNFC){
			Log.i("info","刷新");
			nfcFraggment.onNewIntent(intent);
		}

		super.onNewIntent(intent);
	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
		clear();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		clear();
	}

	private void clear() {
		try {
			if (hardwareOpt != null)hardwareOpt.cancelCheckCard();
			hardwareOpt = null;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
