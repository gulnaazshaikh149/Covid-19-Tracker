package com.example.covid_19_navigator;

public class CountryData {
    String country;
    int cases;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCases() {
        return cases;
    }

    public void setCases(int cases) {
        this.cases = cases;
    }

    public CountryData(String country, int cases) {
        this.country = country;
        this.cases = cases;
    }
}