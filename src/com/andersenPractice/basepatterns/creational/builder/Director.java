package com.andersenPractice.basepatterns.creational.builder;

public class Director {
    private WebsiteBuilder builder;

    public Director(WebsiteBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(WebsiteBuilder builder) {
        this.builder = builder;
    }

    public Website buildWebsite() {
        builder.createWebsite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();
        return builder.getWebsite();
    }
}
