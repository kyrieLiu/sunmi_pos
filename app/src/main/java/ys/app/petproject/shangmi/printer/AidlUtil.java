package ys.app.petproject.shangmi.printer;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.widget.Toast;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import woyou.aidlservice.jiuiv5.ICallback;
import woyou.aidlservice.jiuiv5.IWoyouService;
import ys.app.petproject.R;
import ys.app.petproject.SpUtil;
import ys.app.petproject.db.GreenDaoUtils;
import ys.app.petproject.itemmodel.DailySettlementBean;
import ys.app.petproject.model.ChargeResultInfo;
import ys.app.petproject.model.LoginInfo;
import ys.app.petproject.model.OrderInfo;
import ys.app.petproject.utils.AppUtil;
import ys.app.petproject.utils.DateUtil;
import ys.app.petproject.utils.StringUtils;
import ys.app.petproject.widget.timeselector.Utils.TextUtil;

import static ys.app.petproject.shangmi.printer.ESCUtil.ESC;
import static ys.app.petproject.shangmi.printer.ESCUtil.SP;


public class AidlUtil {
    private static final String SERVICE＿PACKAGE = "woyou.aidlservice.jiuiv5";
    private static final String SERVICE＿ACTION = "woyou.aidlservice.jiuiv5.IWoyouService";
    private static final String Device_M1 = "M1";

    private IWoyouService woyouService;
    private static AidlUtil mAidlUtil = new AidlUtil();
    private Context context;

    private AidlUtil() {
    }

    public static AidlUtil getInstance() {
        return mAidlUtil;
    }

    /**
     * 连接服务
     *
     * @param context context
     */
    public void connectPrinterService(Context context) {
        this.context = context.getApplicationContext();
        Intent intent = new Intent();
        intent.setPackage(SERVICE＿PACKAGE);
        intent.setAction(SERVICE＿ACTION);
        context.getApplicationContext().startService(intent);
        context.getApplicationContext().bindService(intent, connService, Context.BIND_AUTO_CREATE);
    }

    /**
     * 断开服务
     *
     * @param context context
     */
    public void disconnectPrinterService(Context context) {
        if (woyouService != null) {
            context.getApplicationContext().unbindService(connService);
            woyouService = null;
        }
    }

    public boolean isConnect() {
        return woyouService != null;
    }

