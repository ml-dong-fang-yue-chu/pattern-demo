package com.ml.pattern.service.impl;

import com.ml.pattern.abs.AbstractServiceTemplate;
import com.ml.pattern.abs.AbstractServiceTemplate2;
import com.ml.pattern.abs.ServiceCallBack;
import com.ml.pattern.service.IUserService;
import com.ml.pattern.util.MLBaseResult;
import com.ml.pattern.util.ParametersCheck;

/**
 * @ClassName UserServiceImpl
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/20 13:41
 * @Version 1.0
 */
public class UserServiceImpl2 extends AbstractServiceTemplate2 implements IUserService {

    @Override
    public MLBaseResult<String> findById(final String id) {
        MLBaseResult<String> result = new MLBaseResult<>();
        this.serviceTemplate.execute(result, new ServiceCallBack(){

            @Override
            public void check() {
                ParametersCheck.isEmpty(id ,"主键id不能为空！");
            }
            @Override
            public void doService() {
                System.out.println("业务处理。。。");
            }
        });
        return result;
    }

}
