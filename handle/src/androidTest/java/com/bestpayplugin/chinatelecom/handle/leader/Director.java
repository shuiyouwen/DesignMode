package com.bestpayplugin.chinatelecom.handle.leader;

import android.util.Log;

/**
 * Created by Administrator on 2016/2/13.
 */
public class Director extends Leader {
    @Override
    public void handle(int money) {
        Log.i("TAG", "主管批复报销" + money + "元");
    }

    @Override
    public int limit() {
        return 5000;
    }
}
