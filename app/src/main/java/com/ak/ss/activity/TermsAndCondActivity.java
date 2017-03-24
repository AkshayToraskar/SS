package com.ak.ss.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ak.ss.R;
import com.ak.ss.app.PrefManager;

public class TermsAndCondActivity extends AppCompatActivity {

    PrefManager prefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_and_cond);

        prefManager = new PrefManager(this);

        if (prefManager.isAgreeTerms()) {
            switchHomePage();
        }
    }

    public void onBtnClick(View view) {
        int id = view.getId();

        switch (id) {
            case R.id.btn_terms:
                prefManager.setAgreeTerms(true);
                switchHomePage();
                break;
        }
    }

    public void switchHomePage() {
        Intent i = new Intent(TermsAndCondActivity.this, MainActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(i);
    }
}
