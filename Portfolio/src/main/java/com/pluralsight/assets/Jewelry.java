package com.pluralsight.assets;

import com.pluralsight.model.FixedAsset;
import com.pluralsight.model.Valuable;

public class Jewelry extends FixedAsset implements Valuable {

    private double karat;

    public Jewelry(String name, double karat) {
        super(name, karat);
        this.karat = karat;
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
