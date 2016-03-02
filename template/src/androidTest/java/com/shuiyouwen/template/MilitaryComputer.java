package com.shuiyouwen.template;

import android.util.Log;

/**
 * Created by Administrator on 2016/3/2.
 */
public class MilitaryComputer extends AbstractComputer {
    @Override
    protected void checkHardware() {
        super.checkHardware();
        Log.i("TAG", "检查硬件防火墙");
    }

    @Override
    protected void login() {
        Log.i("TAG", "进行指纹识别等复杂的用户验证");
    }
}
