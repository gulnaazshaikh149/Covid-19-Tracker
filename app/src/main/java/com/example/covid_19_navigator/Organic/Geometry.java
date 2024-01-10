package com.example.covid_19_navigator.Organic;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

class Geometry {
    @SerializedName("location")
    @Expose
    private Location location;

    /**
     *
     * @return
     * The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }
}
