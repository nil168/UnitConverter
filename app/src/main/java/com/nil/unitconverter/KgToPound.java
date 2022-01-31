package com.nil.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class KgToPound extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button submit;
        EditText editText;
        TextView result;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kg_to_pound);
        submit = findViewById(R.id.submit);
        editText = findViewById(R.id.editTextNumber);
        result = findViewById(R.id.textView2);
        submit.setOnClickListener(view -> {
            //Toast.makeText(getApplicationContext(),"Submit Works!!", Toast.LENGTH_LONG).show();
            String value = editText.getText().toString();
            double kg = Double.parseDouble(value);
            double pound = 2.205*kg;
            @SuppressLint("DefaultLocale") String res = String.format("%.2f",pound);
            result.setText("The corresponding value in Pounds is : "+res);
        });
    }
}