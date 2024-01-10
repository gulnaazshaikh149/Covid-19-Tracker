package com.example.covid_19_navigator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Help extends AppCompatActivity {

    Button help1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        help1 = (Button) findViewById(R.id.b1);
        help1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelpMed();
            }


        });
    }
    private void openHelpMed() {
        Intent i = new Intent(this, HelpMeds.class);
        startActivity(i);
    }
}
