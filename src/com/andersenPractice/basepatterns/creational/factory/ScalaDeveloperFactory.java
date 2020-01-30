package com.andersenPractice.basepatterns.creational.factory;

public class ScalaDeveloperFactory implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new ScalaDeveloper();
    }
}
