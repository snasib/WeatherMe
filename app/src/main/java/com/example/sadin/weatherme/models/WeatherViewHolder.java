package com.example.sadin.weatherme.models;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sadin.weatherme.R;

/**
 * Created by sadin on 10-Oct-17.
 */

public class WeatherViewHolder extends RecyclerView.ViewHolder {

    public ImageView imageWeatherIcon;
    public TextView textTemp;
    public TextView textTempDailyMax;
    public TextView textTempDailyMin;
    public TextView textLastUpdateTime;
    public TextView textSummary;
    public TextView textPressure;
    public TextView textVisibility;
    public TextView textHumidity;
    public TextView textSunriseTime;
    public TextView textSunsetTime;
    public TextView textWindDirection;
    public TextView textWindSpeed;


    public WeatherViewHolder(View view) {
        super(view);

        this.imageWeatherIcon = view.findViewById(R.id.image_weather_icon);
        this.textTemp = view.findViewById(R.id.text_temp_val);
        this.textTempDailyMax = view.findViewById(R.id.text_temp_daily_max_val);
        this.textTempDailyMin = view.findViewById(R.id.text_temp_daily_min_val);
        this.textLastUpdateTime = view.findViewById(R.id.text_lastupdate_time);
        this.textSummary = view.findViewById(R.id.text_summary);
        this.textPressure = view.findViewById(R.id.text_pressure_val);
        this.textVisibility = view.findViewById(R.id.text_visibility_val);
        this.textHumidity = view.findViewById(R.id.text_humidity_val);
        this.textSunriseTime = view.findViewById(R.id.text_sunrise_time);
        this.textSunsetTime = view.findViewById(R.id.text_sunset_time);
        this.textWindDirection = view.findViewById(R.id.text_wind_direction_val);
        this.textWindSpeed = view.findViewById(R.id.text_wind_speed_val);
    }
}
