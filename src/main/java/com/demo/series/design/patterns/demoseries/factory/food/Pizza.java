package com.demo.series.design.patterns.demoseries.factory.food;

public class Pizza implements Food {
    @Override
    public FoodType getType() {
        return FoodType.PIZZA;
    }
}
