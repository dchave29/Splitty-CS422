package com.example.splitty;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class scan_Bill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scan_receipt);

        TextView totalPeople = findViewById(R.id.totalPeopleInput);
        TextView taxAmount = findViewById(R.id.taxAmountInput);
        TextView subAmount = findViewById(R.id.subTotalInput);
        TextView totAmount = findViewById(R.id.totalAmountInput);
    }
}
