package ys.app.petproject.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.android.databinding.library.baseAdapters.BR;

/**
 * Created by aaa on 2017/3/1.
 */

public class VipListResult extends BaseObservable{

    private int id;
    private String name;
    private int price;
    private int inventoryNum;
    private String tel;
    private String cardNo;
    private String vipType;

    @Bindable
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
        notifyPropertyChanged(BR.tel);
    }

    @Bindable
    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
        notifyPropertyChanged(BR.cardNo);
    }

    @Bindable
    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
        notifyPropertyChanged(BR.vipType);
    }

    public VipListResult() {
    }

    public VipListResult(int id, String name, int price, int inventoryNum) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.inventoryNum = inventoryNum;
    }

    @Bindable
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        notifyPropertyChanged(BR.id);
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
        notifyPropertyChanged(BR.price);
    }

    @Bindable
    public int getInventoryNum() {
        return inventoryNum;
    }

    public void setInventoryNum(int inventoryNum) {
        this.inventoryNum = inventoryNum;
    }


    @Override
    public String toString() {
        return "VipListResult{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", inventoryNum=" + inventoryNum +
                ", tel='" + tel + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", vipType='" + vipType + '\'' +
                '}';
    }
}
