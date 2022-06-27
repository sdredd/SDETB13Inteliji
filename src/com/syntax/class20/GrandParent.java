package com.syntax.class20;

public class GrandParent {
    String name="Nicolay";
}

class Parent extends GrandParent {
    void printInfo () {
        System.out.println("Name of my father is "+name);
    }
}

class Child extends Parent {
    void printInfo() {
        System.out.println("Name of ny Grandpa is "+name);
    }
}

class GrandChild extends  Child {
    void printInfo () {
        System.out.println("My grand grand father name is "+name);
    }
}