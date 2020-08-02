package com.example.weather19.Pojo;

public class Weather {
    private int id;
    private String city;
    private String tem;
    private String precipitation;
    private String wind;
    private String airQu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTem() {
        return tem;
    }

    public void setTem(String tem) {
        this.tem = tem;
    }

    public String getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(String precipitation) {
        this.precipitation = precipitation;
    }

    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getAirQu() {
        return airQu;
    }

    public void setAirQu(String airQu) {
        this.airQu = airQu;
    }


    @Override
    public String toString() {
        return "Weather{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", tem='" + tem + '\'' +
                ", precipitation='" + precipitation + '\'' +
                ", wind='" + wind + '\'' +
                ", airQu='" + airQu + '\'' +
                '}';
    }
}
