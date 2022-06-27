package com.syntax.class17;

import com.syntax.class16.Dog;

public class ConstractorDemos {

    String name;
    String breed;
    String color;
    int age;
    double weight;

    ConstractorDemos(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight) {
        name=dogName;
        breed=dogBreed;
        color=dogColor;
        if (dogAge<25) {
            age=dogAge;
        } else {
            System.out.println("Dog age can't provided");
        }
        weight=dogWeight;
    }



    void printInfo () {
        System.out.println("Name "+name+" Breed "+breed+" color "+color+" Weight "+weight);
    }

    public static void main(String[] args) {
       /* ConstractorDemos dog1=new ConstractorDemos();
        dog1.name="Lofy";
        dog1.breed="German";
        dog1.color="Black";
        dog1.age=2;
        dog1.weight=20;
        dog1.printInfo();
        */
    }


}
