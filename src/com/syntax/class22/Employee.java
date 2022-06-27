package com.syntax.class22;

public class Employee {
    String name;
    int baseSalary=300000;
    int baseHolidays=10;

    void calculatePrintSalary() {
        System.out.println(baseSalary);
    }

    void calculatePrintHolodays() {
        System.out.println(baseHolidays);
    }

}

class Manager extends Employee {
    void calculatePrintSalary() {
        System.out.println(baseSalary*3+200000);
    }

    void calculatePrintHolodays() {
        System.out.println(baseHolidays*2);
    }
}

class QA extends Employee {
    void calculatePrintSalary() {
        System.out.println(baseSalary*2+200000);
    }

    void calculatePrintHolodays() {
        System.out.println(baseHolidays*3);
    }
}