package com.ml.pattern.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName Observed
 * @DESC 观察者类
 * @Author ML
 * @Date 2019/4/21 13:51
 * @Version 1.0
 */
public class UserA implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("用户A收到了一个"+arg+"活动!");
    }
}
