package com.ml.factory.abstractFactory.service.impl;

import com.ml.factory.abstractFactory.service.IWasher;

/**
 * @ClassName HaierWasher
 * @DESC 海尔洗衣机实现类
 * @Author ML
 * @Date 2019/4/12 20:47
 * @Version 1.0
 */
public class HaierWasher implements IWasher {

    @Override
    public void washClothes() {
        System.out.println("海尔品牌，能洗衣服！");
    }
}
