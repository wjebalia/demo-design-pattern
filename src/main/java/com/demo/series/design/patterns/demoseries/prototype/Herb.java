package com.demo.series.design.patterns.demoseries.prototype;

import java.util.Objects;

public class Herb extends Plant{

    private double height;

    public Herb(String color, String season, double height) {
        super(color, season);
        this.height =  height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Herb herb = (Herb) o;
        return Double.compare(herb.height, height) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height);
    }

    @Override
    public Plant copy() {
        return new Herb(this.getColor(), this.getSeason(), this.height);
    }

    @Override
    public String toString() {
        return "Herb{" +
                "height=" + height +
                '}';
    }

}
