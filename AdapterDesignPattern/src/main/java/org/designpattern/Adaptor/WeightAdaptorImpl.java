package org.designpattern.Adaptor;

import org.designpattern.Adaptee.WeightMachine;

public class WeightAdaptorImpl implements WeightAdaptor{

    WeightMachine weightMachine;
    public WeightAdaptorImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }
    @Override
    public double weightInKgs() {
        return weightMachine.weightInPounds() * 0.45;
    }
}
