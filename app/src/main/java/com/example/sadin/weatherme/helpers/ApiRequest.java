package com.example.sadin.weatherme.helpers;

import android.support.annotation.NonNull;

/**
 * Created by sadin on 09-Oct-17.
 */

public class ApiRequest {
    private final static String API_KEY = "";
    private final static String API_LINK = "https://api.darksky.net/forecast/";
    private StringBuilder url = null;
    private String lat = null;
    private String lng = null;
    private String excludeList = "?exclude=minutely," +
            "hourly," +
            "daily," +
            "alerts," +
            "flags";

    public ApiRequest(String lat, String lng) {
        this.lat = lat;
        this.lng = lng;
    }

    @NonNull
    public String getApiUrl() {
        url = new StringBuilder(API_LINK);
        url.append(String.format("%s/%s,%s?units=si", API_KEY, lat, lng));
        return url.toString();
    }
}
