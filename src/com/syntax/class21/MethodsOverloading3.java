package com.syntax.class21;

public class MethodsOverloading3 {

    void method () {
        System.out.println("1");
    }

    void method(String name) {
        System.out.println("2");
    }

    void method(String name, int num) {
        System.out.println("3");
    }

    void method(int num2, int num) {
        System.out.println("4");
    }

    void method(int num2, String name) {
        System.out.println("5");
    }

    public static void main(String[] args) {
        MethodsOverloading3 methodsOverloading3=new MethodsOverloading3();
        methodsOverloading3.method("Hammid", 50);
    }
}
