package com.syntax.class23;

import java.util.concurrent.Callable;

public class CarTester {
    public static void main(String[] args) {
       /* Car car=new Tesla();
        car=new Toyota();
        car.start(); */

        BMW bmw=new BMW();
        bmw.start();
        bmw.start();
        bmw.park();

        Tesla tesla=new Tesla();
        tesla.start();
        tesla.start();
        tesla.park();

        Toyota toyota=new Toyota();
        toyota.start();
        toyota.start();
        toyota.park();

        Car car=new BMW();
        car.start();
        car.start();
        car.park();

        Car [] cars={new BMW(), new Tesla(), new Tesla()};

        for (Car c:cars) {
            c.start();
            c.park();
            c.stop();
        }

    }

}
