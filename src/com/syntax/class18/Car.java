package com.syntax.class18;

public class Car {
    String make;
    String model;
    String color;

    public Car (String makeCar, String modelCar, String colorCar) {
        make=makeCar;
        model=modelCar;
        color=colorCar;
    }

    public Car() {

    }

    void printModel () {
        System.out.println("Model "+model);
    }

    void printInfo() {
        System.out.println("Make "+make+" Model "+model+" Color "+color);
    }


}
