package com.example.splitty;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class scan_Bill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scan_receipt);

        Button next1 = findViewById(R.id.scanNext);

        next1.setOnClickListener(p->{
//            Intent intent = new Intent(this, home_screen.class);
//            startActivity(intent);
            setContentView(R.layout.scan_total_num_people);
        });

//        TextView totalPeople = findViewById(R.id.totalPeopleInput);
//        TextView taxAmount = findViewById(R.id.taxAmountInput);
//        TextView subAmount = findViewById(R.id.subTotalInput);
//        TextView totAmount = findViewById(R.id.totalAmountInput);
    }
}
