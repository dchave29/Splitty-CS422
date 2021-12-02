package com.example.splitty;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class scanConfirmation extends AppCompatActivity {
    TextView numPeople;
    double totalAmount = 2892.05;
    double soloAmount = 0.0;
    int numPeepo = 0;
    String numPeopleS = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scan_total_num_people);
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.app_name) + "</font>"));

        Button next = findViewById(R.id.button4);
        Button modify = findViewById(R.id.button3);
//        Button continueWithPayment = findViewById(R.id.continueWthPayment);
//
//        continueWithPayment.setOnClickListener(epic->{
//            Intent intent = new Intent(this, addTip.class);
//            startActivity(intent);
//        });
        modify.setOnClickListener(bruh->{
            Intent intent = new Intent(this, manual_Bill.class);
            startActivity(intent);
        });

        next.setOnClickListener(moment->{
            Intent intent = new Intent(this, addFriendsToPay.class);
            startActivity(intent);
        });
    }



}