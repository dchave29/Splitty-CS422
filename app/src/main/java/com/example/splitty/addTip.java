package com.example.splitty;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class addTip extends AppCompatActivity implements View.OnClickListener{


    double tip = 0.0;
    double your_split = 578.41;


    double getTip(double youOwe, int percent){
        return Math.round((percent / youOwe) * 100);
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //adding the layout from add_tip
        setContentView(R.layout.add_tip);

//        //Get the intent for value purposes
//        Intent intent = getIntent();
//        String partialTotal = intent.getExtras().getString("partialTotal");

        //For now, this is por testing purposes...
        TextView what_you_owe = findViewById(R.id.youOwe);
        what_you_owe.setText(String.valueOf(your_split));

        //setting what you owe into the text field
//        TextView what_you_owe = findViewById(R.id.textView5);
//        what_you_owe.setText(your_split);

        Button _5button = findViewById(R.id._5percent);
        _5button.setOnClickListener(this);
        Button _10button = findViewById(R.id._10percent);
        _10button.setOnClickListener(this);
        Button _15button = findViewById(R.id._15percent);
        _15button.setOnClickListener(this);
        Button _20button = findViewById(R.id._20percent);
        _20button.setOnClickListener(this);





    }


    @Override
    public void onClick(View v){
        EditText tip_display =  findViewById(R.id.editTextTextPersonName2);
        switch (v.getId()) {
            case R.id._5percent:
                tip = getTip(your_split,5);
                tip_display.setText(String.valueOf(tip));
                break;
            case R.id._10percent:
                tip = getTip(your_split,10);
                tip_display.setText(String.valueOf(tip));
                break;
            case R.id._15percent:
                tip = getTip(your_split,15);
                tip_display.setText(String.valueOf(tip));
                break;

            case R.id._20percent:
                tip = getTip(your_split,20);
                tip_display.setText(String.valueOf(tip));
                break;


            default:
                break;
        }
    }



}
