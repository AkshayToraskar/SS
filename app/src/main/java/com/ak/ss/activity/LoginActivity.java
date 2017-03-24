package com.ak.ss.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.ak.ss.R;
import com.ak.ss.app.PrefManager;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
                startActivity(new Intent(this,TermsAndCondActivity.class));
                break;

            case R.id.btn_reset_intro:
                PrefManager prefManager = new PrefManager(getApplicationContext());
                prefManager.setFirstTimeLaunch(true);
                startActivity(new Intent(LoginActivity.this, IntroActivity.class));
                finish();
                break;
        }

    }

    /*public void checkAdminLogin() {
        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<Login> call = apiService.getLogin(txt_username.getText().toString(), txt_password.getText().toString());
        call.enqueue(new Callback<Login>() {
            @Override
            public void onResponse(Call<Login> call, Response<Login> response) {
                Login login = response.body();
                Log.d("asdf", "Name of user: " + login.getError_message());
                progress.dismiss();

                if (!login.isError()) {
                    Intent i = new Intent(LoginActivity.this, MainActivity.class);
                    i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                    sessionManager.setLogin(true, login.getUser().getName(), login.getUser().getType(), login.getUser().getId());
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Wrong credential", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<Login> call, Throwable t) {
                // Log error here since request failed
                progress.dismiss();
                Log.e("asdf", t.toString());
                Toast.makeText(getApplicationContext(), "Internal server error..!", Toast.LENGTH_SHORT).show();
            }
        });
    }*/
}
