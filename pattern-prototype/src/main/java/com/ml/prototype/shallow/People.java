package com.ml.prototype.shallow;

/**
 * @ClassName People
 * @DESC  人的实体类
 * @Author ML
 * @Date 2019/4/18 20:24
 * @Version 1.0
 */
public class People implements Cloneable {

    private String type;

    private String name;

    private int age;

    private Car haveCar;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public Car getHaveCar() {
        return haveCar;
    }

    public void setHaveCar(Car haveCar) {
        this.haveCar = haveCar;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "People{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", haveCar=" + haveCar +
                '}';
    }
}
