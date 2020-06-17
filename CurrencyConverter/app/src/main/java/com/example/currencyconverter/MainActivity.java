package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void convert (View view){
        EditText currencyText = (EditText) findViewById(R.id.currencyEditText);
        double usdNumber = Double.parseDouble(currencyText.getText().toString());
        double LBPNumber = usdNumber * 4200;

        currencyText.setText(Double.toString(LBPNumber));

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}