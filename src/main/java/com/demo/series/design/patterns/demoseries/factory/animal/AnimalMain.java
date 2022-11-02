package com.demo.series.design.patterns.demoseries.factory.animal;

public class AnimalMain {
    public AnimalMain() {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal cat = animalFactory.create(AnimalType.CAT);
        Animal duck = animalFactory.create(AnimalType.DUCK);
        System.out.println(cat.getType());
        System.out.println(duck.getType());
        System.out.println(cat.makeSound());
        System.out.println(duck.makeSound());
    }
}
