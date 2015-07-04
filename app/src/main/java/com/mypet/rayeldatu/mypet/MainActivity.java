package com.mypet.rayeldatu.mypet;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;


public class MainActivity extends FragmentActivity {
    public static final String TAG = "DEBUG_PET";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, getActionBar().toString());
    }

}
