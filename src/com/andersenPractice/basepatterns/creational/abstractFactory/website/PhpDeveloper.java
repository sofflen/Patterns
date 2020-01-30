package com.andersenPractice.basepatterns.creational.abstractFactory.website;

import com.andersenPractice.basepatterns.creational.abstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code...");
    }
}
