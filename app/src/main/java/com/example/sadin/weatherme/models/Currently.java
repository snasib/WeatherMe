package com.example.sadin.weatherme.models;

import java.io.Serializable;

/**
 * Created by sadin on 09-Oct-17.
 */

public class Currently implements Serializable {
    public long time;
    public String summary;
    public String icon;
    public double precipIntensity;
    public double precipProbability;
    public double temperature;
    public double apparentTemperature;
    public double dewPoint;
    public double humidity;
    public double pressure;
    public double windSpeed;
    public double windGust;
    public double windBearing;
    public double cloudCover;
    public double uvIndex;
    public double visibility;
    public double ozone;

}