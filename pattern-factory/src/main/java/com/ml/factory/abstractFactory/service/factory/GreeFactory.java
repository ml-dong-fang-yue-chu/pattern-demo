package com.ml.factory.abstractFactory.service.factory;

import com.ml.factory.abstractFactory.service.ITv;
import com.ml.factory.abstractFactory.service.IWasher;
import com.ml.factory.abstractFactory.service.impl.GreeTv;
import com.ml.factory.abstractFactory.service.impl.GreeWasher;
import com.ml.factory.abstractFactory.service.impl.HaierTv;

/**
 * @ClassName GreeFactory
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/12 20:51
 * @Version 1.0
 */
public class GreeFactory  extends AbstractFactory{


    @Override
    public ITv getTv() {
        return new GreeTv();
    }

    @Override
    public IWasher getWasher() {
        return new GreeWasher();
    }
}
