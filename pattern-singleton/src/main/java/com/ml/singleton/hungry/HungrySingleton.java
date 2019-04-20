package com.ml.singleton.hungry;

import javafx.scene.input.ScrollEvent;
import sun.dc.pr.PRError;

public class HungrySingleton {

    private HungrySingleton(){};

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
         return hungrySingleton;
    }

}
