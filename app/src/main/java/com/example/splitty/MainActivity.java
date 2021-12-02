package com.example.splitty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.app_name) + "</font>"));

        // sign in/up buttons
        Button signInBtn = findViewById(R.id.sign_in_btn);
        Button signUpBtn = findViewById(R.id.sign_up_btn);

        // listeners for buttons
        signInBtn.setOnClickListener(p->{
            Intent intent = new Intent(this, home_screen.class);
            startActivity(intent);
        });

        signUpBtn.setOnClickListener(p ->{
            Intent intent = new Intent(this, signUP.class);
            startActivity(intent);
        });
    }

}