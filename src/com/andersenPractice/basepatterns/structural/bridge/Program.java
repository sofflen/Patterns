package com.andersenPractice.basepatterns.structural.bridge;

public abstract class Program {
    protected Developer developer;

    protected Program(Developer developer) {
        this.developer = developer;
    }

    abstract void developProgram();
}
