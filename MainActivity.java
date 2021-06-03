package com.example.registration;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OnBtnClick (View view){

        //Identification Of The Users Typed Info

        TextView Firstname1 = findViewById(R.id.firstname);
        TextView lastname = findViewById(R.id.lastname);
        TextView emailaddress = findViewById(R.id.emailaddress);

        //Identification Of The Final Details

        TextView  rfirstname  = findViewById(R.id.rfirstname);
        TextView  rlastname = findViewById(R.id.rlastname);
        TextView  remailaddress  = findViewById(R.id.remailaddress);

        //The Data Transfer Code
        rfirstname.setText(Firstname1.getText().toString());
        rlastname.setText(lastname.getText().toString());
        remailaddress.setText(emailaddress.getText().toString());

    }



}


//:TODO COMPLETE THE APP FOR MAX
