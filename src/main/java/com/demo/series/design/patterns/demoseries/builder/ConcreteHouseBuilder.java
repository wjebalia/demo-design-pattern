package com.demo.series.design.patterns.demoseries.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteHouseBuilder implements HouseBuilder {
    private static final Logger logger = LoggerFactory.getLogger(ConcreteHouseBuilder.class);
    private final House house;

    public ConcreteHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Foundation");
        logger.info("ConcreteHouseBuilder: Foundation complete...");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Structure");
        logger.info("ConcreteHouseBuilder: Structure complete...");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Roof");
        logger.info("ConcreteHouseBuilder: Roof complete...");
    }

    @Override
    public void paintHouse() {
        house.setPainted(true);
        logger.info("ConcreteHouseBuilder: Painted complete...");
    }

    @Override
    public void furnishHouse() {
        house.setFurnished(true);
        logger.info("ConcreteHouseBuilder: Furnishing complete...");
    }

    @Override
    public House getHouse() {
        logger.info("ConcreteHouseBuilder: Concrete house complete !");
        return this.house;
    }
}
