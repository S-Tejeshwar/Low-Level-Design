package org.designpattern;

import org.designpattern.Adaptee.WeightMachineBaby;
import org.designpattern.Adaptor.WeightAdaptor;
import org.designpattern.Adaptor.WeightAdaptorImpl;

public class Main {
    public static void main(String[] args) {
        WeightAdaptor weightAdaptor = new WeightAdaptorImpl(new WeightMachineBaby());
        System.out.println(weightAdaptor.weightInKgs());
    }
}