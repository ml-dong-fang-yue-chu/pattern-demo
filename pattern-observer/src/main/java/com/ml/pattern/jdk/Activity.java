package com.ml.pattern.jdk;

import java.util.Observable;

/**
 * @ClassName Observed
 * @DESC 被观察者类
 * @Author ML
 * @Date 2019/4/21 13:51
 * @Version 1.0
 */
public class Activity extends Observable {


    public void publishActivity(String msg){
        System.out.println("发布了一个"+msg+"活动");
        super.setChanged();
        super.notifyObservers(msg);

    }

}
