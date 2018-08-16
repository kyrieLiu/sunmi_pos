package ys.app.petproject.shangmi.screen.utils;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.ref.WeakReference;

import sunmi.ds.DSKernel;
import sunmi.ds.SF;
import sunmi.ds.callback.IConnectionCallback;
import sunmi.ds.callback.IReceiveCallback;
import sunmi.ds.callback.ISendCallback;
import sunmi.ds.data.DSData;
import sunmi.ds.data.DSFile;
import sunmi.ds.data.DSFiles;
import sunmi.ds.data.DataPacket;

/**
 * Created by liuyin on 2018/3/8.
 * 大屏与小屏交互的工具
 */

public class ScreenConnectUtils {
    private Activity activity;
    private DSKernel mDSKernel = null;
    private MyHandler myHandler;

    private static ScreenConnectUtils utils;

    public static ScreenConnectUtils getInstance() {
        if (utils == null) {
            utils = new ScreenConnectUtils();
        }
        return utils;
    }

    ;

    public ScreenConnectUtils setContext(Activity activity) {
        this.activity = activity;
        myHandler = new MyHandler(activity);
        if (mDSKernel != null) {
            mDSKernel.checkConnection();
        } else {
            initSdk();
        }
        return utils;
    }


    private ScreenConnectUtils() {
    }


    private IConnectionCallback mIConnectionCallback = new IConnectionCallback() {
        @Override
        public void onDisConnect() {
            Message message = new Message();
            message.what = 1;
            message.obj = "与远程服务连接中断";
            myHandler.sendMessage(message);
        }

        @Override
        public void onConnected(ConnState state) {
//            Message message = new Message();
//            message.what = 1;
//            switch (state) {
//                case AIDL_CONN:
//                    message.obj = "与远程服务绑定成功";
//                    break;
//                case VICE_SERVICE_CONN:
//                    message.obj = "与副屏服务通讯正常";
//                    break;
//                case VICE_APP_CONN:
//                    message.obj = "与副屏app通讯正常";
//                    break;
//                default:
//                    break;
//            }
//            myHandler.sendMessage(message);
        }
    };

    private IReceiveCallback mIReceiveCallback = new IReceiveCallback() {
        @Override
        public void onReceiveData(DSData data) {
        }

        @Override
        public void onReceiveFile(DSFile file) {
        }

        @Override
        public void onReceiveFiles(DSFiles files) {
        }

        @Override
        public void onReceiveCMD(DSData cmd) {
        }
    };

    private void initSdk() {
        mDSKernel = DSKernel.newInstance();
        mDSKernel.init(activity, mIConnectionCallback);
        mDSKernel.addReceiveCallback(mIReceiveCallback);
        mDSKernel.removeReceiveCallback(mIReceiveCallback);
    }

    private static class MyHandler extends Handler {
        private WeakReference<Activity> mActivity;

        public MyHandler(Activity activity) {
            mActivity = new WeakReference<Activity>(activity);
        }

        @Override
        public void handleMessage(Message msg) {
            if (mActivity.get() != null && !mActivity.get().isFinishing()) {
                switch (msg.what) {
                    case 1://消息提示用途
                        Toast.makeText(mActivity.get(), msg.obj + "", Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        break;
                }
            }
        }

    }

    //显示文本信息
    public void sendTextMessage(String title, String content) {
        JSONObject textJson = new JSONObject();
        try {
            textJson.put("title", title);//title为上面一行的标题内容
            textJson.put("content", content);//content为下面一行的内容
            String jsonStr = textJson.toString();
            DataPacket packet = UPacketFactory.buildShowText(DSKernel.getDSDPackageName(), jsonStr, new ISendCallback() {
                @Override
                public void onSendSuccess(long taskId) {
                }

                @Override
                public void onSendFail(int errorId, String errorInfo) {
                    Message message = new Message();
                    message.what = 1;
                    message.obj = "副屏信息发送失败";
                    myHandler.sendMessage(message);
                }

                @Override
                public void onSendProcess(long totle, long sended) {
                }
            });//第一个参数是接收数据的副显应用的包名，这里参照Demo就可以,第二个参数是要显示的内容字符串，第三个参数为结果回调。

            mDSKernel.sendData(packet);//调用sendData方法发送文本


        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    //显示待支付信息
    public void sendPayMessage(String payMethod, String money, String path) {
        JSONObject json = new JSONObject();
        try {
            json.put("title", payMethod);
            json.put("content", money);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        mDSKernel.sendFile(DSKernel.getDSDPackageName(), json.toString(), path, new ISendCallback() {
            @Override
            public void onSendSuccess(long l) {
                //显示图片
                try {
                    JSONObject json = new JSONObject();
                    json.put("dataModel", "QRCODE");
                    json.put("data", "default");
                    mDSKernel.sendCMD(SF.DSD_PACKNAME, json.toString(), l, null);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onSendFail(int i, String s) {
                Message message = new Message();
                message.what = 1;
                message.obj = "副屏信息发送失败";
                myHandler.sendMessage(message);
            }

            @Override
            public void onSendProcess(long l, long l1) {

            }
        });
    }

    public void showWelcomeMessage() {
        try {
            JSONObject json = new JSONObject();
            json.put("dataModel", "SHOW_IMG_WELCOME");
            json.put("data", "gaolulin");
            if (mDSKernel!=null)
            mDSKernel.sendCMD(SF.DSD_PACKNAME, json.toString(), -1, null);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }


    public void onPause() { //如果存在activity跳转，需要做清理操作
        if (mDSKernel != null) {
            mDSKernel.onDestroy();
            mDSKernel = null;
        }
    }

}
