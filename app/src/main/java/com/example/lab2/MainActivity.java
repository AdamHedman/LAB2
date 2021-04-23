package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.counter = 0;
    }
    public void onNextScreenButtonClicked(View v){
        Intent i = new Intent(this, Screen2.class);
        MySingleton.counter++;
        this.startActivity(i);
    }
}