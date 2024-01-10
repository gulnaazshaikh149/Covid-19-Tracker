package com.example.covid_19_navigator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {
    Button worst;
    Button test;
    Button quar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        quar = (Button) findViewById(R.id.detail);
        quar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuar();
            }

        });

        test = (Button) findViewById(R.id.back);
        test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTest();
            }


        });

        worst = (Button) findViewById(R.id.b1);
        worst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWorstHit();
            }
        });
    }
    private void openWorstHit() {
        Intent i = new Intent(this, WorstHit.class);
        startActivity(i);
    }

    private void openTest() {
        Intent i2 = new Intent(this, Test.class);
        startActivity(i2);
    }
    private void openQuar() {
        Intent i3 = new Intent(this, Quarantine.class);
        startActivity(i3);
    }

}
