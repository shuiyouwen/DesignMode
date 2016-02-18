package com.bestpayplugin.chinatelecom.state.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.bestpayplugin.chinatelecom.state.R;
import com.bestpayplugin.chinatelecom.state.state.LoginContext;
import com.bestpayplugin.chinatelecom.state.state.LogoutUserStateImp;

/**
 * Created by Administrator on 2016/2/10.
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnForward = (Button) findViewById(R.id.btn_forward);
        Button btnComment = (Button) findViewById(R.id.btn_comment);
        Button btnExist = (Button) findViewById(R.id.btn_exist);
        btnForward.setOnClickListener(this);
        btnComment.setOnClickListener(this);
        btnExist.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_forward:
                LoginContext.getInstance().forward(this);
                break;
            case R.id.btn_comment:
                LoginContext.getInstance().comment(this);
                break;
            case R.id.btn_exist:
                LoginContext.getInstance().setUserState(new LogoutUserStateImp());
                startActivity(new Intent(this, LoginActivity.class));
                break;
        }
    }
}
