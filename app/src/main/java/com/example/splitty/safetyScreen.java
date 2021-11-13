package com.example.splitty;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

public class safetyScreen extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.safety);

        Intent intent = getIntent();
        String easyPuzzle = intent.getExtras().getString("namesToDisplay");
        String numPeople = intent.getExtras().getString("numPeople");
        String total = intent.getExtras().getString("soloAmount");

//        Log.i("pog", total);
//        Log.i("poggy", numPeople);


//        int priceTotal = Integer.valueOf(total);
//        int peopleNum = Integer.valueOf(numPeople);
//
//        int partialTotal = priceTotal/peopleNum;




        TextView allUsers = findViewById(R.id.textView8);
        allUsers.setText(easyPuzzle);


        Button submit = findViewById(R.id.submit);
        submit.setOnClickListener(s->{

            Intent i = new Intent(this, addTip.class);
          //  i.putExtra("partialTotal", String.valueOf(partialTotal));
            startActivity(i);
        });

    }
}
