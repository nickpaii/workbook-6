package com.pluralsight.assets;

import com.pluralsight.model.FixedAsset;
import com.pluralsight.model.Valuable;

public class House extends FixedAsset implements Valuable {
    private int yearBuilt;
    private int squareFeet;
    private int bedrooms;

    public House(String name, Double marketValue, int yearBuilt, int squareFeet, int bedrooms) {
        super(name, marketValue);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedrooms = bedrooms;
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
