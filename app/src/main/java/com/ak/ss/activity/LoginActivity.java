package com.ak.ss.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ak.ss.R;
import com.ak.ss.app.PrefManager;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void onBtnClick(View view){
        int id=view.getId();

        switch (id){
            case R.id.btnSubmit:
                startActivity(new Intent(this,MainActivity.class));
                break;

            case R.id.btn_reset_intro:
                PrefManager prefManager = new PrefManager(getApplicationContext());
                prefManager.setFirstTimeLaunch(true);
                startActivity(new Intent(LoginActivity.this, IntroActivity.class));
                finish();
                break;
        }

    }
}
