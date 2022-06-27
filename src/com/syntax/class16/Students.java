package com.syntax.class16;

public class Students {
    String name;
    int ID;
    static int numberOfStudents = 2;

    public static void main(String[] args) {
        Students st1=new Students();
        st1.name="Natalia";
        st1.ID=1007;
        numberOfStudents=1;

        Students st2=new Students();
        st2.name="Sergei";
        st2.ID=1008;
        numberOfStudents=2;

        Students st3=new Students();
        st3.name="Roman";
        st3.ID=1009;
        numberOfStudents=3;

        System.out.println(numberOfStudents);
    }
}
