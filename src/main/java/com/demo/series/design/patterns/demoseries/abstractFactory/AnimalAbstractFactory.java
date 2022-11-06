package com.demo.series.design.patterns.demoseries.abstractFactory;

import com.demo.series.design.patterns.demoseries.factory.animal.Animal;
import com.demo.series.design.patterns.demoseries.factory.animal.AnimalType;
import com.demo.series.design.patterns.demoseries.factory.animal.Cat;
import com.demo.series.design.patterns.demoseries.factory.animal.Duck;
import org.slf4j.LoggerFactory;

public class AnimalAbstractFactory implements AbstractFactory<Animal, AnimalType> {
    private static final org.slf4j.Logger Logger = LoggerFactory.getLogger(AnimalAbstractFactory.class);

    @Override
    public Animal create(AnimalType type) {
        Logger.info("Create a new {}", type);
        if (AnimalType.CAT.equals(type)) {
            return new Cat();
        }
        if (AnimalType.DUCK.equals(type)) {
            return new Duck();
        }
        return null;
    }
}
