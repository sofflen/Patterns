package com.andersenPractice.basepatterns.creational.abstractFactory.banking;

import com.andersenPractice.basepatterns.creational.abstractFactory.Developer;

public class ScalaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Scala developer writes Scala code...");
    }
}
