package com.syntax.class18HW;

public class Students {
    /* Write a java Class Students that have a constructor
    which takes students name and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
    NOTE: please use different names for instance and local variables. */
    String name;
    int grade1;
    int grade2;
    int grade3;

    public Students (String nameSt, int grade1St, int grade2St, int grade3St) {
        name=nameSt;
        grade1=grade1St;
        grade2=grade2St;
        grade3=grade3St;
    }

    void averageGrade () {
        System.out.println("Student "+name+" have average mark "+(grade1+grade2+grade3)/3);
    }

}
