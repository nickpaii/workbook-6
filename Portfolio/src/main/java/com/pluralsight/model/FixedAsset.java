package com.pluralsight.model;

public abstract class FixedAsset {
    private String name;
    private Double marketValue;


    public FixedAsset(String name, Double value) {
        this.name = name;
        this.marketValue = value;
    }


    public double getValue() {
        return marketValue;
    }

}
