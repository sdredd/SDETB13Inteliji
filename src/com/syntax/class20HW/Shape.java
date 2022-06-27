package com.syntax.class20HW;

public class Shape {
    /* Write program: Shape class has a constructor
    that takes the radius and has a subclass as  circle class.
    In circle class create a method to calculate the area of circle.
    Test your code
     */
    double radius;

    Shape (double radius) {
        this.radius=radius;
    }
}

class Circle extends Shape {

    Circle(int radius) {
        super(radius);
    }

    public double area() {
        return Math.PI*Math.pow(radius,2);
    }
}

class Tester {
    public static void main(String[] args) {
        Circle circle=new Circle(4);
        System.out.println(circle.area());
    }
}
