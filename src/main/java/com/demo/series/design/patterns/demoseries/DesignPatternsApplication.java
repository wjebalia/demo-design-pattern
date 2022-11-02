package com.demo.series.design.patterns.demoseries;

import com.demo.series.design.patterns.demoseries.abstractFactory.MainAbstractFactory;
import com.demo.series.design.patterns.demoseries.factory.animal.AnimalMain;
import com.demo.series.design.patterns.demoseries.factory.food.FoodMain;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {
    public static void main(String[] args) {
        SpringApplication.run(DesignPatternsApplication.class, args);

        AnimalMain animalMain = new AnimalMain();
        FoodMain foodMain = new FoodMain();
        MainAbstractFactory mainAbstractFactory = new MainAbstractFactory();
    }

}
