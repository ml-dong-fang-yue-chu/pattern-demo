package com.ml.factory;

/**
 * @ClassName BenTianCar
 * @DESC 具体实现--创造雅阁汽车
 * @Author 蒙林
 * @Date 2019/4/11 21:32
 * @Version 1.0
 */


public class YaGeCar  implements IHondaCar{


    @Override
    public void createCar() {
        System.out.println("白色雅阁！");
    }
}
