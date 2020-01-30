package com.andersenPractice.basepatterns.creational.abstractFactory.website;

import com.andersenPractice.basepatterns.creational.abstractFactory.ProjectManager;

public class WebPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manages web project...");
    }
}
