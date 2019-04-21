package com.ml.pattern.guava;

import com.google.common.eventbus.Subscribe;

/**
 * @ClassName GuavaEvent
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/21 14:08
 * @Version 1.0
 */
public class GuavaEvent {

    @Subscribe
    public void event(String msg){
        System.out.println(msg);
    }
}
