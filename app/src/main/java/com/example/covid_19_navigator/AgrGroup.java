package com.example.covid_19_navigator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

public class AgrGroup extends AppCompatActivity {

    BarChart barChart;
    Button bck;
    ArrayList<BarEntry> barEntry;
    ArrayList<String> labelsName;
    ArrayList<CountryData> countryDataArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agr_group);

        barChart = findViewById(R.id.bar);
        bck = (Button) findViewById(R.id.ageback);
        bck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAgeback();
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

        countryDataArrayList.add(new CountryData("MAHARASHTRA", 6620423));
        countryDataArrayList.add(new CountryData("KERELA",5034858));
        countryDataArrayList.add(new CountryData("KARNATAKA",2990856));
        countryDataArrayList.add(new CountryData("TAMIL NADU",2711584));
        countryDataArrayList.add(new CountryData("ANDHRA PRADESH",2069066));
        countryDataArrayList.add(new CountryData("UTTAR PRADESH",1710236));
        countryDataArrayList.add(new CountryData("WEST BENGAL",1600732));
        countryDataArrayList.add(new CountryData("DELHI",1440230));
        countryDataArrayList.add(new CountryData("ODISHA",1044428));
        countryDataArrayList.add(new CountryData("CHHATTISGARH",1006245));


    }
    private void openAgeback() {
        Intent ageback = new Intent(this, WorstHit.class);
        startActivity(ageback);
    }
}
