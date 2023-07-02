package com.example.customtestapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;




public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void NavToPageTwoActivity(View view){
        Intent intent = new Intent(MainActivity.this, AddNumbersActivity.class);

        startActivity(intent);

    }



}