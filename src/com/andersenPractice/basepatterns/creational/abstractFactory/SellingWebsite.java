package com.andersenPractice.basepatterns.creational.abstractFactory;

import com.andersenPractice.basepatterns.creational.abstractFactory.website.WebsiteTeamFactory;

public class SellingWebsite {

    public static void main(String[] args) {
        TeamFactory teamFactory = new WebsiteTeamFactory();
        System.out.println("New web project starts...");
        teamFactory.getDeveloper().writeCode();
        teamFactory.getTester().testCode();
        teamFactory.getPM().manageProject();
    }

}
