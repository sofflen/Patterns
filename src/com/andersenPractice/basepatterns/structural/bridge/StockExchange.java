package com.andersenPractice.basepatterns.structural.bridge;

public class StockExchange extends Program {
    protected StockExchange(Developer developer) {
        super(developer);
    }

    @Override
    void developProgram() {
        System.out.println("Developing stock exchange program...");
        developer.writeCode();
    }
}
