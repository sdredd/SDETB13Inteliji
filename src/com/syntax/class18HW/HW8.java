package com.syntax.class18HW;

public class HW8 {
    /*Write a Student class   that have instance variables name and address.
    Create a constructor that will initialize those variables.
    Print name & address of given  student using displayInfo method.
     */
    String name;
    String address;

    HW8 (String name, String address) {
        this.name=name;
        this.address=address;
    }

    void displayInfo() {
        System.out.println(name+" "+address);
    }

    public static void main(String[] args) {
        HW8 hw8=new HW8("Jose", "street 123");
        hw8.displayInfo();
    }

}
