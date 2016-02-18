package com.bestpayplugin.chinatelecom.absfactory.imple;

import android.util.Log;

import com.bestpayplugin.chinatelecom.absfactory.IBrake;

/**
 * Created by Administrator on 2016/2/7.
 */
public class SeniorBrake implements IBrake {
    @Override
    public void brake() {
        Log.i("TAG", "高级制动");
    }
}