    private ServiceConnection connService = new ServiceConnection() {

        @Override
        public void onServiceDisconnected(ComponentName name) {
            woyouService = null;
        }

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            woyouService = IWoyouService.Stub.asInterface(service);
        }
    };

    public ICallback generateCB(final PrinterCallback printerCallback) {
        return new ICallback.Stub() {
            @Override
            public void onRunResult(boolean isSuccess, int code, String msg) throws RemoteException {

            }

        };
    }

    /**
     * 设置打印浓度
     */
    private int[] darkness = new int[]{0x0600, 0x0500, 0x0400, 0x0300, 0x0200, 0x0100, 0,
            0xffff, 0xfeff, 0xfdff, 0xfcff, 0xfbff, 0xfaff};

    public void setDarkness(int index) {
        if (woyouService == null) {
            Toast.makeText(context, R.string.toast_2, Toast.LENGTH_LONG).show();
            return;
        }

        int k = darkness[index];
        try {
            woyouService.sendRAWData(ESCUtil.setPrinterDarkness(k), null);
            woyouService.printerSelfChecking(null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * 取得打印机系统信息，放在list中
     *
     * @return list
     */
    public List<String> getPrinterInfo() {
        if (woyouService == null) {
            Toast.makeText(context, R.string.toast_2, Toast.LENGTH_LONG).show();
            return null;
        }

        List<String> info = new ArrayList<>();
        try {
            info.add(woyouService.getPrinterSerialNo());
            info.add(woyouService.getPrinterModal());
            info.add(woyouService.getPrinterVersion());
            info.add(woyouService.getPrintedLength() + "");
            info.add("");
            //info.add(woyouService.getServiceVersion());
            PackageManager packageManager = context.getPackageManager();
            try {
                PackageInfo packageInfo = packageManager.getPackageInfo(SERVICE＿PACKAGE, 0);
                if (packageInfo != null) {
                    info.add(packageInfo.versionName);
                    info.add(packageInfo.versionCode + "");
                } else {
                    info.add("");
                    info.add("");
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.printStackTrace();
            }

        } catch (RemoteException e) {
            e.printStackTrace();
        }
        return info;
    }

    /**
     * 初始化打印机
     */
    public void initPrinter() {
        if (woyouService == null) {
            Toast.makeText(context, R.string.toast_2, Toast.LENGTH_LONG).show();
            return;
        }

        try {
            woyouService.printerInit(null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * 打印二维码
     */
    public void printQr(String data, int modulesize, int errorlevel) {
        if (woyouService == null) {
            Toast.makeText(context, R.string.toast_2, Toast.LENGTH_LONG).show();
            return;
        }


        try {
            woyouService.setAlignment(1, null);
            woyouService.printQRCode(data, modulesize, errorlevel, null);
            woyouService.lineWrap(5, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * 打印条形码
     */
    public void printBarCode(String data, int symbology, int height, int width, int textposition) {
        if (woyouService == null) {
            Toast.makeText(context, R.string.toast_2, Toast.LENGTH_LONG).show();
            return;
        }


        try {
            woyouService.printBarCode(data, symbology, height, width, textposition, null);
            woyouService.lineWrap(5, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * 打印文字
     */
    public void printText(String content, float size, boolean isBold, boolean isUnderLine) {
        if (woyouService == null) {
            Toast.makeText(context, R.string.toast_2, Toast.LENGTH_LONG).show();
            return;
        }

        try {
            if (isBold) {
                woyouService.sendRAWData(ESCUtil.boldOn(), null);
            } else {
                woyouService.sendRAWData(ESCUtil.boldOff(), null);
            }

            if (isUnderLine) {
                woyouService.sendRAWData(ESCUtil.underlineWithOneDotWidthOn(), null);
            } else {
                woyouService.sendRAWData(ESCUtil.underlineOff(), null);
            }

            woyouService.printTextWithFont(content, null, size, null);
            woyouService.lineWrap(5, null);
            Log.i("info", "开始打印");
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

    /*
    *打印图片
     */
    public void printBitmap(Bitmap bitmap) {
        if (woyouService == null) {
            Toast.makeText(context, R.string.toast_2, Toast.LENGTH_LONG).show();
            return;
        }

        try {
            woyouService.setAlignment(1, null);
            woyouService.printBitmap(bitmap, null);
            woyouService.lineWrap(5, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * 打印图片和文字按照指定排列顺序
     */
    public void printBitmap(Bitmap bitmap, int orientation) {
        if (woyouService == null) {
            Toast.makeText(context, "服务已断开！", Toast.LENGTH_LONG).show();
            return;
        }

        try {
            if (orientation == 0) {
                woyouService.printBitmap(bitmap, null);
                woyouService.printText("横向排列\n", null);
                woyouService.printBitmap(bitmap, null);
                woyouService.printText("横向排列\n", null);
            } else {
                woyouService.printBitmap(bitmap, null);
                woyouService.printText("\n纵向排列\n", null);
                woyouService.printBitmap(bitmap, null);
                woyouService.printText("\n纵向排列\n", null);
            }
            woyouService.lineWrap(5, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    //设置下划线1点
    public static byte[] underlineWithOneDotWidthOn() {
        byte[] result = new byte[3];
        result[0] = ESC;
        result[1] = 45;
        result[2] = 1;
        return result;
    }

    /**
     * 打印表格
     */
    public void printTable(LinkedList<TableItem> list) {
        if (woyouService == null) {
            Toast.makeText(context, R.string.toast_2, Toast.LENGTH_LONG).show();
            return;
        }

        try {
            for (TableItem tableItem : list) {
                Log.i("kaltin", "printTable: " + tableItem.getText()[0] + tableItem.getText()[1] + tableItem.getText()[2]);
                woyouService.printColumnsText(tableItem.getText(), tableItem.getWidth(), tableItem.getAlign(), null);
            }
            woyouService.lineWrap(5, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /*
    * 空打三行！
     */
    public void print3Line() {
        if (woyouService == null) {
            Toast.makeText(context, R.string.toast_2, Toast.LENGTH_LONG).show();
            return;
        }

        try {
            woyouService.lineWrap(5, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }


    public void sendRawData(byte[] data) {
        if (woyouService == null) {
            Toast.makeText(context, R.string.toast_2, Toast.LENGTH_LONG).show();
            return;
        }

        try {
            woyouService.sendRAWData(data, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    //获取当前的打印模式
    public int getPrintMode() {
        if (woyouService == null) {
            Toast.makeText(context, "服务已断开！", Toast.LENGTH_LONG).show();
            return -1;
        }

        int res;
        try {
            res = woyouService.getPrinterMode();
        } catch (RemoteException e) {
            e.printStackTrace();
            res = -1;
        }
        return res;
    }


    public static final int largeSize = 10 * 2;
    private String mediumSpline = "--------------------------------";
    private int row1 = 16;
    private int row2 = 6;
    private int row3 = 10;

    private int four_row1 = 11;
    private int four_row2 = 4;
    private int four_row3 = 6;
    /**
     * 打印次卡支付小票
     */
    public void printNumOrderPayInformation(OrderInfo mOrderInfo) {
        if(Device_M1.equals( SpUtil.getDeviceModel())){
            Toast.makeText(context,"该机型暂不支持打印",Toast.LENGTH_SHORT).show();
            return;
        }
        if (woyouService == null) {
            Toast.makeText(context, R.string.toast_2, Toast.LENGTH_LONG).show();
            return;
        }

        List<LoginInfo> loginInfos = GreenDaoUtils.getmDaoSession().getLoginInfoDao().loadAll();
        LoginInfo loginInfo = null;
        if (loginInfos != null && loginInfos.size() > 0) {
            loginInfo = loginInfos.get(0);
        }
        try {
            String title = SpUtil.getShopName();
            int sizeTitle = largeSize - length(title);
            // 文字居中需要在前面补足相应空格，后面可以用换行符换行
            String titleStr = getBlankBySize((int) (sizeTitle / 2d)) + title;

            woyouService.sendRAWData(ESCUtil.boldOn(), null);
            woyouService.printTextWithFont(titleStr + "\n", null, 35, null);
            StringBuilder sbTable = new StringBuilder();
            String orderNo = "订单号：" + mOrderInfo.getOrderNo();
            sbTable.append(orderNo + "\n");
            String transactionTime = "交易时间：" + DateUtil.longFormatDate2(mOrderInfo.getOrderTime());
            sbTable.append(transactionTime + "\n");

            if (loginInfo != null) {
                String phone = "";
                if (loginInfo.getPhone() != null) {
                    phone = loginInfo.getPhone();
                }
                String contact = "联系电话：" + phone;
                sbTable.append(contact + "\n");
            }

            int totalCount = 0;
            String headerRow1 = "商品名称";
            String headerRow2 = "数量";
            List<OrderInfo.OrderDetailedListBean> orderDetailedList = mOrderInfo.getOrderDetailedList();
            if (orderDetailedList != null && !orderDetailedList.isEmpty()) {
                List<String> userList = new ArrayList<>();
                for (OrderInfo.OrderDetailedListBean orderBean : orderDetailedList) {
                    if (!userList.contains(orderBean.getUserName())) {
                        userList.add(orderBean.getUserName());
                    }
                }
                StringBuilder userBuilder = new StringBuilder();
                for (String userName : userList) {
                    userBuilder.append(userName + " ");
                }
                String receiveEmployee = "收款员工：" + userBuilder.toString();
                sbTable.append(receiveEmployee + "\n");

                if (loginInfo != null) {
                    String address = loginInfo.getAddress();
                    String addressInformation = "地址：" + address;
                    sbTable.append(addressInformation + "\n");
                }
                sbTable.append(mediumSpline + "\n");
                String str1 = headerRow1 + getBlankBySize((int) (row1 -
                        length(headerRow1)));
                String str2 = getBlankBySize((int) (row3 - length(headerRow2))) + headerRow2;

                String headerStr = str1 + str2;
                sbTable.append(headerStr + "\n");
                sbTable.append(mediumSpline + "\n");
                for (int i = 0; i < orderDetailedList.size(); i++) {
                    OrderInfo.OrderDetailedListBean info = orderDetailedList.get(i);
                    double nameSize = length(info.getName());
                    if (nameSize > row1) {
                        sbTable.append(info.getName() + "\n");
                        String newLineSecond = getBlankBySize(row3 - length(info.getCount() + "")) + info.getCount();
                        String newLineAll = newLineSecond + "\n";
                        sbTable.append(getBlankBySize(row1 ) + newLineAll);
                    } else {
                        // 正常
                        String rowFirst = info.getName() + getBlankBySize(row1 - length(info.getName()));
                        String rowSecond = getBlankBySize(row3 - length(info.getCount() + "")) + info.getCount();
                        sbTable.append(rowFirst + rowSecond + "\n");
                    }
                    totalCount = totalCount + info.getCount();
                }
                sbTable.append(mediumSpline + "\n");
                sbTable.append("商品总数：" + totalCount + "件\n");
                sbTable.append(mediumSpline + "\n");

            }
            String cardNo = "会员卡号：" + mOrderInfo.getVipCardNo();
            sbTable.append(cardNo + "\n");
            String phone = "会员电话：" + StringUtils.hihtPhone(mOrderInfo.getVipPhone());
            sbTable.append(phone + "\n");
            List<OrderInfo.OrderDetailedListBean> list = mOrderInfo.getOrderDetailedList();
            Map<String, List<OrderInfo.OrderDetailedListBean>> map = new HashMap<>();
            for (int i = 0; i < list.size(); i++) {
                List<OrderInfo.OrderDetailedListBean> filterList = new ArrayList<>();
                OrderInfo.OrderDetailedListBean iBean = list.get(i);
                String name = iBean.getName();
                for (int j = 1; j < list.size(); j++) {
                    OrderInfo.OrderDetailedListBean jBean = list.get(j);
                    if (name.equals(jBean.getName())) {
                        filterList.add(jBean);
                        list.remove(jBean);
                    }
                }
                filterList.add(iBean);
                list.remove(iBean);
                i--;
                map.put(name, filterList);
            }
            Iterator<Map.Entry<String, List<OrderInfo.OrderDetailedListBean>>> iterator = map.entrySet().iterator();
            StringBuilder payInfo = new StringBuilder();
            StringBuilder beforeInfo = new StringBuilder();
            StringBuilder afterInfo = new StringBuilder();
            while (iterator.hasNext()) {
                Map.Entry<String, List<OrderInfo.OrderDetailedListBean>> entry = iterator.next();
                String name = entry.getKey();
                List<OrderInfo.OrderDetailedListBean> itemList = entry.getValue();
                int beforNum = -1, afterNum = 10000000;
                for (OrderInfo.OrderDetailedListBean itemBean : itemList) {
                    if (beforNum < itemBean.getBeforeNum()) {
                        beforNum = itemBean.getBeforeNum();
                    }
                    if (afterNum > itemBean.getAfterNum()) {
                        afterNum = itemBean.getAfterNum();
                    }
                }
                beforeInfo.append(" " + name + beforNum + "次");
                afterInfo.append(" " + name + afterNum + "次");
                payInfo.append(" " + name + (beforNum - afterNum) + "次");
            }
            String jine = "支付前该服务剩余次数:" + beforeInfo.toString();
            sbTable.append(jine + "\n");
            String paymentAmountMonkey = "次卡支付:" + payInfo.toString();
            sbTable.append(paymentAmountMonkey + "\n");
            String yue = "支付后该服务剩余次数:" + afterInfo.toString();
            sbTable.append(yue);
            woyouService.sendRAWData(ESCUtil.boldOff(), null);
            woyouService.printTextWithFont(sbTable.toString(), null, 24, null);
            woyouService.lineWrap(5, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * 打印订单小票
     *
     * @param mOrderInfo
     */
    public void printOrderPayInformation( OrderInfo mOrderInfo) {
        if(Device_M1.equals( SpUtil.getDeviceModel())){
            Toast.makeText(context,"该机型暂不支持打印",Toast.LENGTH_SHORT).show();
            return;
        }
        if (woyouService == null) {
            Toast.makeText(context, R.string.toast_2, Toast.LENGTH_LONG).show();
            return;
        }
        try {
            List<LoginInfo> loginInfos = GreenDaoUtils.getmDaoSession().getLoginInfoDao().loadAll();
            LoginInfo loginInfo = null;
            if (loginInfos != null && loginInfos.size() > 0) {
                loginInfo = loginInfos.get(0);
            }

            String title = SpUtil.getShopName();
            int sizeTitle = largeSize - length(title);
            // 文字居中需要在前面补足相应空格，后面可以用换行符换行
            String titleStr = getBlankBySize((int) (sizeTitle / 2d)) + title;
            woyouService.sendRAWData(ESCUtil.boldOn(), null);
            woyouService.printTextWithFont(titleStr + "\n\n", null, 35, null);

            StringBuilder sbTable = new StringBuilder();
            String orderNo = "订单号：" + mOrderInfo.getOrderNo();
            sbTable.append(orderNo + "\n");
            String transactionTime = "交易时间：" + DateUtil.longFormatDate2(mOrderInfo.getOrderTime());
            sbTable.append(transactionTime + "\n");

            if (loginInfo != null) {
                String phone = "";
                if (loginInfo.getPhone() != null) {
                    phone = loginInfo.getPhone();
                }
                String contact = "联系电话：" + phone;
                sbTable.append(contact + "\n");
            }
            // 绘制表格，设定好每列所用宽度
            // 每列转换为可用英文字符长度(加起来要等于对应行长度，如medium字体=mediumSize：32)
            int totalCount = 0;
            String headerRow1 = "商品名称";
            String headerRow2 = "数量";
            String headerRow3 = "会员价";
            String headerRow4 = "售价";
            List<OrderInfo.OrderDetailedListBean> orderDetailedList = mOrderInfo.getOrderDetailedList();
            if (orderDetailedList != null && !orderDetailedList.isEmpty()) {
                List<String> userList = new ArrayList<>();
                for (OrderInfo.OrderDetailedListBean orderBean : orderDetailedList) {
                    if (!userList.contains(orderBean.getUserName())) {
                        userList.add(orderBean.getUserName());
                    }
                }
                StringBuilder userBuilder = new StringBuilder();
                for (String userName : userList) {
                    userBuilder.append(userName + " ");
                }
                String receiveEmployee = "收款员工：" + userBuilder.toString();
                sbTable.append(receiveEmployee + "\n");

                if (loginInfo != null) {
                    String address = loginInfo.getAddress();
                    String addressInformation = "地址：" + address;
                    sbTable.append(addressInformation + "\n");
                }
                sbTable.append(mediumSpline + "\n");
                String str1 = headerRow1 + getBlankBySize(four_row1 - 1 - length(headerRow1));
                String str2 = headerRow2 + getBlankBySize(four_row2 + 2 - length(headerRow2));
                String str3 = headerRow3 + getBlankBySize(four_row3 + 2 - length(headerRow3));
                String str4 = headerRow4;
                //设置小票是否展示会员价
                String headerStr = "";
                if (SpUtil.getVipShowState()){
                     headerStr = str1 + str2 + str3 + str4;
                }else {
                    String emptyStr =  getBlankBySize(four_row2 + 5);
                    headerStr = str1 + emptyStr + str2 + str4;
                }
                sbTable.append(headerStr + "\n");
                sbTable.append(mediumSpline + "\n");
                for (OrderInfo.OrderDetailedListBean bean : orderDetailedList) {
                    String count=bean.getCount() + "";
                    String name=bean.getName();
                    String vipPrice = "￥" + bean.getVipAmt();
                    String price="";
                    if (1 == bean.getIsGift()) {
                        price = "(赠品)";
                    } else {
                        price = "￥" + AppUtil.formatStandardMoney(bean.getVipPrice());
                    }
                    totalCount = totalCount + bean.getCount();
                    double nameSize = length(name);
                    int tempRow = four_row1;
                    if (!SpUtil.getVipShowState()){
                        tempRow = four_row1 + four_row2 + 2;
                    }
                    if (nameSize > tempRow) {
                        // 列内容长度大于最大列长度,当成一行内容（换行）
                        sbTable.append(name + "\n");
                        // 数量和价格不会超过最大列宽，就不判断内容是否超出了
                        String newLineSecond = count + getBlankBySize(four_row2  - length(count));
                        String newLineThird = vipPrice + getBlankBySize(four_row3  - length(vipPrice));
                        String newLineEnd = price + "\n";
                        //设置小票是否展示会员价
                        String newLineAll = "";
                        if (SpUtil.getVipShowState()){
                            newLineAll = newLineSecond + newLineThird + newLineEnd;
                        }else {
                            newLineAll = getBlankBySize(length(newLineThird)) + newLineSecond + newLineEnd;
                        }
                        // 左边补足row1长度空格
                        sbTable.append(getBlankBySize(four_row1) + newLineAll);
                    } else {
                        // 正常
                        String rowFirst = name + getBlankBySize(four_row1 - length(name));
                        String rowSecond = count + getBlankBySize((int) (four_row2  - length(count)));
                        String rowThird = vipPrice + getBlankBySize((int) (four_row3  - length(vipPrice)));
                        // 最后直接换行就可以了
                        String rowEnd = price + "\n";
                        //设置小票是否展示会员价
                        String rowAll = "";
                        if (SpUtil.getVipShowState()){
                            rowAll = rowFirst + rowSecond + rowThird + rowEnd;
                        }else {
                            String emptyStr = getBlankBySize(four_row1 + four_row2 + 5 - length(name));
                            rowAll = rowFirst + emptyStr + rowSecond + rowEnd;
                        }
                        sbTable.append(rowAll);
                    }
                }
                sbTable.append(mediumSpline + "\n");
                sbTable.append("商品总数：" + totalCount + "件\n");
                sbTable.append("消费金额：" + AppUtil.formatStandardMoney(mOrderInfo.getRealAmt()) + "元\n");
                sbTable.append(mediumSpline + "\n");
            }
            if (mOrderInfo.getVipUserId()>0) {
                String cardNo = "会员卡号：" + mOrderInfo.getVipCardNo();
                sbTable.append(cardNo + "\n");
                String phone = "会员电话：" + StringUtils.hihtPhone(mOrderInfo.getVipPhone());
                sbTable.append(phone + "\n");
                String favouriteAmt = "本次会员优惠：" + String.valueOf(mOrderInfo.getFavouredAmt()) + "元";
                sbTable.append(favouriteAmt + "\n");
//                String jine = "支付前金额：" + AppUtil.formatStandardMoney(mOrderInfo.getBeforeAmt()) + "元";
//                sbTable.append(jine + "\n");
            } else if (mOrderInfo.getFavouredAmt()>0) {
                String favouriteAmt = "本次会员优惠：" + String.valueOf(mOrderInfo.getFavouredAmt()) + "元";
                sbTable.append(favouriteAmt + "\n");
            }
            String paymentAmountMonkey = "实付金额：" + mOrderInfo.getRealAmt() + "元";
            sbTable.append(paymentAmountMonkey + "\n");
            if (mOrderInfo.getVipUserId()>0) {
                String yue = "卡内余额：" + AppUtil.formatStandardMoney(mOrderInfo.getAfterAmt()) + "元";
                sbTable.append(yue + "\n");
            }
            woyouService.sendRAWData(ESCUtil.boldOff(), null);
            woyouService.printTextWithFont(sbTable.toString(), null, 24, null);
            woyouService.lineWrap(5, null);

        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * 打印充值小票
     *
     * @param chargeInfo
     */
    public void printChargePayInformation(ChargeResultInfo chargeInfo, ChargeResultInfo.OrderDetailedListBean chargeDetail) {
        if(Device_M1.equals( SpUtil.getDeviceModel())){
            Toast.makeText(context,"该机型暂不支持打印",Toast.LENGTH_SHORT).show();
            return;
        }
        if (woyouService == null) {
            Toast.makeText(context, R.string.toast_2, Toast.LENGTH_LONG).show();
            return;
        }
        try {
            List<LoginInfo> loginInfos = GreenDaoUtils.getmDaoSession().getLoginInfoDao().loadAll();
            LoginInfo loginInfo = null;
            if (loginInfos != null && loginInfos.size() > 0) {
                loginInfo = loginInfos.get(0);
            }
            String title;
            if (chargeInfo.getIsClassification() == 1) title = "次卡充值";
             else title = "会员充值";

            int sizeTitle = largeSize - length(title);
            // 文字居中需要在前面补足相应空格，后面可以用换行符换行
            String titleStr = getBlankBySize((int) (sizeTitle / 2d)) + title;

            woyouService.sendRAWData(ESCUtil.boldOn(), null);
            woyouService.printTextWithFont(titleStr + "\n\n", null, 35, null);
            StringBuilder sbTable = new StringBuilder();
            String shopName = "商家名称：" + SpUtil.getShopName();
            sbTable.append(shopName + "\n");
            String userName = chargeInfo.getRechargeList().get(0).getUserName();
            if (userName != null) {
                sbTable.append("收款人员: " + userName + "\n");
            }
            String orderNo = "订单号：" + chargeInfo.getOrderNo();
            sbTable.append(orderNo + "\n");
            if (loginInfo != null) {
                String phone = "";
                if (loginInfo.getPhone() != null) {
                    phone = loginInfo.getPhone();
                }
                String contact = "联系电话：" + phone;
                sbTable.append(contact + "\n");
            }
            sbTable.append(mediumSpline + "\n");

            String cardNo = "会员卡号：" + chargeInfo.getVipCardNo();
            sbTable.append(cardNo + "\n");
            String phone = "会员电话：" + StringUtils.hihtPhone(chargeInfo.getVipPhone());
            sbTable.append(phone + "\n");
            String name = "会员姓名：" + chargeInfo.getVipName();
            sbTable.append(name + "\n");
            String time = "充值时间：" + DateUtil.longFormatDate2(chargeInfo.getPayedTime()) + "\n";
            sbTable.append(time + mediumSpline + "\n");
            String beforeAmt = "充值前金额：" + AppUtil.formatStandardMoney(chargeInfo.getBeforeAmt());
            sbTable.append(beforeAmt + "\n");
            String realAmt = "充值金额：" + AppUtil.formatStandardMoney(chargeInfo.getRealAmt());
            sbTable.append(realAmt + "\n");
            double presentAmt = chargeDetail.getPresentAmt();
            if (presentAmt > 0) {
                String presentMoney = "赠送金额：" + AppUtil.formatStandardMoney(presentAmt);
                sbTable.append(presentMoney + "\n");
            }
            String afterAmt = "充值后余额：" + AppUtil.formatStandardMoney(chargeInfo.getAfterAmt());
            sbTable.append(afterAmt);
            woyouService.sendRAWData(ESCUtil.boldOff(), null);
            woyouService.printTextWithFont(sbTable.toString(), null, 24, null);
            woyouService.lineWrap(5, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * 打印单件退款单
     *
     * @param orderInfo
     */
    public void printRefoundItemInformation(OrderInfo.OrderDetailedListBean orderInfo) {
        if(Device_M1.equals( SpUtil.getDeviceModel())){
            Toast.makeText(context,"该机型暂不支持打印",Toast.LENGTH_SHORT).show();
            return;
        }

        String title = "单品退款单";
        int sizeTitle = largeSize - length(title);
        // 文字居中需要在前面补足相应空格，后面可以用换行符换行
        String titleStr = getBlankBySize((int) (sizeTitle / 2d)) + title;
        try {
            woyouService.sendRAWData(ESCUtil.boldOn(), null);
            woyouService.printTextWithFont(titleStr + "\n\n", null, 35, null);
            StringBuilder sbTable = new StringBuilder();
            sbTable.append("商家名称: " + SpUtil.getShopName() + "\n");
            double realMoney = AppUtil.getRealMoney(orderInfo.getVipUserId(), orderInfo.getIsPromotion(), orderInfo.getIsFold(), orderInfo.getCountVipMoney(), orderInfo.getCountPromotionMoney(), orderInfo.getCountMoney());
            String moneyStr = "退款金额: " + realMoney + "元";
            sbTable.append(moneyStr + "\n");
            if (orderInfo.getVipUserId() > 0) {
                sbTable.append("退款方式: 会员卡\n");
            } else {
                sbTable.append("退款方式: 线下支付\n");
            }
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String time = format.format(new Date());
            sbTable.append("退款时间: " + time + "\n");
            sbTable.append("交易单号: " + orderInfo.getOrderId() + "\n");
            woyouService.sendRAWData(ESCUtil.boldOff(), null);
            woyouService.printTextWithFont(sbTable.toString(), null, 24, null);
            woyouService.lineWrap(5, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * 打印退款单
     *
     * @param orderInfo
     */
    public void printRefoundInformation(OrderInfo orderInfo) {
        if(Device_M1.equals( SpUtil.getDeviceModel())){
            Toast.makeText(context,"该机型暂不支持打印",Toast.LENGTH_SHORT).show();
            return;
        }
        String title = "退款单";
        int sizeTitle = largeSize - length(title);
        // 文字居中需要在前面补足相应空格，后面可以用换行符换行
        String titleStr = getBlankBySize((int) (sizeTitle / 2d)) + title;
        try {
            woyouService.sendRAWData(ESCUtil.boldOn(), null);
            woyouService.printTextWithFont(titleStr + "\n\n", null, 35, null);
            StringBuilder sbTable = new StringBuilder();
            sbTable.append("商家名称: " + SpUtil.getShopName() + "\n");
            String moneyStr = "退款金额: " + orderInfo.getRealAmt() + "元";
            sbTable.append(moneyStr + "\n");
            sbTable.append("支付方式: " + AppUtil.getPayType(orderInfo.getPayedMethod()) + "\n");
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            String time = format.format(new Date());
            sbTable.append("退款时间: " + time + "\n");
            sbTable.append("交易单号: " + orderInfo.getOrderNo() + "\n");
            woyouService.sendRAWData(ESCUtil.boldOff(), null);
            woyouService.printTextWithFont(sbTable.toString(), null, 24, null);
            woyouService.lineWrap(5, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * 日结打印
     */
    public void printDailySettlement(DailySettlementBean bean) {
        if(Device_M1.equals( SpUtil.getDeviceModel())){
            Toast.makeText(context,"该机型暂不支持打印",Toast.LENGTH_SHORT).show();
            return;
        }
        try {
            List<DailySettlementBean.CommodityListBean> commodityList = bean.getCommodityList();
            StringBuilder sbTable = new StringBuilder();

            if (commodityList.size() > 0) {
                String title = "营业额";
                int sizeTitle = largeSize - length(title);
                String titleStr = getBlankBySize((int) (sizeTitle / 2d)) + title;
                woyouService.sendRAWData(ESCUtil.boldOn(), null);
                woyouService.printTextWithFont(titleStr + "\n\n", null, 35, null);

                sbTable.append(mediumSpline + "\n");

                String headerRow1 = "名称";
                String headerRow2 = "数量";
                String headerRow3 = "金额";
                String str1 = headerRow1 + getBlankBySize( row1-1 - length(headerRow1));
                String str2 = headerRow2 + getBlankBySize(row2 +2 - length(headerRow2));
                String str3 = headerRow3;
                String headerStr = str1 + str2 + str3;
                sbTable.append(headerStr + "\n");
                sbTable.append(mediumSpline + "\n");
                BigDecimal turnOverMoney = new BigDecimal(0);

                for (int i = 0; i < commodityList.size(); i++) {
                    DailySettlementBean.CommodityListBean info = commodityList.get(i);
                    sbTable = getBuilder(sbTable, info.getName(), info.getMoney(), info.getNumber());
                    turnOverMoney = add(turnOverMoney, info.getMoney());
                }
                List<DailySettlementBean.ProductListBean> productList = bean.getProductList();
                for (int i = 0; i < productList.size(); i++) {
                    DailySettlementBean.ProductListBean info = productList.get(i);
                    sbTable = getBuilder(sbTable, info.getName(), info.getMoney(), info.getNumber());
                    turnOverMoney = add(turnOverMoney, info.getMoney());
                }
                sbTable.append(mediumSpline + "\n");
                sbTable.append("营业额总计：" + turnOverMoney + "元\n\n\n");
                woyouService.sendRAWData(ESCUtil.boldOff(), null);
                woyouService.printTextWithFont(sbTable.toString(), null, 24, null);
            }

            List<DailySettlementBean.RechargeListBean> rechargeList = bean.getRechargeList();
            if (rechargeList.size() > 0) {
                String title = "充值";
                int sizeTitle = largeSize - length(title);
                String titleStr = getBlankBySize((int) (sizeTitle / 2d)) + title;
                woyouService.sendRAWData(ESCUtil.boldOn(), null);
                woyouService.printTextWithFont(titleStr + "\n\n", null, 35, null);
                sbTable.delete(0,sbTable.length());
                BigDecimal rechargeMoney = new BigDecimal(0);

                for (int i = 0; i < rechargeList.size(); i++) {
                    DailySettlementBean.RechargeListBean rechargeBean = rechargeList.get(i);
                    String rowFirst = rechargeBean.getName() + getBlankBySize(14 - length(rechargeBean.getName()));
                    String rowSecond = rechargeBean.getMoney() + getBlankBySize(row2 - length(rechargeBean.getMoney() + ""));
                    sbTable.append(rowFirst + rowSecond + "元\n");
                    rechargeMoney = add(rechargeMoney, rechargeBean.getMoney());
                }
                sbTable.append(mediumSpline + "\n");
                sbTable.append("充值总计：" + rechargeMoney + "元\n\n\n");
                woyouService.sendRAWData(ESCUtil.boldOff(), null);
                woyouService.printTextWithFont(sbTable.toString(), null, 24, null);
            }
            List<DailySettlementBean.OrderListBean> runList = bean.getOrderList();
            if (runList.size() > 0) {
                String title = "流水";
                int sizeTitle = largeSize - length(title);
                String titleStr = getBlankBySize((int) (sizeTitle / 2d)) + title;
                woyouService.sendRAWData(ESCUtil.boldOn(), null);
                woyouService.printTextWithFont(titleStr + "\n\n", null, 35, null);

                sbTable.delete(0,sbTable.length());
                BigDecimal orderMoney = new BigDecimal(0);
                for (int i = 0; i < runList.size(); i++) {
                    DailySettlementBean.OrderListBean orderBean = runList.get(i);
                    String rowFirst = orderBean.getName() + getBlankBySize(14 - length(orderBean.getName()));
                    String rowSecond = orderBean.getMoney() + getBlankBySize(row2 - length(orderBean.getMoney() + ""));
                    sbTable.append(rowFirst + rowSecond + "元\n");
                    orderMoney = add(orderMoney, orderBean.getMoney());
                }
                sbTable.append(mediumSpline + "\n");
                sbTable.append("流水总计：" + orderMoney + "元");
                woyouService.sendRAWData(ESCUtil.boldOff(), null);
                woyouService.printTextWithFont(sbTable.toString(), null, 24, null);
            }
            woyouService.lineWrap(5, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    //打印寄养信息
    public void printAgreement(String content,String title) {
        try {
            woyouService.sendRAWData(ESCUtil.boldOn(), null);
            int sizeTitle = largeSize - length(title);
            String titleStr = getBlankBySize((int) (sizeTitle / 2d)) + title;
            woyouService.printTextWithFont(titleStr + "\n\n", null, 40, null);
            woyouService.sendRAWData(ESCUtil.boldOff(), null);
            woyouService.printTextWithFont(content + "\n\n", null, 25, null);
            woyouService.lineWrap(3, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * 单行打印文字
      * @param content  打印的内容
     * @param fontSize  字体大小
     * @param isUnderline  是否加下划线
     */
    public void printAgreement(String content,int fontSize,boolean isUnderline,boolean isBoldOn) {
        try {
            if (TextUtil.isEmpty(content.trim())){
                return;
            }
            if (isBoldOn){
                woyouService.sendRAWData(ESCUtil.boldOn(), null);
            }else {
                woyouService.sendRAWData(ESCUtil.boldOff(), null);
            }
            if (isUnderline){
                woyouService.sendRAWData(ESCUtil.underlineWithOneDotWidthOn(),null);
            }else {
                woyouService.sendRAWData(ESCUtil.underlineOff(),null);
            }
            woyouService.printTextWithFont(content, null, fontSize, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * 打印标题title
     * @param title
     */
    public void printTitle(String title){
        try {
            woyouService.sendRAWData(ESCUtil.boldOn(), null);
            int sizeTitle = largeSize - length(title);
            String titleStr = getBlankBySize((int) (sizeTitle / 2d)) + title;
            woyouService.printTextWithFont(titleStr + "\n\n", null, 40, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /**
     * 打印均分字符串
     * @param part1  字符串一
     * @param part2  字符串二
     */
    public void printPartTwo(String part1,String part2,int fontSize,boolean isUnderline){
        try {
            woyouService.sendRAWData(ESCUtil.boldOff(), null);
            String str=part1+getBlankBySize(16-length(part1))+part2;
            if (isUnderline){
                woyouService.sendRAWData(ESCUtil.underlineWithOneDotWidthOn(),null);
            }else {
                woyouService.sendRAWData(ESCUtil.underlineOff(),null);
            }
            woyouService.printTextWithFont(str, null, fontSize, null);
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }

    private StringBuilder getBuilder(StringBuilder builder, String name, double money, int count) {
        double nameSize = length(name);
        if (nameSize > row1) {
            // 列内容长度大于最大列长度,当成一行内容（换行）
            builder.append(name + "\n");
            // 数量和价格不会超过最大列宽，就不判断内容是否超出了
            String newLineSecond = money + "元"+getBlankBySize(row2 - length(count + ""));
            String newLineEnd = money + "\n";
            String newLineAll = newLineSecond + newLineEnd;
            // 左边补足row1长度空格
            builder.append(getBlankBySize(row1 ) + newLineAll);
        } else {
            // 正常
            String rowFirst = name + getBlankBySize(row1 - length(name));
            String rowSecond = count + getBlankBySize(row2 - length(count + ""));
            // 最后直接换行就可以了
            String rowEnd = money + "元\n";
            builder.append(rowFirst + rowSecond + rowEnd);
        }
        return builder;
    }

    private String getBlankBySize(int size) {
        String resultStr = "";
        for (int i = 0; i < size; i++) {
            resultStr += " ";
        }
        return resultStr;
    }

    private int length(String s) {
        if (s == null)
            return 0;
        char[] c = s.toCharArray();
        int len = 0;
        for (int i = 0; i < c.length; i++) {
            len++;
            if (!isLetter(c[i])) {
                len++;
            }
        }
        return len;
    }

    private boolean isLetter(char c) {
        int k = 0x80;
        return c / k == 0 ? true : false;
    }

    public BigDecimal add(BigDecimal b1, double v2) {
        BigDecimal b2 = new BigDecimal(Double.toString(v2));
        return b1.add(b2);
    }


}
