package com.example.sadin.weatherme.helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

/**
 * Created by sadin on 09-Oct-17.
 */

public class ApiResponse {
    public String fetchData(String urlString) throws IOException {
        String stream = null;
        HttpsURLConnection connection = null;
        URL url = new URL(urlString);
        try {
            connection = (HttpsURLConnection) url.openConnection();
            int responseCode = connection.getResponseCode();
            if (responseCode != HttpsURLConnection.HTTP_OK) {
                throw new IOException("HTTP error code: " + responseCode);
            }
            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            stream = sb.toString();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
        return stream;
    }
}
