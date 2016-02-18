package com.bestpayplugin.chinatelecom.state.state;

import android.content.Context;
import android.content.Intent;

import com.bestpayplugin.chinatelecom.state.activity.LoginActivity;

/**
 * Created by Administrator on 2016/2/10.
 */
public class LogoutUserStateImp implements IUserState {
    @Override
    public void forward(Context context) {
        context.startActivity(new Intent(context, LoginActivity.class));
    }

    @Override
    public void comment(Context context) {
        context.startActivity(new Intent(context, LoginActivity.class));
    }
}
