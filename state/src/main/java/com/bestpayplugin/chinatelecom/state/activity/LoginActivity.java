package com.bestpayplugin.chinatelecom.state.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.bestpayplugin.chinatelecom.state.R;
import com.bestpayplugin.chinatelecom.state.state.LoginContext;
import com.bestpayplugin.chinatelecom.state.state.LoginedUserStateImp;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    private ProgressBar pbProgress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btnLogin = (Button) findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(this);
        pbProgress = (ProgressBar) findViewById(R.id.pb_progress);
    }

    @Override
    public void onClick(View v) {
        login();
    }

    private void login() {
        pbProgress.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                pbProgress.setVisibility(View.GONE);
                LoginContext.getInstance().setUserState(new LoginedUserStateImp());
                startActivity(new Intent(LoginActivity.this, MainActivity.class));
            }
        }, 3000);
    }
}
