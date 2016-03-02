package com.bestpay.memorandum;

import android.util.Log;

import junit.framework.TestCase;

/**
 * Created by Finding Way on 2016/3/2.
 */
public class Test extends TestCase {
    public void test() {
        Originator originator = new Originator();
        originator.setState("状态一");
        Log.i("TAG", "初始状态" + originator.getState());
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(originator.createMemento());

        originator.setState("状态二");
        Log.i("TAG", "改变后的状态" + originator.getState());

        originator.restoreMemoto(caretaker.getMemento());
        Log.i("TAG", "恢复后的状态" + originator.getState());
    }
}
