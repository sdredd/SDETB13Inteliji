package com.syntax.class18HW;

public class StudentsTester {
    public static void main(String[] args) {
        Students st1=new Students("Natalia", 5, 4, 3);
        Students st2=new Students("Sergei", 5, 5, 5);
        Students st3=new Students("Ahmad", 3,2,4);
        Students st4=new Students("Mumtaz", 4,4,4);
        Students st5=new Students("Armen", 3,5,2);
        st1.averageGrade();
        st2.averageGrade();
        st3.averageGrade();
        st4.averageGrade();
        st5.averageGrade();
    }


}
