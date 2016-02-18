package com.bestpayplugin.chinatelecom.singleton;

/**
 * Created by Administrator on 2016/2/5.
 */
public class SingletonThree {
    private SingletonThree() {
    }

    public static SingletonThree getInstance() {
        return SingleHolder.sInstance;
    }

    private static class SingleHolder {
        private static final SingletonThree sInstance = new SingletonThree();
    }
}
