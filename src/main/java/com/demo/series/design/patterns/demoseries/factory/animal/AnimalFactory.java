package com.demo.series.design.patterns.demoseries.factory.animal;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnimalFactory {

    private static final Logger logger = LoggerFactory.getLogger(AnimalFactory.class);

    public AnimalFactory() {
        logger.info(" This is the AnimalFactory");
    }

    public Animal create(AnimalType type) {
        logger.info("Create a new {}", type);
        if (AnimalType.CAT.equals(type)) {
            return new Cat();
        }
        if (AnimalType.DUCK.equals(type)) {
            return new Duck();
        }
        return null;
    }
}
