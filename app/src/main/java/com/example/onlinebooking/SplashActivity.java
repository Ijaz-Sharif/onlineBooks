package com.example.onlinebooking;

import static com.example.onlinebooking.Constant.getUserLoginStatus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {
    LottieAnimationView lottieAnimationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        lottieAnimationView = findViewById(R.id.lottie);
        Thread thread=new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                    if(getUserLoginStatus(SplashActivity.this)){
                        startActivity(new Intent(SplashActivity.this,Operation.class));
                        finish();
                    }
                    else {
                        startActivity(new Intent(SplashActivity.this,AdminLogin.class));
                        finish();
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}