package com.example.tugas3_2018108;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nba(View view){
        Intent a = new Intent(MainActivity.this, nba.class);
        startActivity(a);
    }
    public void fifa (View view){
        Intent a = new Intent(MainActivity.this, fifa.class);
        startActivity(a);
    }

    public void steam(View view) {
    }
}