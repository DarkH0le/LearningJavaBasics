package com.darkh0le.learningjava.ch1;

import java.awt.*;

public class Car {

    /*The class propuse is suppose to be a model
            for describe a car withe the next properties:
            - How many miles the car can run with a certain amount
            of fuel, measured in gallons.
            - The numer of the lincense plate
            - Color of the car
    */

    //Properties
    int averageMPG;
    String licensePlate;
    Color paintColor;
    boolean tailingLights;


    public Car(int inputAverageMPG, String inputLicensePlate, Color inputPaintColor, boolean inTailLights) {
        this.averageMPG = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.tailingLights = inTailLights;
    }

    public void changePaintColor(Color newPaintColor){
        this.paintColor = newPaintColor;
        System.out.println("We change your car's color to: " + this.paintColor);
    }
}
