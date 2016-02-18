package com.bestpayplugin.chinatelecom.state.tools;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/2/10.
 */
public class ToastUtil {

    private static Toast mToast;

    public static void makeToast(String str,Context context) {
        if (mToast == null) {
            mToast = Toast.makeText(context, str, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(str);
        }
        mToast.show();
    }
}
