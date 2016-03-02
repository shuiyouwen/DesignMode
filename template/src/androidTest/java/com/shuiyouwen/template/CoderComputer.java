package com.shuiyouwen.template;

import android.util.Log;

/**
 * Created by Administrator on 2016/3/2.
 */
public class CoderComputer extends AbstractComputer {
    @Override
    protected void login() {
        Log.i("TAG", "进行用户密码验证");
    }
}
