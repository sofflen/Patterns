package com.andersenPractice.basepatterns.creational.abstractFactory;

import com.andersenPractice.basepatterns.creational.abstractFactory.banking.BankSystemTeamFactory;

public class BankSystem {

    public static void main(String[] args) {
        TeamFactory teamFactory = new BankSystemTeamFactory();
        System.out.println("New banking project starts...");
        teamFactory.getDeveloper().writeCode();
        teamFactory.getTester().testCode();
        teamFactory.getPM().manageProject();
    }
}
