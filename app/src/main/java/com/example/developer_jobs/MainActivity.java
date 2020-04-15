package com.example.developer_jobs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {
    private static  int SPLASH_TIME_OUT = 4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT); {



        }

        ImageView logo = findViewById(R.id.logo);


        String url = "https://lh3.googleusercontent.com/1dvy7-_I0-l98hcLRBIPOqddaZz7ixLYOBj4i0d41LV9mdvSjFZote8NSHxC_yiCRVKq=s180-rw";
        Picasso.with(this).load(url).resize(500, 500).into(logo);
    }
}
