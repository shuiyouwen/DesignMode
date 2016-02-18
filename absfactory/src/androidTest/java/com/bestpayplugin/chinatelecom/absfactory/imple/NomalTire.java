package com.bestpayplugin.chinatelecom.absfactory.imple;

import android.util.Log;

import com.bestpayplugin.chinatelecom.absfactory.ITire;

/**
 * Created by Administrator on 2016/2/7.
 */
public class NomalTire implements ITire {
    @Override
    public void tire() {
        Log.i("TAG", "普通轮胎");
    }
}
