package ys.app.petproject.model;

/**
 * Created by aaa on 2017/3/27.
 */

public class BusInfo {
    private int type;
    private int position;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public BusInfo(int type, int position) {
        this.type = type;
        this.position = position;
    }
}
