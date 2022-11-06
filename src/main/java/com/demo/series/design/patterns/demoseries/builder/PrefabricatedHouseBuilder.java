package com.demo.series.design.patterns.demoseries.builder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PrefabricatedHouseBuilder implements HouseBuilder {

    private static final Logger logger = LoggerFactory.getLogger(PrefabricatedHouseBuilder.class);

    private final House house;

    public PrefabricatedHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildFoundation() {
        house.setFoundation("Wood, laminate, and PVC flooring");
        logger.info("PrefabricatedHouseBuilder: Foundation complete...");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Structural steels and wooden wall panels");
        logger.info("PrefabricatedHouseBuilder: Structure complete...");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Roofing sheets");
        logger.info("PrefabricatedHouseBuilder: Roof complete...");
    }

    @Override
    public void paintHouse() {
        house.setPainted(false);
        logger.info("PrefabricatedHouseBuilder: Painting not required...");
    }

    @Override
    public void furnishHouse() {
        house.setFurnished(true);
        logger.info("PrefabricatedHouseBuilder: Furnishing complete...");
    }

    public House getHouse() {
        logger.info("PrefabricatedHouseBuilder: Prefabricated house complete...");
        return this.house;
    }
}