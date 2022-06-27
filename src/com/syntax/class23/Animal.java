package com.syntax.class23;


public class Animal {

    Animal() {
        System.out.println("Parent");
    }

    void eat () {
        System.out.println("All the animal eat"); }
}

class Panda extends Animal {
    void eat () {
        System.out.println("All the animal eat"); }

    Panda() {
        System.out.println("Child");
    }
}

class Tester {
    public static void main(String[] args) {
        new Panda();
    }
}