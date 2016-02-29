package com.shuiyouwen.observer;

import java.util.Observable;

/**
 * Created by Administrator on 2016/2/29.
 */
public class DevTechFrontier extends Observable {
    public void postNewPublication(String context) {
        //表示内容发生改变
        setChanged();
        //通知所有观察者
        notifyObservers(context);
    }
}
