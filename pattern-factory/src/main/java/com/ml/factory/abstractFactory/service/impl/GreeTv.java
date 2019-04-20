package com.ml.factory.abstractFactory.service.impl;

import com.ml.factory.abstractFactory.service.ITv;

/**
 * @ClassName GreeTv
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/12 20:43
 * @Version 1.0
 */
public class GreeTv implements ITv {
    @Override
    public void watch() {
        System.out.println("格力品牌，能观看电视节目！");
    }
}
