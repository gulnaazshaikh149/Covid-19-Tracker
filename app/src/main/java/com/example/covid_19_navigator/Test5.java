package com.example.covid_19_navigator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Test5 extends AppCompatActivity {

    Button yes;
    Button no;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test5);

        no = (Button) findViewById(R.id.back);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTest2();
            }


        });

        yes = (Button) findViewById(R.id.b1);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTest();
            }
        });
    }
    private void openTest(){
        Intent i = new Intent(this,Res1.class);
        startActivity(i);




    }
    private void openTest2() {
        Intent i2 = new Intent(this,Res2.class);
        startActivity(i2);
    }
}



