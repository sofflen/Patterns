package com.andersenPractice.basepatterns.creational.abstractFactory.banking;

import com.andersenPractice.basepatterns.creational.abstractFactory.Developer;
import com.andersenPractice.basepatterns.creational.abstractFactory.ProjectManager;
import com.andersenPractice.basepatterns.creational.abstractFactory.TeamFactory;
import com.andersenPractice.basepatterns.creational.abstractFactory.Tester;

public class BankSystemTeamFactory implements TeamFactory {
    @Override
    public Developer getDeveloper() {
        return new ScalaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getPM() {
        return new BankSystemPM();
    }
}
