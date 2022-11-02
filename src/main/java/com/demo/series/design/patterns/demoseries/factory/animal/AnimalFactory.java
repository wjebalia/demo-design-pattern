package com.demo.series.design.patterns.demoseries.factory.animal;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnimalFactory {

    private static final Logger Logger = LoggerFactory.getLogger(AnimalFactory.class);

    public AnimalFactory() {
        Logger.info(" This is the AnimalFactory");
    }

    public Animal create(AnimalType type) {
        Logger.info("Create a new {}", type.name());
        if (AnimalType.CAT.equals(type)) {
            return new Cat();
        }
        if (AnimalType.DUCK.equals(type)) {
            return new Duck();
        }
        return null;
    }
}
