package com.bestpayplugin.chinatelecom.absfactory;

import android.util.Log;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2016/2/7.
 */
public class Test extends TestCase {
    public void test() {
        Q7Factory q7Factory = new Q7Factory();
        q7Factory.createBrake();
        q7Factory.createEngine();
        q7Factory.createTire();
        Log.i("TAG", "-------------------------------");
    }
}
