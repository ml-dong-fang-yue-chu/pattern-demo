package com.ml.factory;

import com.ml.factory.abstractFactory.service.factory.HaierFactory;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void  absTest(){
        HaierFactory haier = new HaierFactory();
        haier.getTv().watch();;
    }

}
