package com.pluralsight.assets;

import com.pluralsight.model.FixedAsset;
import com.pluralsight.model.Valuable;

public class Gold extends FixedAsset implements Valuable {

    private double weight;

    public Gold(String name, double weight) {
        super(name, weight);
        this.weight = weight;
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
