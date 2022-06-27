package com.syntax.class18HW;

public class HW6 {
    /* Write a java class that have 4 constructors with
    4 different access levels of constructors(private,public,default,protected)
    and create 4 objects of this class: 1 - inside same class; 2 - from outside the class;
    3 - from different class inside different package  and observe result.
     */
   private HW6 () {
        System.out.println("private");
    }

    HW6 (String name) {
        System.out.println("default");
    }

    protected HW6 (int num) {
        System.out.println("protected");
    }

    public HW6 (boolean flag) {
        System.out.println("public");
    }

    public static void main(String[] args) {
        new HW6();
        new HW6("Nataly");
        new HW6(5);
        new HW6(true);
    }

}
