package com.syntax.class17;

public class Employee {
    public String name;
    private int salary;
    String departament;

    private void printSalary() {
        System.out.println("Salary "+salary);
    }

    void printDepartment() {
        System.out.println("Departament "+departament);
    }

    public void printName() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Employee emp=new Employee();
        emp.name="Joson";
        emp.departament="IT Destroyer";
        emp.salary=150000;
        emp.printName();
        emp.printDepartment();
        emp.printSalary();
    }
}
