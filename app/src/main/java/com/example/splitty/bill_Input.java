package com.example.splitty;

import android.os.Bundle;
import android.text.Html;

import androidx.appcompat.app.AppCompatActivity;


/*******************************************************
 /                  bill_Input class
 / Will prompt users to scan or enter a bill manually
 / ccc
 /*******************************************************/
public class bill_Input extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.app_name) + "</font>"));
    }

}
