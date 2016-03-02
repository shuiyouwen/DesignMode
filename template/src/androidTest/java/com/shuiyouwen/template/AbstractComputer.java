package com.shuiyouwen.template;

import android.util.Log;

/**
 * Created by Administrator on 2016/3/2.
 */
public class AbstractComputer {
    protected void powerOn() {
        Log.i("TAG", "开启电源");
    }

    protected void checkHardware() {
        Log.i("TAG", "硬件检查");
    }

    protected void loadOS() {
        Log.i("TAG", "载入操作系统");
    }

    protected void login() {
        Log.i("TAG", "小白的计算机无验证，直接进入系统");
    }

    /**
     * 启动计算机模板方法
     */
    public final void startUp() {
        Log.i("TAG", "开机。。。");
        powerOn();
        checkHardware();
        loadOS();
        login();
        Log.i("TAG", "关机。。。");
    }
}
