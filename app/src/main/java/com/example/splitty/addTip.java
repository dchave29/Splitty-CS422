package com.example.splitty;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class addTip extends AppCompatActivity implements View.OnClickListener{


    double tip = 0.0;
    int your_split = 0;

    double getTip(int youOwe, int percent){
        return (percent / youOwe) * 100;
    }





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //adding the layout from add_tip
        setContentView(R.layout.add_tip);

        //Get the intent for value purposes


        //For now, this is por testing purposes...
        your_split = 123;

        //setting what you owe into the text field
//        TextView what_you_owe = findViewById(R.id.textView5);
//        what_you_owe.setText(your_split);



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
