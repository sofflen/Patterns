package com.andersenPractice.basepatterns.creational.abstractFactory.banking;

import com.andersenPractice.basepatterns.creational.abstractFactory.ProjectManager;

public class BankSystemPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages banking project...");
    }
}
