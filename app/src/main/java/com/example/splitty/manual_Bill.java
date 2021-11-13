package com.example.splitty;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

    int n = 0;            // total amount of people the bill will be split with
    double tax = 0.0;     // tax amount of bill
    double sub = 0.0;     // sub total amount of bill
    double total = 0.0;   // bill total amount
    double soloPay = 0.0; // how much each person will pay

    // TextView which hold user input
    TextView totalPeople;
    TextView taxAmount;
    TextView subAmount;
    TextView totAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manual_bill_enter);

        totalPeople = findViewById(R.id.totalPeopleInput);
        taxAmount = findViewById(R.id.taxAmountInput);
        subAmount = findViewById(R.id.subTotalInput);
        totAmount = findViewById(R.id.totalAmountInput);

        Button splitEven = findViewById(R.id.split_even_btn);


        // listeners for buttons
        splitEven.setOnClickListener(p->{
            //get user input at the time of button click
            String maxCheck = totalPeople.getText().toString();
            String taxCheck = taxAmount.getText().toString();
            String subCheck = subAmount.getText().toString();
            String totCheck = totAmount.getText().toString();

            checkInput(maxCheck,taxCheck,subCheck,totCheck);
            getSoloAmount();
            Toast.makeText(this, "You owe: "+ soloPay, Toast.LENGTH_LONG).show();
            Intent intent = new Intent(this, addFriends.class);
            intent.putExtra("manualPeopleNum", n);
            intent.putExtra("manualSoloPay", soloPay);
            startActivity(intent);
        });
    }

    /***********************************************************************************
    / Checks the user input if it's valid
    /   If user input is not valid user will be prompted to re-enter data
    ************************************************************************************/
    public void checkInput(String nPeople, String taxTotal, String sub_Total, String total_Amount){
        try{
            n = Integer.parseInt(nPeople);
            tax = Double.parseDouble(taxTotal);
            sub = Double.parseDouble(sub_Total);
            total = Double.parseDouble(total_Amount);
        }
        catch(Exception e){
            //invalid input clear input and prompt user to re-enter data
            totalPeople.setText("");
            taxAmount.setText("");
            subAmount.setText("");
            totAmount.setText("");
            Toast.makeText(this, "Please enter correct values", Toast.LENGTH_LONG).show();
        }

    }

    /*****************************************************************************************
    / Calculates how much each person owes
    ****************************************************************************************/
    public void getSoloAmount(){
        double soloTaxAmount = tax/n;
        double soloAmount = sub/n;

        soloPay = soloTaxAmount+soloAmount;
    }
}
