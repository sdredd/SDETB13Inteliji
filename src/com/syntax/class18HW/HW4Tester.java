package com.syntax.class18HW;

public class HW4Tester {
    public static void main(String[] args) {
        HW4 out1 =new HW4("Natalia", 18, 'A');
        System.out.println(out1.printInfo());

        HW4 out2=new HW4();
        out2.studentName="Sergei";
        out2.classNumber=58;
        out2.grade='A';
        System.out.println(out2.printInfo());
    }

}
