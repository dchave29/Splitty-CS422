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

        modify.setOnClickListener(bruh->{
            Intent intent = new Intent(this, manual_Bill.class);
            startActivity(intent);
        });

        next.setOnClickListener(moment->{
            //numPeople = findViewById(R.id.totalPeopleInput2);

//            if(numPeopleS != "" || numPeopleS == null || !numPeopleS.matches(""))
//            numPeopleS = numPeople.getText().toString();
//
////            if(numPeopleS != "" || numPeopleS == null || !numPeopleS.matches(""))
//            if(!numPeopleS.matches(""))
//                numPeepo = Integer.parseInt(numPeopleS);
////            else
////                numPeepo = 0;
////            soloAmount = totalAmount / numPeepo;
//            if(numPeopleS == null || numPeepo == 0 || numPeepo == 1 || numPeopleS.matches("")) {
//                Toast.makeText(this, "Invalid total Number", Toast.LENGTH_LONG).show();
//            }
//            else
//            {
//                soloAmount = totalAmount / numPeepo;
//                Log.i("checking total", String.valueOf(soloAmount));
//                Intent intent = new Intent(this, addFriends.class);
//                intent.putExtra("numPeople", numPeepo); //num of people
//                intent.putExtra("soloAmount", soloAmount);
//                startActivity(intent);
//            }
        });
    }



}