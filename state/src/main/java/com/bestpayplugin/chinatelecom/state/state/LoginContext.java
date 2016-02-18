package com.bestpayplugin.chinatelecom.state.state;

import android.content.Context;

/**
 * Created by Administrator on 2016/2/10.
 */
public class LoginContext {
    //默认未登录
    private IUserState mUserState = new LogoutUserStateImp();
    private static LoginContext sLoginContext;

    private LoginContext() {
    }

    public static LoginContext getInstance() {
        if (sLoginContext == null) {
            sLoginContext = new LoginContext();
        }
        return sLoginContext;
    }

    public void setUserState(IUserState userState) {
        mUserState = userState;
    }

    public void forward(Context context) {
        mUserState.forward(context);
    }

    public void comment(Context context) {
        mUserState.comment(context);
    }
}
