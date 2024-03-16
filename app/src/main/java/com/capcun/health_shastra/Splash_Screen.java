package com.capcun.health_shastra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Splash_Screen extends AppCompatActivity {

    private static final int SPLASH_SCREEN_TIME_OUT = 1000;
    final String sharedPreferencesFileTitle = "ecoview";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);


        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);


        SharedPreferences sharedPreferences = getSharedPreferences(sharedPreferencesFileTitle, MODE_PRIVATE);

        if (sharedPreferences.contains("user_phone") && sharedPreferences.contains("user_pass")) {
            String mobile = sharedPreferences.getString("user_phone", "");
            String pass = sharedPreferences.getString("user_pass", "");


            if (!mobile.equals("") && !pass.equals("")) {
                Intent intent = new Intent(Splash_Screen.this, Dashboard.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
                finish();
            }

        }
        else
        {
            ImageView logoImageView = findViewById(R.id.logoImageView);
            Animation scaleAnimation = AnimationUtils.loadAnimation(this, R.anim.scale_animation);
            logoImageView.startAnimation(scaleAnimation);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    // Intent is used to switch from one activity to another.
                    Intent i = new Intent(Splash_Screen.this, Slider1.class);
                    startActivity(i); // invoke the SecondActivity.
                    finish(); // the current activity will get finished.
                }
            }, SPLASH_SCREEN_TIME_OUT);


        }




    }
}