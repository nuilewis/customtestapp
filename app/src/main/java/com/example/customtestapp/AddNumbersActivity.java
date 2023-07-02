package com.example.customtestapp;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AddNumbersActivity extends AppCompatActivity {

    @Override
    protected  void  onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_numbers_activity);
    }

    public static int addNumbersMethod(int x, int y){ return x+y;}
}
