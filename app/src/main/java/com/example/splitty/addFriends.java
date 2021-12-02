package com.example.splitty;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class addFriends extends AppCompatActivity {

    Context myContext;
    ArrayList<String> myList;

    ArrayList<String> groupList = new ArrayList<>();

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        RecyclerView nameView = (RecyclerView) findViewById(R.id.recyler_view);
        groupList = new ArrayList<>();

        List<String> names = Arrays.asList("Joe Hummel", "Chris Kanich","John Bell", "Joseph Joestar","Giornnio Giovanna", "Dio Brando" , "Caesar Zeppeli", "Jean Pierre Polnareff");
        myList = new ArrayList<>();
        myList.addAll(names);

        myContext = this;

        //Testing
        //Define the listener with a lambda and access the name of the list item from the view
        RVClickListener listener = (view,position)->{
            Log.i("1pos", String.valueOf(position));
            if(groupList.contains(myList.get(position))){
                Log.i("check1", "remove");
                groupList.remove(myList.get(position));
            }
            else{
                Log.i("check1", "add");
                groupList.add(myList.get(position));
            }
        };

        fAdapter adapter = new fAdapter(myList, listener, myContext);
        nameView.setHasFixedSize(true);
        nameView.setAdapter(adapter);

        nameView.setLayoutManager(new GridLayoutManager(this, 1)); //use this line to see as a standard vertical list

        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_group_scene);
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.app_name) + "</font>"));
        RecyclerView nameView = (RecyclerView) findViewById(R.id.recyler_view);
        groupList = new ArrayList<>();
        List<String> names = Arrays.asList("Joe Hummel", "Chris Kanich","John Bell", "Joseph Joestar","Giornnio Giovanna", "Dio Brando" , "Caesar Zeppeli", "Jean Pierre Polnareff");
        myList = new ArrayList<>();
        myList.addAll(names);

        myContext = this;

        //Define the listener with a lambda and access the name of the list item from the view
        RVClickListener listener = (view,position)->{
            Log.i("2pos", String.valueOf(position));
            if(groupList.contains(myList.get(position))){
                Log.i("check2", "remove");
                groupList.remove(myList.get(position));
            }
            else{
                Log.i("check2", "add");
                groupList.add(myList.get(position));
            }
        };

        fAdapter adapter = new fAdapter(myList, listener, myContext);
        nameView.setHasFixedSize(true);
        nameView.setAdapter(adapter);

        nameView.setLayoutManager(new GridLayoutManager(this, 1)); //use this line to see as a standard vertical list

        Button nextBtn = findViewById(R.id.scanNext);
        nextBtn.setOnClickListener(p->{
            if(groupList.size() == 0){
                Toast.makeText(this,"Please select at least one friend", Toast.LENGTH_LONG).show();
            }
            else{
                try {
                    Intent intent = new Intent(this, confirmGroup.class);
                    intent.putStringArrayListExtra("list", groupList);
                    startActivity(intent);
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
                /*
                for(int k = 0; k < groupList.size(); k++){
                    Log.i("plz bro", groupList.get(k));
                }
                */
            }
        });

    }
}