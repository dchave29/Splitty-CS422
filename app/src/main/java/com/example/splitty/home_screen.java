package com.example.splitty;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


/*******************************************************
 /                  home_screen class
 / User will have options to add groups, add bill, add friends
 / groups and friends will not be implemented in prototype
 /*******************************************************/
public class home_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_menu);

        // sign user options buttons
        Button addFriendsBtn = findViewById(R.id.add_friends_btn);
        Button addBillBtn = findViewById(R.id.add_bill_btn);
        Button scanBillBtn = findViewById(R.id.scan_bill);
        Button addGroupBtn = findViewById(R.id.group_btn);

        //event handlers for buttons
        addBillBtn.setOnClickListener(p->{
            Intent intent = new Intent(this, manual_Bill.class);
            startActivity(intent);
        });

        scanBillBtn.setOnClickListener(p->{
            Intent intent = new Intent(this, scan_Bill.class);
            startActivity(intent);
        });
    }
}
