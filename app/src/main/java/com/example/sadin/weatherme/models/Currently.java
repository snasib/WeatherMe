package com.example.sadin.weatherme.models;

import java.io.Serializable;

/**
 * Created by sadin on 09-Oct-17.
 */

public class Currently implements Serializable {
    public int time;
    public String summary;
    public String icon;
    public int precipIntensity;
    public int precipProbability;
    public double temperature;
    public double apparentTemperature;
    public double dewPoint;
    public double humidity;
    public double pressure;
    public double windSpeed;
    public double windGust;
    public int windBearing;
    public double cloudCover;
    public int uvIndex;
    public double visibility;
    public double ozone;
}