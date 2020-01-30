package com.andersenPractice.basepatterns.creational.abstractFactory.website;

import com.andersenPractice.basepatterns.creational.abstractFactory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual tester tests code manually...");
    }
}
