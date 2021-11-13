package com.example.splitty;

import android.content.Intent;
import android.os.Bundle;
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

        TextView allUsers = findViewById(R.id.textView8);
        allUsers.setText(easyPuzzle);

    }
}
