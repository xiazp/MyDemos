package com.example.android.apis;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.tencent.bugly.crashreport.CrashReport;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CrashReport.initCrashReport(getApplicationContext(), "27f28c4e75", false);
    }


}
