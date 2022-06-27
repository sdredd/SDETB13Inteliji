package com.syntax.class21;

public class MethodOverloading {

    static void add(int num1, int num2) {
        System.out.println(num1+num2);
    }

    static void addDoubles (double num1, double num2) {
        System.out.println(num1+num2);
    }
    static void add3Doubles (double num1, double num2, double num3) {
        System.out.println(num1+num2+num3);
    }
    static void add(int num1, int num2, int num3,int num4) {
        System.out.println(num1+num2+num3+num4);
    }

    public static void main(String[] args) {
        add(20,20);
        addDoubles(2.2, 3.3);
    }
}
