package com.example.myloginapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class secondactivity extends AppCompatActivity {

    Button button;
    private TextView textView2;
    private TextView textView4;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        textView2 = findViewById(R.id.textView2);
        textView4 = findViewById(R.id.textView4);
        textView2.setText(getIntent().getStringExtra("username"));
        textView4.setText(getIntent().getStringExtra("email"));


    }
}
