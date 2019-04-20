package com.ml.pattern.delegate;

import com.ml.pattern.IProgrammerService;
import com.ml.pattern.impl.LeaderService;
import org.junit.Test;

/**
 * @ClassName Delegate
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/20 10:22
 * @Version 1.0
 */
public class Delegate {

    @Test
    public void Boss(){
        IProgrammerService leader = new LeaderService();
        leader.work("架构");
        //在 Spring 源码中，只要以 Delegate 结尾的
        //都是实现了委派模式。例如：BeanDefinitionParserDelegate 根据不同类型委派不同的
        //逻辑解析 BeanDefinition。
    }
}
