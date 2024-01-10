package com.example.covid_19_navigator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Quarantine extends AppCompatActivity {
    Button hosp;
    Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarantine);

        help = (Button) findViewById(R.id.b2);
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHelp();
            }


        });

        hosp = (Button) findViewById(R.id.b1);
        hosp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHosp();
            }


        });
    } private void openHosp() {
        Intent hosp = new Intent(this, Map.class);
        startActivity(hosp);
    }
    private void openHelp() {
        Intent help = new Intent(this, Help.class);
        startActivity(help);

    }


}
