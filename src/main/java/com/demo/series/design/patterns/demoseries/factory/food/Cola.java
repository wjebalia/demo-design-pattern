package com.demo.series.design.patterns.demoseries.factory.food;

public class Cola implements Food {
    @Override
    public FoodType getType() {
        return FoodType.COLA;
    }
}
