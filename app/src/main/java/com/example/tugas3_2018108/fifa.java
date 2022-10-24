package com.example.tugas3_2018108;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class fifa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifa);
    }

    public void steam (View view){
        Intent a = new Intent(fifa.this, MainActivity.class);
        startActivity(a);
    }
    public void nba(View view){
        Intent a = new Intent(fifa.this, nba.class);
        startActivity(a);
    }
}