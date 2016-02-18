package com.bestpayplugin.chinatelecom.absfactory.imple;

import android.util.Log;

import com.bestpayplugin.chinatelecom.absfactory.IEngine;

/**
 * Created by Administrator on 2016/2/7.
 */
public class DomesticEngine implements IEngine {
    @Override
    public void engine() {
        Log.i("TAG", "国产发动机");
    }
}
