package com.demo.series.design.patterns.demoseries.factory.animal;

public class Duck implements Animal{

    @Override
    public String makeSound() {
        return "Quak !";
    }

    @Override
    public AnimalType getType() {
        return AnimalType.DUCK;
    }
}
