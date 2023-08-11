package com.sarmadali.intentsinandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ShareActivity extends AppCompatActivity {

    TextView quote;
    Button share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        //transparent status bar
        getWindow().setFlags(
                WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
                WindowManager.LayoutParams.FLAG_LAYOUT_IN_SCREEN
        );

        share = findViewById(R.id.sharebtn);
        quote = findViewById(R.id.paragraph);

        share.setOnClickListener(v -> {

            String qt = quote.getText().toString(); //text into string

            Intent sendTxt = new Intent(); //using intent to share text
            sendTxt.setAction(Intent.ACTION_SEND); // selecting action of send
            sendTxt.setType("text/plain"); // data type
            sendTxt.putExtra(Intent.EXTRA_TEXT, qt); // putting extra

            startActivity(sendTxt);

        });
    }
}