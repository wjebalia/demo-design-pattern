package com.demo.series.design.patterns.demoseries.prototype;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PlantTest {

    @Test
    void testClimber(){

        Climber climber = new Climber("red","autumn");
        climber.setName("Virginia");
        Plant climberClone = climber.copy();
        Assertions.assertTrue(climberClone.equals(climber));
    }


    @Test
    void testHerb(){
        Herb herb = new Herb("Bacopa","white",5.5);
        Plant herbClone = herb.copy();
        Assertions.assertTrue(herb.equals(herbClone));
    }
}