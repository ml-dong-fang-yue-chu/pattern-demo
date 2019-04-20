package com.ml.singleton.lazy;


public class LazySingletonSafe {
    private LazySingletonSafe(){};

    private static LazySingletonSafe lazySingleton = null;

    private synchronized static LazySingletonSafe getInstance(){
        if(null == lazySingleton)
            lazySingleton = new LazySingletonSafe();
        return lazySingleton;
    }

}
