package com.andersenPractice.basepatterns.structural.bridge;

public class ScalaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Scala developer writes Scala code...");
    }
}
