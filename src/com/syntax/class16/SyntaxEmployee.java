package com.syntax.class16;

public class SyntaxEmployee {
    int empID;
    int salary;
    static String CEO="Sumair";

    void printInfo () {
        System.out.println(empID+", salary: "+salary+", CEO: "+CEO);
    }

    public static void main(String[] args) {
        SyntaxEmployee emp1=new SyntaxEmployee();
        emp1.empID=001;
        emp1.salary=12000;

        SyntaxEmployee emp2=new SyntaxEmployee();
        emp2.empID=002;
        emp2.salary=10000;

        emp1.printInfo();
        emp2.printInfo();

    }

}
