package com.example.vehiclegpstrackin;

public class MyLocation {
    private double latitude;
    private double longitude;

    public MyLocation(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public MyLocation(){}

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
