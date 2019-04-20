package com.ml.pattern.service.impl;

import com.ml.pattern.abs.AbstractServiceTemplate;
import com.ml.pattern.service.IUserService;
import com.ml.pattern.util.MLBaseResult;

/**
 * @ClassName UserServiceImpl
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/20 13:41
 * @Version 1.0
 */
public class UserServiceImpl extends AbstractServiceTemplate implements IUserService {

    @Override
    public MLBaseResult<String> findById(String id) {
        service();
        return null;
    }

    @Override
    public void check() {
        System.out.println("参数校验成功");
    }

    @Override
    public void service() {
        System.out.println("查询成功");
    }

    @Override
    public void logRecord() {
        System.out.println("日志落数");

    }
}
