package com.demo.series.design.patterns.demoseries.abstractFactory;

import com.demo.series.design.patterns.demoseries.factory.animal.Animal;
import com.demo.series.design.patterns.demoseries.factory.animal.AnimalType;
import com.demo.series.design.patterns.demoseries.factory.food.Food;
import com.demo.series.design.patterns.demoseries.factory.food.FoodType;

public class MainAbstractFactory {

    public MainAbstractFactory() {
        AnimalAbstractFactory animalAbstractFactory = new AnimalAbstractFactory();
        Animal cat = animalAbstractFactory.create(AnimalType.CAT);
        System.out.println(cat.getType());


        FoodAbstractFactory foodAbstractFactory = new FoodAbstractFactory();
        Food pizza = foodAbstractFactory.create(FoodType.PIZZA);
        System.out.println(pizza.getType());

    }
}
