package com.syntax.class19;

public class Parent {
    String name="Misha";
    double money= 1000000;
}

class Child extends Parent {

    void printInfo() {
        System.out.println("My full name Kristina "+name);
    }

    void buyCar () {
        System.out.println("Hehehe buing car from Papas money "+money);
    }
}

class Tester {
    public static void main(String[] args) {
        Child child=new Child();
        child.printInfo();
    }
}
