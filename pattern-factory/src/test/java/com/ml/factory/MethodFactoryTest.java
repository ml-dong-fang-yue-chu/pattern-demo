package com.ml.factory;

import com.ml.factory.methodFactory.ICarFactory;
import com.ml.factory.methodFactory.SiYuCarFactory;
import org.junit.Test;

public class MethodFactoryTest {

    @Test
    public void  getCar(){
        ICarFactory iCarFactory  = new SiYuCarFactory();
        iCarFactory.getCar().createCar();
    }

}
