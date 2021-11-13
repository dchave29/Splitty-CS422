package com.example.splitty;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class scan_Bill extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scan_receipt);

        Button next1 = findViewById(R.id.scanNext);
//        Button next2 = findViewById(R.id.button4);
//        Button modify = findViewById(R.id.button3);

        next1.setOnClickListener(p->{
            Intent intent = new Intent(this, scanConfirmation.class);
            startActivity(intent);
//            setContentView(R.layout.scan_total_num_people);

        });

    }
}
