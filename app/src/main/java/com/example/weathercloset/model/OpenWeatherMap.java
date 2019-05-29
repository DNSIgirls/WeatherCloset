package com.example.weathercloset.model;
import android.media.MicrophoneInfo;

import java.util.List;

public class OpenWeatherMap {
    private  coord coord;
    private List<weather>  weather;
    private String base;
    private main main;
    private wind wind;
    private clouds clouds;
    private int dt;
    private sys sys;
    private int id;
    private String name;
    private int cod;

    public OpenWeatherMap() {
        this.coord = coord;
    }

    public OpenWeatherMap(com.example.weathercloset.model.coord coord, List<weather> weather, String base, com.example.weathercloset.model.main main, com.example.weathercloset.model.wind wind, com.example.weathercloset.model.clouds clouds, int dt, com.example.weathercloset.model.sys sys, int id, String name, int cod) {
        this.coord = coord;
        this.weather = weather;
        this.base = base;
        this.main = main;
        this.wind = wind;
        this.clouds = clouds;
        this.dt = dt;
        this.sys = sys;
        this.id = id;
        this.name = name;
        this.cod = cod;
    }

    public com.example.weathercloset.model.coord getCoord() {
        return coord;
    }

    public void setCoord(com.example.weathercloset.model.coord coord) {
        this.coord = coord;
    }

    public List<com.example.weathercloset.model.weather> getWeather() {
        return weather;
    }

    public void setWeather(List<com.example.weathercloset.model.weather> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public com.example.weathercloset.model.main getMain() {
        return main;
    }

    public void setMain(com.example.weathercloset.model.main main) {
        this.main = main;
    }

    public com.example.weathercloset.model.wind getWind() {
        return wind;
    }

    public void setWind(com.example.weathercloset.model.wind wind) {
        this.wind = wind;
    }

    public com.example.weathercloset.model.clouds getClouds() {
        return clouds;
    }

    public void setClouds(com.example.weathercloset.model.clouds clouds) {
        this.clouds = clouds;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
    }

    public com.example.weathercloset.model.sys getSys() {
        return sys;
    }

    public void setSys(com.example.weathercloset.model.sys sys) {
        this.sys = sys;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
