package com.example.splitty;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class eachMemberPayment extends AppCompatActivity {

    Button notifyFriends;
    Button continueWithPayment;
    public ArrayList<String> myList;
    TextView friends;
    int numArray = 0;
    TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splitconfrmed);
        String haters = makeList();
        friends = findViewById(R.id.friends);

        notifyFriends = findViewById(R.id.notifyFriends);
        continueWithPayment = findViewById(R.id.continueWthPayment);
        continueWithPayment.setEnabled(false);
        friends.setText(haters);
        price = findViewById(R.id.price);
        price.setText(String.valueOf(numArray));

        notifyFriends.setOnClickListener(n->{
            Toast.makeText(this,"Friends have been notified", Toast.LENGTH_LONG).show();
            continueWithPayment.setEnabled(true);
        });

        continueWithPayment.setOnClickListener(c->{


        });
    }


    public String makeList(){
        myList = new ArrayList<>();
        myList.addAll(getIntent().getStringArrayListExtra("list"));
        numArray = 2892 / (myList.size() + 1);

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
