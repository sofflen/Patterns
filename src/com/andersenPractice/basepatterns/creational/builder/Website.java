package com.andersenPractice.basepatterns.creational.builder;

public class Website {
    private String name;
    private Cms cms;
    private int priceUSD;

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    public void setPriceUSD(int priceUSD) {
        this.priceUSD = priceUSD;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cms=" + cms +
                ", priceUSD=" + priceUSD +
                '}';
    }
}
