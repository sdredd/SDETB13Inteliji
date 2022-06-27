package com.syntax.class18HW;

public class HW4 {
    /* Write a java class that will have a constructor:
    one with parameters and second without any parameters.
    Create a separate Test class where you will execute
    both of the constructors 1 by 1.
     */
    String studentName;
    int classNumber;
    char grade;

    public HW4(String name, int clNum, char gr) {
        studentName=name;
        classNumber=clNum;
        grade=gr;
    }

    public HW4 () {

    }

    public String printInfo() {
        return "Name: "+studentName+" Class Number: "+classNumber+" grade: "+grade;
    }
}
