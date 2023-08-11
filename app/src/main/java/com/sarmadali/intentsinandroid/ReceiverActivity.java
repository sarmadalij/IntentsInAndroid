package com.sarmadali.intentsinandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiverActivity extends AppCompatActivity {

    TextView text1;
    String data;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receiver);

        text1 =  findViewById(R.id.textView2);

        //here we will get the intent

        Intent intent = getIntent(); // creating a object to get the data in intent set in MainActivity
        data = intent.getStringExtra("explicitText"); // data from intent in mainactivity

        text1.setText("This is "+data); // using the data in this current activity.
    }
}