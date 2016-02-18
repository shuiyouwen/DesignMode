package com.bestpayplugin.chinatelecom.state;

import android.util.Log;

/**
 * 电视开启时的状态
 * Created by Administrator on 2016/2/10.
 */
public class PowerOnStateImpl implements ITvState {
    private final String TAG = "TAG";

    @Override
    public void nextChannel() {
        Log.i(TAG, "下一个节目");
    }

    @Override
    public void prevChannel() {
        Log.i(TAG, "上一个节目");
    }

    @Override
    public void turnUp() {
        Log.i(TAG, "音量加");
    }

    @Override
    public void turnDown() {
        Log.i(TAG, "音量减");
    }
}
