package com.andersenPractice.basepatterns.creational.abstractFactory.website;

import com.andersenPractice.basepatterns.creational.abstractFactory.Developer;
import com.andersenPractice.basepatterns.creational.abstractFactory.ProjectManager;
import com.andersenPractice.basepatterns.creational.abstractFactory.TeamFactory;
import com.andersenPractice.basepatterns.creational.abstractFactory.Tester;

public class WebsiteTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getPM() {
        return new WebPM();
    }
}
