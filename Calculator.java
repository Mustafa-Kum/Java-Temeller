package com.mustafakum.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity {

    EditText editTextNumber;
    EditText editTextNumber2;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber = findViewById(R.id.editTextNumber);

        editTextNumber2 = findViewById(R.id.editTextNumber2);

        textView = findViewById(R.id.textView);

    }

    public void sum (View view) {

        if (editTextNumber.getText().toString().matches("") || editTextNumber2.getText().toString().matches("") ) {

        }else {

            int a = Integer.parseInt(editTextNumber.getText().toString());

            int b = Integer.parseInt(editTextNumber2.getText().toString());

            int result = a + b;

            textView.setText("Sonuç : " + result);

        }

    }

    public void deduct (View view) {

        if (editTextNumber.getText().toString().matches("") || editTextNumber2.getText().toString().matches("") ) {

        }else {

            int a = Integer.parseInt(editTextNumber.getText().toString());

            int b = Integer.parseInt(editTextNumber2.getText().toString());

            int result = a - b;

            textView.setText("Sonuç : " + result);

        }

    }

    public void multiply (View view) {

        if (editTextNumber.getText().toString().matches("") || editTextNumber2.getText().toString().matches("") ) {

        }else {

            int a = Integer.parseInt(editTextNumber.getText().toString());

            int b = Integer.parseInt(editTextNumber2.getText().toString());

            int result = a * b;

            textView.setText("Sonuç : " + result);

        }

    }

    public void divide (View view) {

        if (editTextNumber.getText().toString().matches("") || editTextNumber2.getText().toString().matches("") ) {

        }else {

            int a = Integer.parseInt(editTextNumber.getText().toString());

            int b = Integer.parseInt(editTextNumber2.getText().toString());

            int result = a / b;

            textView.setText("Sonuç : " + result);

        }

    }



}