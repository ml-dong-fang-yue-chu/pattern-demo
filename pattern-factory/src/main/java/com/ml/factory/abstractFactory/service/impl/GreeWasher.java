package com.ml.factory.abstractFactory.service.impl;

import com.ml.factory.abstractFactory.service.IWasher;

/**
 * @ClassName GreeWasher
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/12 20:47
 * @Version 1.0
 */
public class GreeWasher implements IWasher {

    @Override
    public void washClothes() {
        System.out.println("格力品牌，能洗衣服！");
    }
}
