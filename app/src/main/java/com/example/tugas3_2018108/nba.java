package com.example.tugas3_2018108;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nba extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nba);
    }

    public void steam (View view){
        Intent a = new Intent(nba.this, MainActivity.class);
        startActivity(a);
    }
    public void fifa (View view){
        Intent b = new Intent(nba.this, fifa.class);
        startActivity(b);
    }
}