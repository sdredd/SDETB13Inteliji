package com.syntax.class18HW;

public class HW2 {
    /*Create a method that will take a String
    as a parameter and returns reversed String.
    Method should be available to all classes within
    your project and accessible by class name.
     */
    public static String reversedString (String a) {
        return new StringBuilder(a).reverse().toString();
    }

}
