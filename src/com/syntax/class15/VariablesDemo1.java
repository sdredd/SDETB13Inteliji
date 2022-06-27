package com.syntax.class15;

public class VariablesDemo1 {
    String breed; //instance
    static int num=5; //static variable

    void printName() {
        String name="Local"; //local variable
        System.out.println(name);
    }

    public static void main(String[] args) {
        VariablesDemo1 ver=new VariablesDemo1();
        ver.printName();
    }
}
