package com.bestpayplugin.chinatelecom.singleton;

/**
 * Created by Administrator on 2016/2/5.
 */
public class SingletonTwo {
    private volatile static SingletonTwo mSingletonTwo;

    private SingletonTwo() {
    }

    public static SingletonTwo getInstance() {
        if (mSingletonTwo == null) {
            synchronized (SingletonTwo.class) {
                if (mSingletonTwo == null) {
                    mSingletonTwo = new SingletonTwo();
                }
            }
        }
        return mSingletonTwo;
    }
}
