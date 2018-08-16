package ys.app.petproject.model;

import java.io.Serializable;

/**
 * Created by aaa on 2017/3/17.
 */

public class VipCardListResult implements Serializable{

    private String cardName;

    private int cost;

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }


    public VipCardListResult(String cardName, int cost) {
        this.cardName = cardName;
        this.cost = cost;
    }
}
