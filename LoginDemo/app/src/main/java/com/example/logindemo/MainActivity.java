package com.example.logindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void login(View view){
        EditText usernameEditText = (EditText)findViewById(R.id.usernameEditText);
        EditText passwordEditText = (EditText)findViewById(R.id.passwordEditText);

        Log.i("Username",  usernameEditText.getText().toString());
        Log.i("Password",  passwordEditText.getText().toString());
        Toast.makeText(this, "Hi there!", Toast.LENGTH_SHORT).show();


        Log.i("Info", "Button Pressed!");
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}