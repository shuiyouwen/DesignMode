package com.bestpayplugin.chinatelecom.state.state;

import android.content.Context;

import com.bestpayplugin.chinatelecom.state.tools.ToastUtil;

/**
 * Created by Administrator on 2016/2/10.
 */
public class LoginedUserStateImp implements IUserState {
    @Override
    public void forward(Context context) {
        ToastUtil.makeToast("转发", context);
    }

    @Override
    public void comment(Context context) {
        ToastUtil.makeToast("评论", context);
    }
}
