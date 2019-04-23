package com.ml.pattern.abs;

/**
 * @ClassName ServiceBack
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/23 21:17
 * @Version 1.0
 */
public interface ServiceBack {

    /**
     * 前置参数检查
     */
    public void check();

    /**
     * 业务执行
     */
    public void doService();

}
