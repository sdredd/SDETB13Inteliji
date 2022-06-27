package com.syntax.class16;

public class GoogleEmployees {

    String name;
    double salary;
    static int noOfEmployees;
    static String componyName="Google";

    void displayEmployeeInfo() {
        System.out.println("Name "+name+" Company Name "+componyName);
    }

    public static void main(String[] args) {
        GoogleEmployees emp1=new GoogleEmployees();
        emp1.name="Oleg";
        emp1.salary=250000;
        emp1.noOfEmployees=1;
        emp1.displayEmployeeInfo();

        GoogleEmployees emp2=new GoogleEmployees();
        emp2.name="Sameer";
        emp2.salary=250001;
        emp2.noOfEmployees=2;
        emp2.displayEmployeeInfo();
    }
}
