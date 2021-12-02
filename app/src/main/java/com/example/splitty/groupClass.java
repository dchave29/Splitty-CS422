package com.example.splitty;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Html;
import android.view.MenuItem;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class groupClass extends AppCompatActivity {

    Context myContext;
    DatabaseHelper mDatabaseHelper;

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        RecyclerView nameView = (RecyclerView) findViewById(R.id.rv_group);

        mDatabaseHelper = new DatabaseHelper(this);
        myContext = this;
        Cursor data = mDatabaseHelper.getData();
        ArrayList<String> listData = new ArrayList<>();
        while(data.moveToNext()){
            //get the value from the database in column 1
            //then add it to the ArrayList
            listData.add(data.getString(1));
        }
        //Define the listener with a lambda and access the name of the list item from the view
        RVClickListener listener = (view,position)->{
            // Handle clicks later
            String name = listData.get(position);
        };

        gAdapter adapter = new gAdapter(listData,listener, myContext);
        nameView.setHasFixedSize(true);
        nameView.setAdapter(adapter);

        nameView.setLayoutManager(new GridLayoutManager(this, 1)); //use this line to see as a standard vertical list

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.group_list);
        Button backBtn = findViewById(R.id.hs_Button);

        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.app_name) + "</font>"));
        RecyclerView nameView = (RecyclerView) findViewById(R.id.rv_group);

        mDatabaseHelper = new DatabaseHelper(this);
        myContext = this;
        Cursor data = mDatabaseHelper.getData();
        ArrayList<String> listData = new ArrayList<>();
        while(data.moveToNext()){
            //get the value from the database in column 1
            //then add it to the ArrayList
            listData.add(data.getString(1));
        }
        //Define the listener with a lambda and access the name of the list item from the view
        RVClickListener listener = (view,position)->{
            // Handle clicks later
            String name = listData.get(position);
        };

        gAdapter adapter = new gAdapter(listData,listener, myContext);
        nameView.setHasFixedSize(true);
        nameView.setAdapter(adapter);

        nameView.setLayoutManager(new GridLayoutManager(this, 1)); //use this line to see as a standard vertical list

        backBtn.setOnClickListener(p->{
            Intent intent = new Intent(this, home_screen.class);
            startActivity(intent);
        });

    }
}
