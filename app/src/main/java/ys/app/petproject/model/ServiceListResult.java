package ys.app.petproject.model;

/**
 * Created by lyy on 2017/2/21 16:24.
 * email：2898049851@qq.com
 */

public class ServiceListResult {

    private int id;
    private String name;

    public ServiceListResult(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
