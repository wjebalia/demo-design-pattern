package com.demo.series.design.patterns.demoseries.abstractFactory;

import com.demo.series.design.patterns.demoseries.factory.food.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodAbstractFactory implements AbstractFactory<Food, FoodType> {

    public static final Logger Logger = LoggerFactory.getLogger(FoodAbstractFactory.class);

    public FoodAbstractFactory() {
        Logger.info("this is FoodAbstractFactory");
    }

    @Override
    public Food create(FoodType foodType) {
        if (FoodType.PIZZA.equals(foodType)) {
            return new Pizza();
        }
        if (FoodType.COLA.equals(foodType)) {
            return new Cola();
        }
        return null;
    }
}
