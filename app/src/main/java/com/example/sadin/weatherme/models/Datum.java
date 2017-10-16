package com.example.sadin.weatherme.models;

import java.io.Serializable;

/**
 * Created by sadin on 11-Oct-17.
 */

public class Datum implements Serializable {
    public int time;
    public String summary;
    public String icon;
    public int sunriseTime;
    public int sunsetTime;
    public double moonPhase;
    public double precipIntensity;
    public double precipIntensityMax;
    public int precipIntensityMaxTime;
    public double precipProbability;
    public String precipType;
    public double temperatureHigh;
    public int temperatureHighTime;
    public double temperatureLow;
    public int temperatureLowTime;
    public double apparentTemperatureHigh;
    public int apparentTemperatureHighTime;
    public double apparentTemperatureLow;
    public int apparentTemperatureLowTime;
    public double dewPoint;
    public double humidity;
    public double pressure;
    public double windSpeed;
    public double windGust;
    public int windGustTime;
    public int windBearing;
    public double cloudCover;
    public int uvIndex;
    public int uvIndexTime;
    public double visibility;
    public double ozone;
    public double temperatureMin;
    public int temperatureMinTime;
    public double temperatureMax;
    public int temperatureMaxTime;
    public double apparentTemperatureMin;
    public int apparentTemperatureMinTime;
    public double apparentTemperatureMax;
    public int apparentTemperatureMaxTime;
}
