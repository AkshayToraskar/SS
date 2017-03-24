package com.ak.ss.app;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by dg hdghfd on 24-03-2017.
 */

public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context _context;

    // shared pref mode
    int PRIVATE_MODE = 0;

    // Shared preferences file name
    private static final String PREF_NAME = "android_pref";

    private static final String IS_FIRST_TIME_LAUNCH = "IsFirstTimeLaunch";
    private static final String IS_AGREE_TERMS = "IsAgreeTerms";

    public PrefManager(Context context) {
        this._context = context;
        pref = _context.getSharedPreferences(PREF_NAME, PRIVATE_MODE);
        editor = pref.edit();
    }

    //welcome screen
    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(IS_FIRST_TIME_LAUNCH, isFirstTime);
        editor.commit();
    }
    public boolean isFirstTimeLaunch() {
        return pref.getBoolean(IS_FIRST_TIME_LAUNCH, true);
    }


    //Agree Terms and conditions
    public void setAgreeTerms(boolean isAgreeTerms) {
        editor.putBoolean(IS_AGREE_TERMS, isAgreeTerms);
        editor.commit();
    }

    public boolean isAgreeTerms() {
        return pref.getBoolean(IS_AGREE_TERMS, false);
    }
}