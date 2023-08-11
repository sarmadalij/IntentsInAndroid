package com.sarmadali.intentsinandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    TextView TextExplt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextExplt = findViewById(R.id.explicitText);

        TextExplt.setOnClickListener(v -> {

            String text = TextExplt.getText().toString();  // storing text in String
            Intent intent = new Intent(MainActivity.this, ReceiverActivity.class); // declaring the explicit intent
            intent.putExtra("explicitText", text); // extras to go with the intent || data transfer
            startActivity(intent); // start of the intent || start of the next activity

//                finish(); // to finish the intent and not to come back to same activity
        });
    }
}