package com.example.splitty;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


/*******************************************************
 /                  manual bill class
 / Will prompt users for a
 /  subtotal, tax amount, total amount
 / and ask how it will be split
 /*******************************************************/
public class manual_Bill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manual_bill_enter);

        TextView totalPeople = findViewById(R.id.totalPeopleInput);
        TextView taxAmount = findViewById(R.id.taxAmountInput);
        TextView subAmount = findViewById(R.id.subTotalInput);
        TextView totAmount = findViewById(R.id.totalAmountInput);

    }
}
