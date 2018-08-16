package ys.app.petproject.model;

/**
 * Created by aaa on 2017/3/17.
 */

public class AnimalListResult {
    private String name;
    private int age;

    public AnimalListResult(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
