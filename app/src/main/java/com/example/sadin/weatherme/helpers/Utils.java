package com.example.sadin.weatherme.helpers;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * Created by sadin on 21-Oct-17.
 */

public class Utils {
    private Context mContext;

    public Utils(Context context) {
        mContext = context;
    }

    public String convertUnixTimeToSimpleTime(Long time) {
        Date date = new Date(time * 1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd-MM-yyyy");
        return sdf.format(date);
    }

    public String getSunSimpleTime(Long time) {
        Date simpleTime = new Date((time * 1000L));
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(simpleTime);
    }

    public String getCityName(double latitude, double longitude) {
        String mCityName = "";
        Geocoder gcd = new Geocoder(mContext, Locale.getDefault());
        List<Address> addresses = null;
        try {
            addresses = gcd.getFromLocation(latitude, longitude, 1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (addresses != null) {
            if (addresses.size() > 0) {
                mCityName = addresses.get(0).getLocality() + ", " + addresses.get(0).getCountryCode();
            }
        }
        return mCityName;
    }

    public String getIconName(String icon) {
        StringBuilder sb = new StringBuilder();
        for (char c : icon.toCharArray()) {
            if (c == '-') {
                sb.append('_');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public String getWindDirection(double windBearing) {
        String directions[] = {
                "N", "NNE", "NE", "ENE", "E", "ESE",
                "SE", "SSE", "S", "SSW", "SW",
                "WSW", "W", "WNW", "NW", "NNW"};
        int val = (int) ((windBearing / 22.5) + 0.5);
        return directions[val];
    }
}
