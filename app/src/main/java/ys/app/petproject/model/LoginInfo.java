package ys.app.petproject.model;

import org.greenrobot.greendao.annotation.Entity;

import java.io.Serializable;
import java.util.List;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by jkh on 16/5/9.
 */
@Entity
public class LoginInfo implements Serializable {


    /**
     * selected : null
     * headOfficeId : 5
     * branchId : 206453
     * shopName : 北京宠贝佳宠物服务有限公司
     * shopShortName : 北京宠贝佳宠物服务有限公司
     * equipmentId : M10117CR57218
     * passwordBoss : e10adc3949ba59abbe56e057f20f883e
     * phone : 15001121167
     * shopCode : 59433b4dfdb1011be18f1d
     * imgUrl :
     * mchNo : 666859950000923
     * md5Key : CS52DT4qvSZaPh2Uj2KP1k8Vu0000923
     * storeId : 10001164
     * equipmentShopList : null
     * indexId : null
     * isModular : 1
     * password : e10adc3949ba59abbe56e057f20f883e
     * address : 清源路东亚马赛公馆底商105号
     * id : 50
     * state : 0
     */

    private String selected;
    private int headOfficeId;
    private int branchId;
    private String shopName;
    private String shopShortName;
    private String equipmentId;
    private String passwordBoss;
    private String phone;
    private String shopCode;
    private String imgUrl;
    private String mchNo;
    private String md5Key;
    private String storeId;
    private String equipmentShopList;
    private String indexId;
    private int isModular;
    private String password;
    private String address;
    private int state;
    @Id(autoincrement = true)
    private long id;

    @Generated(hash = 1798864518)
    public LoginInfo(String selected, int headOfficeId, int branchId,
            String shopName, String shopShortName, String equipmentId,
            String passwordBoss, String phone, String shopCode, String imgUrl,
            String mchNo, String md5Key, String storeId, String equipmentShopList,
            String indexId, int isModular, String password, String address,
            int state, long id) {
        this.selected = selected;
        this.headOfficeId = headOfficeId;
        this.branchId = branchId;
        this.shopName = shopName;
        this.shopShortName = shopShortName;
        this.equipmentId = equipmentId;
        this.passwordBoss = passwordBoss;
        this.phone = phone;
        this.shopCode = shopCode;
        this.imgUrl = imgUrl;
        this.mchNo = mchNo;
        this.md5Key = md5Key;
        this.storeId = storeId;
        this.equipmentShopList = equipmentShopList;
        this.indexId = indexId;
        this.isModular = isModular;
        this.password = password;
        this.address = address;
        this.state = state;
        this.id = id;
    }

    @Generated(hash = 1911824992)
    public LoginInfo() {
    }

    public String getSelected() {
        return selected;
    }

    public void setSelected(String selected) {
        this.selected = selected;
    }

    public int getHeadOfficeId() {
        return headOfficeId;
    }

    public void setHeadOfficeId(int headOfficeId) {
        this.headOfficeId = headOfficeId;
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopShortName() {
        return shopShortName;
    }

    public void setShopShortName(String shopShortName) {
        this.shopShortName = shopShortName;
    }

    public String getEquipmentId() {
        return equipmentId;
    }

    public void setEquipmentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getPasswordBoss() {
        return passwordBoss;
    }

    public void setPasswordBoss(String passwordBoss) {
        this.passwordBoss = passwordBoss;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getShopCode() {
        return shopCode;
    }

    public void setShopCode(String shopCode) {
        this.shopCode = shopCode;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getMchNo() {
        return mchNo;
    }

    public void setMchNo(String mchNo) {
        this.mchNo = mchNo;
    }

    public String getMd5Key() {
        return md5Key;
    }

    public void setMd5Key(String md5Key) {
        this.md5Key = md5Key;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getEquipmentShopList() {
        return equipmentShopList;
    }

    public void setEquipmentShopList(String equipmentShopList) {
        this.equipmentShopList = equipmentShopList;
    }

    public String getIndexId() {
        return indexId;
    }

    public void setIndexId(String indexId) {
        this.indexId = indexId;
    }

    public int getIsModular() {
        return isModular;
    }

    public void setIsModular(int isModular) {
        this.isModular = isModular;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
