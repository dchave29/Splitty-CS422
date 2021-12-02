package com.example.splitty;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


/*******************************************************
 /                  signUP class
 / Will prompt users for an email & password
 / Adds the user to database
 / returns a toast if sign up is successful or invalid
 /*******************************************************/
public class signUP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up_scene);

        Button signupButton = findViewById(R.id.signupbtn);
        Context context = getApplicationContext();
        CharSequence text = "Username or Password Incorrect";

        Toast toast = Toast.makeText(context, text, Toast.LENGTH_LONG);

        final String usernameA = "user";
        final String passwordA = "password";

        signupButton.setOnClickListener(p ->{
            final EditText userEditText = (EditText) findViewById(R.id.editTextTextPersonName);
            final EditText passEditText = (EditText) findViewById(R.id.editTextTextPassword);
            String username = userEditText.getText().toString();
            String password = passEditText.getText().toString();
            if((username.equals(usernameA) && password.equals(passwordA)) || (!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password)) || (username.equals(".") && password.equals("."))){
                Intent intent = new Intent(this, home_screen.class);
                startActivity(intent);
            }else{
                toast.show();
            }
        });

    }

}
