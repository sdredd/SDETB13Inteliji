package com.syntax.class16;

public class Dog {

    String name;
    String color;
    static int noOfLegs=4;

    public static void main(String[] args) {
        Dog dog1=new Dog();
        dog1.name="Tommy";
        dog1.color="pink";

        Dog dog2=new Dog();
        dog2.name="Fido";
        dog2.color="black";

        Dog dog3=new Dog();
        dog3.name="Jaja";
        dog3.color="white";

        System.out.println(dog1.name);
        System.out.println(dog2.name);
        System.out.println(dog3.name);
    }
}
