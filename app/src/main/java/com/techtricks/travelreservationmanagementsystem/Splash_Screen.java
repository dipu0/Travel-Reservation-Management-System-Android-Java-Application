package com.techtricks.travelreservationmanagementsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

public class Splash_Screen extends AppCompatActivity {
    AnimationDrawable animationDrawable;
    Handler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash__screen);
        final ImageView load = findViewById(R.id.image);
        animationDrawable = (AnimationDrawable) load.getDrawable();
        animationDrawable.start();
        load.setVisibility(View.VISIBLE);
        handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash_Screen.this,Main6Activity.class);
                startActivity(intent);
                finish();
            }
        },2000);

    }
    }
