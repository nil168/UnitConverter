package com.nil.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MilesToKm extends AppCompatActivity {
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button submit;
        EditText editText;
        TextView result;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_miles_to_km);
        submit = findViewById(R.id.submit);
        editText = findViewById(R.id.editTextNumber);
        result = findViewById(R.id.textView2);
        submit.setOnClickListener(view -> {
            String value = editText.getText().toString();
            double miles = Double.parseDouble(value);
            double km = 1.60934*miles;
            @SuppressLint("DefaultLocale") String res = String.format("%.2f",km);
            result.setText("The corresponding value in Kms is : "+res);
        });
    }
}