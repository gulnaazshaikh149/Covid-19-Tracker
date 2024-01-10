
package com.example.covid_19_navigator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Test3 extends AppCompatActivity {

    Button yes;
    Button no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);
        no = (Button) findViewById(R.id.back);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTest();
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
        Intent i = new Intent(this,Test4.class);
        startActivity(i);




    }
}
