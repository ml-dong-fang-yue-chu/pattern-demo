package com.ml.prototype.shallow;

/**
 * @ClassName Car
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/18 21:18
 * @Version 1.0
 */
public class Car  implements  Cloneable{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
