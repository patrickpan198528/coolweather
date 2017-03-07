package com.example.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by Administrator on 2017/3/7.
 */

public class County extends DataSupport {
    private int id;
    private String CountyName;
    private int cityId;
    private int weatherId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return CountyName;
    }

    public void setCountyName(String countyName) {
        CountyName = countyName;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }
}
