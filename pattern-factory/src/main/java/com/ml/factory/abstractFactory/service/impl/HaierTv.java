package com.ml.factory.abstractFactory.service.impl;

import com.ml.factory.abstractFactory.service.ITv;

/**
 * @ClassName HaierTv
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/12 20:44
 * @Version 1.0
 */
public class HaierTv implements ITv {
    @Override
    public void watch() {
        System.out.println("海尔品牌，能观看电视节目！");
    }
}
