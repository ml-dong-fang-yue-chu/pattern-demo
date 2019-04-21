package com.ml.pattern;

import com.ml.pattern.decorator.ColorCarDecorator;
import com.ml.pattern.impl.BenTianCar;
import org.junit.Test;

/**
 * @ClassName Car
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/21 13:20
 * @Version 1.0
 */
public class Car {

    @Test
    public void getCar(){
        ICar car = new BenTianCar();
        ICar colorCar = new ColorCarDecorator(car);
        ICar colorCar2 = new ColorCarDecorator(colorCar);
        car.getCar();
        System.out.println("\n");
        colorCar.getCar();
        System.out.println("\n");
        colorCar2.getCar();

        ///JDK 中体现最明显的类就是 IO 相关的类，如
        //BufferedReader、InputStream、OutputStream，看一下常用的 InputStream 的类
       //Spring 中的 TransactionAwareCacheDecorator

    }
}
