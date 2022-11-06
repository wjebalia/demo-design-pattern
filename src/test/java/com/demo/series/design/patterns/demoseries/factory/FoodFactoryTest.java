package com.demo.series.design.patterns.demoseries.factory;

import com.demo.series.design.patterns.demoseries.factory.food.Food;
import com.demo.series.design.patterns.demoseries.factory.food.FoodFactory;
import com.demo.series.design.patterns.demoseries.factory.food.FoodType;
import org.junit.jupiter.api.Test;

class FoodFactoryTest {
    @Test
    void testFood(){
        FoodFactory foodFactory = new FoodFactory();
        Food pizza = foodFactory.createFoodType(FoodType.PIZZA);
        Food cola = foodFactory.createFoodType(FoodType.COLA);

        System.out.println(pizza.getType());
        System.out.println(cola.getType());
    }
}
