package com.example.splitty;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class scanConfirmation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scan_total_num_people);

        Button next = findViewById(R.id.button4);
        Button modify = findViewById(R.id.button3);

        modify.setOnClickListener(bruh->{
            Intent intent = new Intent(this, manual_Bill.class);
            startActivity(intent);
        });

        next.setOnClickListener(moment->{
            Intent intent = new Intent(this, addFriends.class);
            startActivity(intent);
        });
    }


}