
package com.example.splitty;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class confirmGroupToPay extends AppCompatActivity {

    public ArrayList<String> myList;
    String customPay = "";
    public ArrayList<String> myList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_group);

        TextView groupList =  findViewById(R.id.groupTextView);
        String grpTxt = makeList();
        groupList.setText(grpTxt);

        customPay = getIntent().getStringExtra("custTotal");

        Button back = findViewById(R.id.back_btn);
        Button confirm = findViewById(R.id.con_Btn);

        myList = new ArrayList<>();
        myList.addAll(getIntent().getStringArrayListExtra("list"));


        back.setOnClickListener(s->{
            Intent i = new Intent(this, addFriends.class);
            startActivity(i);
        });

        confirm.setOnClickListener(s->{
            Intent i = new Intent(this, eachMemberPayment.class);
            i.putStringArrayListExtra("list", myList);
            i.putExtra("custTotal",customPay);
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
}
