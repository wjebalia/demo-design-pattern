package com.demo.series.design.patterns.demoseries.abstractFactory;

import com.demo.series.design.patterns.demoseries.factory.animal.*;
import org.slf4j.LoggerFactory;

public class AnimalAbstractFactory implements AbstractFactory<Animal, AnimalType> {
    private static final org.slf4j.Logger Logger = LoggerFactory.getLogger(AnimalFactory.class);

    @Override
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
