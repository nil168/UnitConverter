package com.nil.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button kg;
        Button pound;
        Button km;
        Button miles;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kg = findViewById(R.id.kg);
        pound = findViewById(R.id.pound);
        km = findViewById(R.id.km);
        miles = findViewById(R.id.miles);
        kg.setOnClickListener(view -> {
            Intent intent_one = new Intent(MainActivity.this, KgToPound.class);
            startActivity(intent_one);
        });
        pound.setOnClickListener(view -> {
            Intent intent_two = new Intent(MainActivity.this,PoundToKg.class);
            startActivity(intent_two);
        });
        km.setOnClickListener(view -> {
            Intent intent_three = new Intent(MainActivity.this,KmToMiles.class);
            startActivity(intent_three);
        });
        miles.setOnClickListener(view -> {
            Intent intent_four = new Intent(MainActivity.this,MilesToKm.class);
            startActivity(intent_four);
        });
    }
}