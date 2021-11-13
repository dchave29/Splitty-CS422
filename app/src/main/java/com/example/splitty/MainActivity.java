package com.example.splitty;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // sign in/up buttons
        Button signInBtn = findViewById(R.id.sign_in_btn);
        Button signUpBtn = findViewById(R.id.sign_up_btn);

        // listeners for buttons
        signInBtn.setOnClickListener(p->{

        });

        signUpBtn.setOnClickListener(p ->{

        });
    }
}