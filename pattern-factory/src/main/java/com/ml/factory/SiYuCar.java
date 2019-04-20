package com.ml.factory;

/**
 * @ClassName SiYuCar
 * @DESC 具体实现--创建思域汽车
 * @Author 蒙林
 * @Date 2019/4/11 21:32
 * @Version 1.0
 */


public class SiYuCar implements IHondaCar{


    @Override
    public void createCar() {
        System.out.println("黄色思域！");
    }
}
