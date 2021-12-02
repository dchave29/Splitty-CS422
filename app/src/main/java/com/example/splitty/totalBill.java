package com.example.splitty;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class totalBill extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.total_bill);

        String bruh = "";
        bruh = getIntent().getStringExtra("totalWithTip");
        Log.i("finding thingy", bruh);
        TextView please = findViewById(R.id.yourPrice);

        please.setText(bruh);

        Button goHome = findViewById(R.id.goHome);

        goHome.setOnClickListener(bro->{
            Intent intent = new Intent(this, home_screen.class);
            startActivity(intent);
        });
    }
}
