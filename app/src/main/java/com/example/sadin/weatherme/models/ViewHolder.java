package com.example.sadin.weatherme.models;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.sadin.weatherme.R;
import com.example.sadin.weatherme.helpers.Utils;

/**
 * Created by sadin on 21-Oct-17.
 */

public class ViewHolder {
    private Activity mActivity;
    private WeatherData mWeatherData;
    private Utils mUtils;

    private TextView textSummary;
    private TextView textLastUpdateTime;
    private TextView textTemp;
    private TextView textFeelsLike;
    private TextView textHumidity;
    private TextView textPressure;
    private TextView textVisibility;
    private TextView textCity;
    private TextView textWindSpeed;
    private TextView textWindDirection;
    private TextView textSunRise;
    private TextView textSunSet;

    private ImageView imageIcon;

    public ViewHolder(Activity activity) {
        mActivity = activity;
        mUtils = new Utils(activity.getApplicationContext());

        textSummary = mActivity.findViewById(R.id.text_summary);
        textLastUpdateTime = mActivity.findViewById(R.id.text_lastupdate_time);
        textTemp = mActivity.findViewById(R.id.text_temp_val);
        textFeelsLike = mActivity.findViewById(R.id.text_temp_feels_like);
        textHumidity = mActivity.findViewById(R.id.text_humidity_val);
        textPressure = mActivity.findViewById(R.id.text_pressure_val);
        textVisibility = mActivity.findViewById(R.id.text_visibility_val);
        textCity = mActivity.findViewById(R.id.text_city);
        textWindSpeed = mActivity.findViewById(R.id.text_wind_speed_val);
        imageIcon = mActivity.findViewById(R.id.image_weather_icon);
        textWindDirection = mActivity.findViewById(R.id.text_wind_direction_val);
        textSunRise = mActivity.findViewById(R.id.text_sunrise_time);
        textSunSet = mActivity.findViewById(R.id.text_sunset_time);
    }

    public void updateUI(WeatherData weatherData) {
        mWeatherData = weatherData;
        textSummary.setText(mWeatherData.currently.summary);
        textLastUpdateTime.setText(mUtils.convertUnixTimeToSimpleTime(mWeatherData.currently.time));
        textTemp.setText(String.format("%.0f\u00B0", mWeatherData.currently.temperature));
        textFeelsLike.setText(String.format("%s %.0f\u00B0", "Feels like", mWeatherData.currently.apparentTemperature));
        textHumidity.setText(mWeatherData.currently.humidity + "%");
        textPressure.setText(String.format("%.0fHPa", mWeatherData.currently.pressure));
        textVisibility.setText(String.format("%.0fkm", mWeatherData.currently.visibility));
        textCity.setText(mUtils.getCityName(mWeatherData.latitude, mWeatherData.longitude));
        textWindSpeed.setText(String.format("%.1f km/hour", mWeatherData.currently.windSpeed));
        imageIcon.setImageResource(mActivity.getResources().getIdentifier("drawable/" + mUtils.getIconName(mWeatherData.currently.icon), null, mActivity.getPackageName()));
        textWindDirection.setText(mUtils.getWindDirection(mWeatherData.currently.windBearing));
        textSunRise.setText(mUtils.getSunSimpleTime(mWeatherData.daily.data.get(0).sunriseTime));
        textSunSet.setText(mUtils.getSunSimpleTime(mWeatherData.daily.data.get(0).sunsetTime));
    }


}
