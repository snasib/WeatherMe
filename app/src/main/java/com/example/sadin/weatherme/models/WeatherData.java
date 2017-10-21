package com.example.sadin.weatherme.models;

import java.io.Serializable;

/**
 * Created by sadin on 11-Oct-17.
 */

public class WeatherData implements Serializable {
    public double latitude;
    public double longitude;
    public String timezone;
    public Currently currently;
    public Daily daily;
    public double offset;
}
