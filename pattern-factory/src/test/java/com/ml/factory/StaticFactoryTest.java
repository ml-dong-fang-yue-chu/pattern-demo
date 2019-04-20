package com.ml.factory;

import com.ml.factory.staticFactory.StaticFactory;
import org.junit.Test;

public class StaticFactoryTest  {

    @Test
    public void  getCar(){
        StaticFactory staticFactory = new StaticFactory();
        IHondaCar yaGe = staticFactory.getCar(YaGeCar.class);
        yaGe.createCar();

    }

}
