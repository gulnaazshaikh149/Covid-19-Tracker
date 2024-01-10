package com.example.covid_19_navigator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;
import java.util.ArrayList;

public class WorstHit extends AppCompatActivity {
    Button b2;
    Button detail;
    BarChart barChart;
    ArrayList<BarEntry> barEntry;
    ArrayList<String> labelsName;
    ArrayList<CountryData> countryDataArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_worst_hit);
        barChart = findViewById(R.id.bar);

        detail = (Button) findViewById(R.id.det);
        detail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAge();
            }


        });

        b2 = (Button) findViewById(R.id.back);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBack();
            }


        });


        barEntry = new ArrayList<>();
        labelsName = new ArrayList<>();
        countryCases();
        for (int i = 0; i < countryDataArrayList.size(); i ++){
            String country = countryDataArrayList.get(i).getCountry();
            int cases = countryDataArrayList.get(i).getCases();

            barEntry.add(new BarEntry(i, cases));
            labelsName.add(country);

        }

        BarDataSet barDataSet = new BarDataSet(barEntry, "Country");
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        Description description = new Description();
        description.setText("Data As Per 11th November");
        barChart.setDescription(description);

        BarData barData = new BarData(barDataSet);
        barChart.setData(barData);

        XAxis xAxis = barChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(labelsName));

        xAxis.setPosition(XAxis.XAxisPosition.TOP);
        xAxis.setLabelCount(labelsName.size());
        xAxis.setDrawAxisLine(false);
        xAxis.setDrawAxisLine(false);
        xAxis.setLabelRotationAngle(270);
        xAxis.setGranularity(1f);


    }
    private void countryCases(){
        countryDataArrayList.clear();

        countryDataArrayList.add(new CountryData("USA",47647745));
        countryDataArrayList.add(new CountryData("INDIA",34401670));
        countryDataArrayList.add(new CountryData("BRAZIL", 21911382));
        countryDataArrayList.add(new CountryData("UK",9406001));
        countryDataArrayList.add(new CountryData("RUSSIA",8952472));
        countryDataArrayList.add(new CountryData("TURKEY",8315424));
        countryDataArrayList.add(new CountryData("FRANCE",7244040));
        countryDataArrayList.add(new CountryData("IRAN",6019947));
        countryDataArrayList.add(new CountryData("ARGENTINA", 5300985));
        countryDataArrayList.add(new CountryData("SPAIN", 5038517));
        countryDataArrayList.add(new CountryData("COLOMBIA",5021619));
        countryDataArrayList.add(new CountryData("ITALY",4875551));
        countryDataArrayList.add(new CountryData("GERMANY",4826738));
        countryDataArrayList.add(new CountryData("INDONESIA",4249758));
        countryDataArrayList.add(new CountryData("MEXICO",3834815));

    }

    private void openAge() {
        Intent age = new Intent(this, AgrGroup.class);
        startActivity(age);

    }
    private void openBack() {
        Intent i1 = new Intent(this, HomeScreen.class);
        startActivity(i1);
    }



}
