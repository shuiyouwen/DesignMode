package com.bestpayplugin.chinatelecom.singleton;

/**
 * Created by Administrator on 2016/2/5.
 */
public class Singleton {
    private static Singleton mSingleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstane() {
        return mSingleton;
    }

}
