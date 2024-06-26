package com.sarmadali.intentsinandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    TextView TextExplt, TextImplicit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         //transparent status bar
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
        );

        //for explicit intent
        TextExplt = findViewById(R.id.explicitText);

        TextExplt.setOnClickListener(v -> {

            String text = TextExplt.getText().toString();  // storing text in String
            Intent intent = new Intent(MainActivity.this, ReceiverActivity.class); // declaring the explicit intent
            intent.putExtra("explicitText", text); // extras to go with the intent || data transfer
            startActivity(intent); // start of the intent || start of the next activity

//                finish(); // to finish the intent and not to come back to same activity
        });

        //for implicit intent

        TextImplicit = findViewById(R.id.implicitText);

        TextImplicit.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ShareActivity.class);
            startActivity(intent);

//                finish();
        });
    }
}