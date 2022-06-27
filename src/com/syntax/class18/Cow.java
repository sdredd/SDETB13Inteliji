package com.syntax.class18;

public class Cow {
    String breed;
    String color;
    int age;
    double weight;

    Cow(String breed, String color, int weight) {
        this.breed=breed;
        this.color=color;
        this.weight=weight;
    }

    String getCoeInfo() {
        return "Breed "+breed+", color "+color+", weight "+weight;
    }
}
