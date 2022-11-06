package com.demo.series.design.patterns.demoseries.prototype;

public abstract class Plant {

    private String color;
    private String season;


    protected Plant() {}

    protected Plant(String color, String season) {
        this.color = color;
        this.season = season;
    }

    public abstract Plant copy();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    @Override
    public String toString() {
        return "Plant{" +
                "color='" + color + '\'' +
                ", season='" + season + '\'' +
                '}';
    }
}
