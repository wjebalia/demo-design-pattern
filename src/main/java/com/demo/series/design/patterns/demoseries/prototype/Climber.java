package com.demo.series.design.patterns.demoseries.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Objects;

public class Climber extends Plant {

    private String name;
    private static final Logger logger = LoggerFactory.getLogger(Climber.class);

    public Climber() {}

    public Climber(String color, String season) {
        super(color, season);
        logger.info(" This is the Climber");
    }

    @Override
    public Plant copy() {
        Climber climber = new Climber(this.getColor(), this.getSeason());
        climber.setName(this.name);
        return climber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Climber{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Climber climber = (Climber) o;
        return name.equals(climber.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}


