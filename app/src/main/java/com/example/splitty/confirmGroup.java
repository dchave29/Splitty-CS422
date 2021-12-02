package com.example.splitty;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class confirmGroup extends AppCompatActivity {

    public ArrayList<String> myList;
    DatabaseHelper mDatabaseHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_group);
        getSupportActionBar().setTitle(Html.fromHtml("<font color=\"black\">" + getString(R.string.app_name) + "</font>"));

        TextView groupList =  findViewById(R.id.groupTextView);
        String grpTxt = makeList();
        groupList.setText(grpTxt);

        Button back = findViewById(R.id.back_btn);
        Button confirm = findViewById(R.id.con_Btn);

        mDatabaseHelper = new DatabaseHelper(this);

        back.setOnClickListener(s->{
            Intent i = new Intent(this, addFriends.class);
            startActivity(i);
        });

        confirm.setOnClickListener(s->{
            String groupEntry = formatList(grpTxt);
            Log.i("group Entry", groupEntry);
            AddData(groupEntry);
            Intent i = new Intent(this, home_screen.class);
            startActivity(i);
        });
    }

    public String makeList(){
        myList = new ArrayList<>();
        myList.addAll(getIntent().getStringArrayListExtra("list"));
        String result = "";
        try {
            for(int k = 0; k < myList.size(); k++){
                result = result.concat(myList.get(k) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return result;
    }

    //see works cited in DatabaseHelper.java
    public void AddData(String newEntry) {
        boolean insertData = mDatabaseHelper.addData(newEntry);
        if (insertData) {
            Toast.makeText(this,"Successfully created Group", Toast.LENGTH_LONG).show();
        }
    }

    public String formatList(String newlineString){
        String res[] = newlineString.split("\\r?\\n");
        String formatedS = "";
        for(int i = 0; i < res.length-1; i++){
            formatedS = formatedS.concat(res[i] + ", ");
        }
        formatedS = formatedS.concat(res[res.length-1]);
        return formatedS;
    }
}
