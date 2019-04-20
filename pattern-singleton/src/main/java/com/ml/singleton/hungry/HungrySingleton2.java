package com.ml.singleton.hungry;

public class HungrySingleton2 {

    private HungrySingleton2(){};

    private static  HungrySingleton2 hungrySingleton = null;

    static {
        hungrySingleton = new HungrySingleton2();
    }
    public static HungrySingleton2 getInstance(){
         return hungrySingleton;
    }
    
}
