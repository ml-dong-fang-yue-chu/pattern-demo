package com.ml.pattern.abs;

import com.ml.pattern.util.MLBaseResult;

/**
 * @ClassName ServiceTemplate
 * @DESC 业务处理的抽象类
 * @Author ML
 * @Date 2019/4/20 13:34
 * @Version 1.0
 */
public abstract class AbstractServiceTemplate {

    public  abstract void check();

    public  abstract void service();

    public  abstract void logRecord();

    //执行代码的模板，final防止子类恶意操作
    public final  void   execute(){
        //参数校验
        check();
        //业务处理
        service();
        //日志落数
        logRecord();

    }



}
