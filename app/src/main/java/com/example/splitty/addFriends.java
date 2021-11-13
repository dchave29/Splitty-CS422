package com.example.splitty;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class addFriends extends AppCompatActivity implements View.OnClickListener{

    String names = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_group_scene);



        Intent intent = getIntent();
        String numPeople = intent.getExtras().getString("numPeople");
        String _total = intent.getExtras().getString("soloAmount");


        CheckBox box1  = findViewById(R.id.checkBox1);
        box1.setOnClickListener(this);
        CheckBox box2  = findViewById(R.id.checkBox2);
        box2.setOnClickListener(this);
        CheckBox box3  = findViewById(R.id.checkBox3);
        box3.setOnClickListener(this);
        CheckBox box4  = findViewById(R.id.checkBox4);
        box4.setOnClickListener(this);
        CheckBox box5  = findViewById(R.id.checkBox5);
        box5.setOnClickListener(this);




        Button next = findViewById(R.id.scanNext);
        next.setOnClickListener(p->{

            Intent i = new Intent(this, safetyScreen.class);
            i.putExtra("numPeople", numPeople);
            i.putExtra("soloAmount", _total);
            i.putExtra("namesToDisplay", names);
            names = "";
            startActivity(i);


        });


    }


    @Override
    public void onClick(View v){
        switch (v.getId()) {
            case R.id.checkBox1:
                CheckBox box  = findViewById(R.id.checkBox1);
                    names += String.valueOf(box.getText()) + " ,";
                break;
            case R.id.checkBox2:
                CheckBox box2  = findViewById(R.id.checkBox2);
                names += String.valueOf(box2.getText()) + " ,";
                break;
            case R.id.checkBox3:
                CheckBox box3  = findViewById(R.id.checkBox3);
                names += String.valueOf(box3.getText()) + " ,";
                break;

            case R.id.checkBox4:
                CheckBox box4  = findViewById(R.id.checkBox4);
                names += String.valueOf(box4.getText()) + " ,";
                break;

            case R.id.checkBox5:
                CheckBox box5  = findViewById(R.id.checkBox5);
                names += String.valueOf(box5.getText()) + " ,";
                break;


            default:
                break;
        }
    }

}
