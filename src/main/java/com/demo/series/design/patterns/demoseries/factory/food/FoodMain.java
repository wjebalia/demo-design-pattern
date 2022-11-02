package com.demo.series.design.patterns.demoseries.factory.food;

public class FoodMain
{
    public FoodMain() {
        FoodFactory foodFactory = new FoodFactory();
        Food pizza = foodFactory.createFoodType(FoodType.PIZZA);
        Food cola = foodFactory.createFoodType(FoodType.COLA);

        System.out.println(pizza.getType());
        System.out.println(cola.getType());

    }
}
