package com.example.splitty;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


/*******************************************************
 /                  manual bill class
 / Will prompt users for a
 /  subtotal, tax amount, total amount
 / and ask how it will be split
 /*******************************************************/
public class manual_Bill extends AppCompatActivity {

    double total = 0.0;   // bill total amount

    // TextView which hold user input
    TextView totAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manual_bill_enter);
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.app_name) + "</font>"));

        totAmount = findViewById(R.id.totalAmountInput);

        Button splitEven = findViewById(R.id.split_even_btn);


        // listeners for buttons
        splitEven.setOnClickListener(p->{
            //get user input at the time of button click
            String totCheck = totAmount.getText().toString();

            checkInput(totCheck);
            Intent intent = new Intent(this, addFriendsToPay.class);
            intent.putExtra("custTotal",totCheck );
            startActivity(intent);
        });
    }

    /***********************************************************************************
    / Checks the user input if it's valid
    /   If user input is not valid user will be prompted to re-enter data
    ************************************************************************************/
    public void checkInput(String total_Amount){
        try{
            total = Double.parseDouble(total_Amount);
        }
        catch(Exception e){
            //invalid input clear input and prompt user to re-enter data
            totAmount.setText("");
        }

    }

}
