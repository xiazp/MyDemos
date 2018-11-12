package com.example.android.apis;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.android.apis.view.ScreenSlidePagerActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init view
        initView();

    }

    public void initView(){
        mButton = findViewById(R.id.btScreenSlide);
        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, ScreenSlidePagerActivity.class);
        startActivity(intent);
    }


}
