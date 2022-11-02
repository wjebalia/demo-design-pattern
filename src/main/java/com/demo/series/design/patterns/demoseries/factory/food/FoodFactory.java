package com.demo.series.design.patterns.demoseries.factory.food;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FoodFactory {

    private static final Logger Logger = LoggerFactory.getLogger(FoodFactory.class);

    public FoodFactory() {
        Logger.info(" This is the FoodFactory");
    }

    public Food createFoodType(FoodType foodType) {
        Logger.info("Create a new {}", foodType.name());
        if (FoodType.PIZZA.equals(foodType)) {
            return new Pizza();
        }
        if (FoodType.COLA.equals(foodType)) {
            return new Cola();
        }
        return null;
    }
}
