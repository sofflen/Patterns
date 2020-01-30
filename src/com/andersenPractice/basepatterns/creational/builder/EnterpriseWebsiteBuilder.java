package com.andersenPractice.basepatterns.creational.builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALIFRESKO);
    }

    @Override
    void buildPrice() {
        website.setPriceUSD(10_000);
    }
}
