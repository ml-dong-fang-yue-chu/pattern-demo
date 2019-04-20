package com.ml.factory.abstractFactory.service.factory;

import com.ml.factory.abstractFactory.service.ITv;
import com.ml.factory.abstractFactory.service.IWasher;

/**
 * @ClassName AbstractFactory
 * @DESC 顶层抽象工厂类
 * @Author ML
 * @Date 2019/4/12 20:49
 * @Version 1.0
 */
public abstract class AbstractFactory {

    public abstract  ITv getTv();

    public abstract IWasher getWasher();
}
