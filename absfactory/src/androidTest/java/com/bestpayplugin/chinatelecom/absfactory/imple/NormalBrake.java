package com.bestpayplugin.chinatelecom.absfactory.imple;

import android.util.Log;

import com.bestpayplugin.chinatelecom.absfactory.IBrake;

/**
 * Created by Administrator on 2016/2/7.
 */
public class NormalBrake implements IBrake {

    @Override
    public void brake() {
        Log.i("TAG", "普通制动系统");
    }
}
