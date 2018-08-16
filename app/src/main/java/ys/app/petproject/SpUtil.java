package ys.app.petproject;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.app.NavUtils;

/**
 * Created by lyy on 2017/2/6 14:42.
 * email：2898049851@qq.com
 */

public class SpUtil {
    private static final Context mcontext;
    public static final String Share_Preferences_Name_Mode_Private = "sp_private";
    public static final String Key_Is_Login = "Key_Is_Login";// 是否已经登录
    public static final String Key_Employee_Id = "Key_Employee_Id";//登录员工Id
    public static final String Key_Device_Mcode = "Key_Device_Mcode";//设备店铺Id
    public static final String Key_Login_Time = "Key_Login_Time";//设置登陆时间
    public static final String Key_equipment_shop_id="Key_equipment_shop_id";
    public static final String Key_version_type = "Key_version_type";//设置是否测试版
    public static final String Key_headOffice_Id="Key_headOffice_Id";//总店ID
    public static final String Key_branch_Id="Key_branch_Id";//分店ID
    private static final String Key_shop_name="Key_shop_name";//店铺名称
    private static final String Device_Model="Device_Model";//设备系统型号

    public static final String Key_SAND_mchNo="Key_SAND_mchNo";
    public static final String Key_SAND_key="Key_SAND_key";
    public static final String Key_Is_Modular="Key_Is_Modular";//判断是否是模块化 1：是，0：不是
    public static final String Key_Show_Vip_Price="Key_Show_Vip_Price";//小票是否展示会员价

    static {
        mcontext = AppApplication.getInstance().getApplicationContext();
    }

    /**
     * 该配置文件被自己的应用程序访问
     */
    public static SharedPreferences getPreferences() {
        if (mcontext != null) {
            return mcontext.getSharedPreferences(
                    Share_Preferences_Name_Mode_Private,
                    Context.MODE_PRIVATE);
        }
        return null;
    }

    /**
     * 设置是否已经登录
     *
     * @param flag
     * @return
     */
    public static boolean setIsLogin(boolean flag) {
        if (getPreferences() != null) {
            return getPreferences().edit()
                    .putBoolean(Key_Is_Login, flag).commit();
        }
        return false;
    }

    /**
     * 获取是否已经登录
     *
     * @return
     */
    public static boolean getIsLogin() {
        if (getPreferences() != null) {
            return getPreferences().getBoolean(Key_Is_Login, false);
        }
        return false;
    }


    /**
     *
     * 设置商铺Id
     *
     * @param shopId
     * @return
     */
    public static boolean setShopId(String shopId) {
        if (getPreferences() != null) {
            return getPreferences().edit().putString(Key_equipment_shop_id, shopId).commit();
        }
        return false;
    }


    /**
     * 获取商铺Id
     *
     * @return
     */
    public static String getShopId() {
        if (getPreferences() != null) {
            return getPreferences().getString(Key_equipment_shop_id, "");
        }
        return "";
    }
    /**
     * 总店ID
     * @param headOfficeId
     */
    public static boolean setHeadOfficeId(int headOfficeId) {
        if (getPreferences() != null) {
            return getPreferences().edit().putInt(Key_headOffice_Id, headOfficeId).commit();
        }
        return false;

    }
    /**
     * 获取总店ID
     */
    public static int getHeadOfficeId() {
        if (getPreferences() != null) {
            return getPreferences().getInt(Key_headOffice_Id, -1);
        }
        return -1;
    }

    /**
     * 分店ID
     * @param branchId
     */
    public static boolean setBranchId(int branchId) {
        if (getPreferences() != null) {
            return getPreferences().edit().putInt(Key_branch_Id, branchId).commit();
        }
        return false;

    }
    /**
     * 获取分店ID
     *
     * @return
     */
    public static int getBranchId() {
        if (getPreferences() != null) {
            return getPreferences().getInt(Key_branch_Id, -1);
        }
        return -1;
    }


