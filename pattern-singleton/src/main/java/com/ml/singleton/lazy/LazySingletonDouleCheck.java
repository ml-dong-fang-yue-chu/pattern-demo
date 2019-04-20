package com.ml.singleton.lazy;


public class LazySingletonDouleCheck {
    private static final Object lock = new Object();
    private LazySingletonDouleCheck(){};

    private static LazySingletonDouleCheck lazySingleton = null;

    private  static LazySingletonDouleCheck getInstance(){
        if(null == lazySingleton){
            synchronized (lock){
                if(null == lazySingleton)
                    lazySingleton = new LazySingletonDouleCheck();
            }
        }
        return lazySingleton;
    }

}
