package com.ml.factory.abstractFactory.service.factory;

import com.ml.factory.abstractFactory.service.ITv;
import com.ml.factory.abstractFactory.service.IWasher;
import com.ml.factory.abstractFactory.service.impl.HaierTv;
import com.ml.factory.abstractFactory.service.impl.HaierWasher;

/**
 * @ClassName HaierFactory
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/12 20:51
 * @Version 1.0
 */
public class HaierFactory extends AbstractFactory {
    @Override
    public ITv getTv() {
        return new HaierTv();
    }

    @Override
    public IWasher getWasher() {
        return new HaierWasher();
    }
}
