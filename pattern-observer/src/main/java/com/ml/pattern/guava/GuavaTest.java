package com.ml.pattern.guava;

import com.google.common.eventbus.EventBus;

/**
 * @ClassName GuavaTest
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/21 14:11
 * @Version 1.0
 */
public class GuavaTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        eventBus.register(new GuavaEvent());
        eventBus.post("我发了一条消息");
       // Spring 中的 ContextLoaderListener 实现了 ServletContextListener 接口，
        // ServletContextListener 接口又继承了 EventListener，在 JDK 中 EventListener 有非常
       // 广泛的应用。我们可以看一下源代码，ContextLoaderListener;

    }
}
