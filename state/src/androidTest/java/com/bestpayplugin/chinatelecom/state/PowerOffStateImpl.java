package com.bestpayplugin.chinatelecom.state;

import android.util.Log;

/**
 * 电视关闭时的操作
 * Created by Administrator on 2016/2/10.
 */
public class PowerOffStateImpl implements ITvState {
    private final String TAG = "TAG";
    @Override
    public void nextChannel() {
        Log.i(TAG, "电视机已关闭，请先开机");
    }

    @Override
    public void prevChannel() {
        Log.i(TAG, "电视机已关闭，请先开机");
    }

    @Override
    public void turnUp() {
        Log.i(TAG, "电视机已关闭，请先开机");
    }

    @Override
    public void turnDown() {
        Log.i(TAG, "电视机已关闭，请先开机");
    }
}
