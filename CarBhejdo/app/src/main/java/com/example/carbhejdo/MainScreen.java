package com.example.carbhejdo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    public void onBack(View v){
        Intent backintent = new Intent();
        setResult(MainActivity.RESPONSE,backintent);
        finish();
    }

}
