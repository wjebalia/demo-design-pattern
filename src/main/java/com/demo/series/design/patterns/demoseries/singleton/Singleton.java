package com.demo.series.design.patterns.demoseries.singleton;

public class Singleton {

    public static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
