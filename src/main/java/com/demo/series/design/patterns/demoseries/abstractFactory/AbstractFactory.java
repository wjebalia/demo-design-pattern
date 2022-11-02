package com.demo.series.design.patterns.demoseries.abstractFactory;

public interface AbstractFactory<T,E> {
    T create (E type);
}
