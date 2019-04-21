package com.ml.pattern.jdk;

/**
 * @ClassName Observer
 * @DESC TODO
 * @Author ML
 * @Date 2019/4/21 14:02
 * @Version 1.0
 */
public class Observer {

    public static void main(String[] args) {
        Activity activity = new Activity();

        activity.addObserver(new UserA());
        activity.addObserver(new UserB());

        activity.publishActivity("打篮球");


    }
}
