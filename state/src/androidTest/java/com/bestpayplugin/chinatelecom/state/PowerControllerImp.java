package com.bestpayplugin.chinatelecom.state;

import android.util.Log;

/**
 * Created by Administrator on 2016/2/10.
 */
public class PowerControllerImp implements IPowerController {
    private final String TAG = "TAG";
    private ITvState mTvState;
    private boolean mIsOpened;

    @Override
    public void powerOn() {
        if (!mIsOpened) {
            //没有开机时，开机
            setTvState(new PowerOnStateImpl());
            Log.i(TAG, "开机了");
        } else {
            //已经处于开机状态，开机
            Log.i(TAG, "您已经开机了");
        }
        mIsOpened = true;

    }

    @Override
    public void powerOff() {
        if (mIsOpened) {
            Log.i(TAG, "关机了");
            setTvState(new PowerOffStateImpl());
        } else {
            Log.i(TAG, "您已经关机了");
        }
        mIsOpened = false;
    }

    public void setTvState(ITvState tvState) {
        mTvState = tvState;
    }

    public void nextChannel() {
        mTvState.nextChannel();
    }

    public void prevChannel() {
        mTvState.prevChannel();
    }

    public void turnUp() {
        mTvState.turnUp();
    }

    public void turnDown() {
        mTvState.turnDown();
    }
}
