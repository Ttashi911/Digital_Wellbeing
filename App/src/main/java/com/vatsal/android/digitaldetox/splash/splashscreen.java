package com.vatsal.android.digitaldetox.splash;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Handler;

import com.vatsal.android.digitaldetox.R;
import com.vatsal.android.digitaldetox.activities.AppUsageStatisticsActivity;

public class splashscreen extends Activity {

    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen);

        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(splashscreen.this, AppUsageStatisticsActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}