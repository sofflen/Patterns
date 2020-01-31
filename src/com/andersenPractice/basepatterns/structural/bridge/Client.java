package com.andersenPractice.basepatterns.structural.bridge;

public class Client {
    public static void main(String[] args) {
        Program[] programs = {
                new BankSystem(new ScalaDeveloper()),
                new StockExchange(new JavaDeveloper())
        };
        for (Program program : programs) {
            program.developProgram();
        }
    }
}
