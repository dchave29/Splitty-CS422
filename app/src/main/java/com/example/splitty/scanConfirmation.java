package com.example.splitty;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class scanConfirmation extends AppCompatActivity {

    String numPeople = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scan_total_num_people);

        Button next = findViewById(R.id.button4);
        Button modify = findViewById(R.id.button3);


        EditText et = findViewById(R.id.totalPeopleInput2);

        et.setOnKeyListener(new View.OnKeyListener() {

            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {

                numPeople = String.valueOf(et.getText());
                return true;
            }
        });




        modify.setOnClickListener(bruh->{
            Intent intent = new Intent(this, manual_Bill.class);
            startActivity(intent);
        });

        next.setOnClickListener(moment->{
            Intent intent = new Intent(this, addFriends.class);
            intent.putExtra("numPeople", numPeople);
            startActivity(intent);
        });
    }


}