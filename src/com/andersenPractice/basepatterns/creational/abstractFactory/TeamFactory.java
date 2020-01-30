package com.andersenPractice.basepatterns.creational.abstractFactory;

public interface TeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProjectManager getPM();
}
