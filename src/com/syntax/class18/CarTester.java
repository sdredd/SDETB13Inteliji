package com.syntax.class18;

public class CarTester {
    public static void main(String[] args) {
        Car car1=new Car("BMW", "X8", "white");
        car1.printInfo();

        Car car2=new Car("Toyota", "Corolla", "Black");
        car2.printInfo();

        Car car=new Car();
        car.model="X2";
        car.printModel();
    }
}
