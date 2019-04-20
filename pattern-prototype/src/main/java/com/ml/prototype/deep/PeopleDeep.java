package com.ml.prototype.deep;

import com.ml.prototype.shallow.Car;

/**
 * @ClassName PeopleDeep
 * @DESC  人的实体类
 * @Author ML
 * @Date 2019/4/18 20:24
 * @Version 1.0
 */
public class PeopleDeep implements Cloneable {

    private String type;

    private String name;

    private int age;

    private Car haveCar;

    public PeopleDeep(String type, String name, int age, Car haveCar) {
        this.type = type;
        this.name = name;
        this.age = age;
        this.haveCar = haveCar;
    }

    public PeopleDeep() {
    }

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
        PeopleDeep newPeople = (PeopleDeep) super.clone();
        Car car = new Car();
        car.setName(this.haveCar.getName());
        newPeople.haveCar = car ;
        return newPeople;
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
