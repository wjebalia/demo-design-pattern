package com.demo.series.design.patterns.demoseries.factory;

import com.demo.series.design.patterns.demoseries.factory.animal.Animal;
import com.demo.series.design.patterns.demoseries.factory.animal.AnimalFactory;
import com.demo.series.design.patterns.demoseries.factory.animal.AnimalType;
import org.junit.jupiter.api.Test;

class AnimalFactoryTest {
    @Test
    void testAnimalFactory(){
        AnimalFactory animalFactory = new AnimalFactory();
        Animal cat = animalFactory.create(AnimalType.CAT);
        Animal duck = animalFactory.create(AnimalType.DUCK);
        System.out.println(cat.getType());
        System.out.println(duck.getType());
        System.out.println(cat.makeSound());
        System.out.println(duck.makeSound());
    }
}