    /**
     * 设置登录ID
     *
     * @return
     */
    public static boolean setEmployeeId(long id) {
        if (getPreferences() != null) {
            return getPreferences().edit()
                    .putLong(Key_Employee_Id, id).commit();
        }
        return false;
    }

    /**
     * 获取员ID
     *
     * @return
     */
    public static long getEmployeeId() {
        if (getPreferences() != null) {
            return getPreferences().getLong(Key_Employee_Id, 0);
        }
        return 0;
    }


    /**
     * 设置店铺Id
     *
     * @return
     */
    public static boolean setDeviceMcode(String mCode) {
        if (getPreferences() != null) {
            return getPreferences().edit()
                    .putString(Key_Device_Mcode, mCode).commit();
        }
        return false;
    }

    /**
     * 获取店铺ID
     *
     * @return
     */
    public static String getDeviceMcode() {
        if (getPreferences() != null) {
            return getPreferences().getString(Key_Device_Mcode, null);
        }
        return null;
    }

    /**
     * 设置店铺名称
     *
     * @return
     */
    public static boolean setShopName(String shopName) {
        if (getPreferences() != null) {
            return getPreferences().edit()
                    .putString(Key_shop_name, shopName).commit();
        }
        return false;
    }

    /**
     * 获取店铺名称
     *
     * @return
     */
    public static String getShopName() {
        if (getPreferences() != null) {
            return getPreferences().getString(Key_shop_name,"");
        }
        return "";
    }

    //存储杉德商户号
    public static boolean setSandMchNo(String mchNo) {
        if (getPreferences() != null) {
            return getPreferences().edit()
                    .putString(Key_SAND_mchNo, mchNo).commit();
        }
        return false;
    }
    public static String getSandMchNo() {
        if (getPreferences() != null) {
            return getPreferences().getString(Key_SAND_mchNo,"");
        }
        return "";
    }
    //存储杉德秘钥
    public static boolean setSandKey(String key) {
        if (getPreferences() != null) {
            return getPreferences().edit()
                    .putString(Key_SAND_key, key).commit();
        }
        return false;
    }
    public static String getSandKey() {
        if (getPreferences() != null) {
            return getPreferences().getString(Key_SAND_key,"");
        }
        return "";
    }


    /**
     * 存储设备型号
     * @param model
     */
    public static boolean setDeviceMode(String model) {
        if (getPreferences() != null){
            return getPreferences().edit()
                    .putString(Device_Model,model).commit();
        }
        return false;
    }

    /**
     * 获取设备型号
     * @return
     */
    public static String getDeviceModel(){
        if (getPreferences() != null){
            return getPreferences().getString(Device_Model,"");
        }
        return "";
    }

    /**
     * 模块化 1：是，0：不是
     * @param modular
     * @return
     */
    public static boolean setModular(int modular){
        if (getPreferences() != null){
            return getPreferences().edit().putInt(Key_Is_Modular,modular).commit();
        }
        return false;
    }

    /**
     * 获取是否是模块化 1：不展示促销预约，0：展示促销预约
     * @return
     */
    public static int getModular(){
        if (getPreferences() != null){
            return getPreferences().getInt(Key_Is_Modular,0);
        }
        return 0;
    }

    /**
     * 设置是否在小票上展示
     * @return
     */
    public static boolean setVipShowState(boolean isShow){
        if (getPreferences() != null){
            return getPreferences().edit().putBoolean(Key_Show_Vip_Price,isShow).commit();
        }
        return false;
    }

    /**
     * 获取Vip价展示状态
     * @return 是否在小票展示
     */
    public static boolean getVipShowState(){
        if (getPreferences() != null){
            return getPreferences().getBoolean(Key_Show_Vip_Price,false);
        }
        return false;
    }

    public static void clearLoginInfo() {
        getPreferences().edit()
                .remove(Key_Is_Login)
//                .remove(Key_Employee_Num)
                .remove(Key_Login_Time)
                .commit();
    }
}
