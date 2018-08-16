package ys.app.petproject.model;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by aaa on 2017/3/29.
 */
@Entity
public class CommitOrderTempInfo {
    @Id(autoincrement = true)
    private Long dbId;
    private long id;
    private long type;
    private String typeName;
    private double realAmt;
    private double price;
    private double vipPrice;
    private int num;
    private long userId;
    private String name;
    private String icon;
    private String userName;
    private int isPromotion;
    private double promotionAmt;
    private int isGift;
    private String unit;
    private int orderType;//0是正常单,1是挂单后取出的单
    private int cardID;//次卡ID
    private int vipUserId;
    public int getVipUserId() {
        return this.vipUserId;
    }
    public void setVipUserId(int vipUserId) {
        this.vipUserId = vipUserId;
    }
    public int getCardID() {
        return this.cardID;
    }
    public void setCardID(int cardID) {
        this.cardID = cardID;
    }
    public int getOrderType() {
        return this.orderType;
    }
    public void setOrderType(int orderType) {
        this.orderType = orderType;
    }
    public String getUnit() {
        return this.unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }
    public int getIsGift() {
        return this.isGift;
    }
    public void setIsGift(int isGift) {
        this.isGift = isGift;
    }
    public double getPromotionAmt() {
        return this.promotionAmt;
    }
    public void setPromotionAmt(double promotionAmt) {
        this.promotionAmt = promotionAmt;
    }
    public int getIsPromotion() {
        return this.isPromotion;
    }
    public void setIsPromotion(int isPromotion) {
        this.isPromotion = isPromotion;
    }
    public String getUserName() {
        return this.userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getIcon() {
        return this.icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public long getUserId() {
        return this.userId;
    }
    public void setUserId(long userId) {
        this.userId = userId;
    }
    public int getNum() {
        return this.num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public double getPrice() {
        return this.price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getRealAmt() {
        return this.realAmt;
    }
    public void setRealAmt(double realAmt) {
        this.realAmt = realAmt;
    }
    public String getTypeName() {
        return this.typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public long getType() {
        return this.type;
    }
    public void setType(long type) {
        this.type = type;
    }
    public long getId() {
        return this.id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public Long getDbId() {
        return this.dbId;
    }
    public void setDbId(Long dbId) {
        this.dbId = dbId;
    }
    @Generated(hash = 816728623)
    public CommitOrderTempInfo(Long dbId, long id, long type, String typeName,
            double realAmt, double price, double vipPrice, int num, long userId,
            String name, String icon, String userName, int isPromotion,
            double promotionAmt, int isGift, String unit, int orderType,
            int cardID, int vipUserId) {
        this.dbId = dbId;
        this.id = id;
        this.type = type;
        this.typeName = typeName;
        this.realAmt = realAmt;
        this.price = price;
        this.vipPrice = vipPrice;
        this.num = num;
        this.userId = userId;
        this.name = name;
        this.icon = icon;
        this.userName = userName;
        this.isPromotion = isPromotion;
        this.promotionAmt = promotionAmt;
        this.isGift = isGift;
        this.unit = unit;
        this.orderType = orderType;
        this.cardID = cardID;
        this.vipUserId = vipUserId;
    }
    @Generated(hash = 166361193)
    public CommitOrderTempInfo() {
    }

    public double getVipPrice() {
        return vipPrice;
    }

    public void setVipPrice(double vipPrice) {
        this.vipPrice = vipPrice;
    }
}
