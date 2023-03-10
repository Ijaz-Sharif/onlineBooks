package com.example.onlinebooking;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class Constant {
    public static boolean getUserLoginStatus(Context context){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        return prefs.getBoolean("locked", false);
    }

    public static void setUserLoginStatus(Context context , boolean s){
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        prefs.edit().putBoolean("locked", s).commit();
    }
}
