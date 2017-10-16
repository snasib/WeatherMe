package com.example.sadin.weatherme.models;

import java.io.Serializable;
import java.util.List;

/**
 * Created by sadin on 11-Oct-17.
 */

public class Daily implements Serializable {
    public String summary;
    public String icon;
    public List<Datum> data = null;
}
