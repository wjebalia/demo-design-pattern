package com.demo.series.design.patterns.demoseries.factory.animal;

public class Cat implements Animal{

    @Override
    public String makeSound() {
        return "Miaw Miaw !";
    }

    @Override
    public AnimalType getType() {
        return AnimalType.CAT;
    }
}
