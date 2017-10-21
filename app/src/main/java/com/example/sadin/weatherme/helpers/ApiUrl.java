package com.example.sadin.weatherme.helpers;

import android.location.Location;

import com.example.sadin.weatherme.BuildConfig;

/**
 * Created by sadin on 21-Oct-17.
 */

public class ApiUrl {
    //private final static String API_KEY = "4a07e6b64cb836d89ef3eb1bbe626582";
    private static final String API_KEY = BuildConfig.DARK_SKY_API_KEY;
    private final static String API_LINK = "https://api.darksky.net/forecast/";
    private StringBuilder url = null;
    private String lat = "";
    private String lng = "";
    private String excludeList = "?exclude=minutely," +
            "hourly," +
            "daily," +
            "alerts," +
            "flags";

    public String getApiUrl(String latitude, String longitude) {
        url = new StringBuilder(API_LINK);
        url.append(String.format("%s/%s,%s?units=si", API_KEY, latitude, longitude));
        return url.toString();
    }
}
