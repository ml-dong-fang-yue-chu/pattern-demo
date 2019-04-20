package com.ml.proxy.staticproxy;

import org.junit.Test;

/**
 * @ClassName StaticProxyTest
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/18 22:18
 * @Version 1.0
 */
public class StaticProxyTest {

    @Test
    public void staticProxyTest(){
        Mother mother = new Mother(new Son());
        mother.findGirlfriend();

    }
}
