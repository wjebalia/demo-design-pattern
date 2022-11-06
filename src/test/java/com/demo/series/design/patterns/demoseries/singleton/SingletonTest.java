package com.demo.series.design.patterns.demoseries.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SingletonTest {

    @Test
    void singletonTest() {
        Singleton singleton = Singleton.getInstance();
        Assertions.assertNotNull(singleton);
    }

}