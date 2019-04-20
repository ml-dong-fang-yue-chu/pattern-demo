package com.ml.singleton.lazy;


public class LazySingleton  {
    private LazySingleton(){};

    private static LazySingleton lazySingleton = null;

    public static LazySingleton getInstance(){
        if(null == lazySingleton)
            lazySingleton = new LazySingleton();
        return lazySingleton;
    }

}
