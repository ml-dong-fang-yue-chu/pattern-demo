package com.ml.pattern.impl;

import com.ml.pattern.IProgrammerService;

/**
 * @ClassName ZhangSanService
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/20 10:10
 * @Version 1.0
 */
public class ZhangSanService implements IProgrammerService {
    private static final String NAME = "张三";

    @Override
    public void work(String command) {
        System.out.println("我是程序员"+NAME+"我现在开始"+command+"需求");
    }
}
