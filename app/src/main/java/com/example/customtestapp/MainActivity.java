package com.example.customtestapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


import com.nuilewis.material3lib.addNumbers;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

int result = addNumbers.addTwoIntergers(3,6);
}