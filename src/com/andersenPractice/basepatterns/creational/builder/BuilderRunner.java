package com.andersenPractice.basepatterns.creational.builder;

public class BuilderRunner {
    public static void main(String[] args) {
        Director director = new Director(new EnterpriseWebsiteBuilder());
        Website epWebsite = director.buildWebsite();
        System.out.println(epWebsite);
        director.changeBuilder(new VisitCardWebsiteBuilder());
        Website vcWebsite = director.buildWebsite();
        System.out.println(vcWebsite);
    }
}
