package com.syntax.class20;

public class SuperDemo {
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}

class Furniture {
    String name;
    String color="Black";
}

class Chair extends Furniture {
    String color="grey";
    void printColor() {
        String color="white";
        System.out.println(super.color);
        System.out.println(color);
        System.out.println(this.color);
    }
}
