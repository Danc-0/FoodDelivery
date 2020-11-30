package com.danc.bites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.airbnb.lottie.LottieAnimationView;

public class IntroductoryActivity extends AppCompatActivity {
    ImageView logo, appName, splashImg;
    LottieAnimationView lottieAnimationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introductory);

        logo = findViewById(R.id.logo);
        appName = findViewById(R.id.app_name);
        splashImg = findViewById(R.id.img);
        lottieAnimationView = findViewById(R.id.lottie);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /**Animations */
                //Background Image to slide Upwards
                splashImg.animate().translationYBy(-1800).setDuration(1000).setStartDelay(4000);
                //Other Images to slide DownWards
                logo.animate().translationYBy(1400).setDuration(1000).setStartDelay(4000);
                appName.animate().translationYBy(1400).setDuration(1000).setStartDelay(4000);
                lottieAnimationView.animate().translationYBy(1400).setDuration(1000).setStartDelay(4000);
            }
        },100);


    }
}