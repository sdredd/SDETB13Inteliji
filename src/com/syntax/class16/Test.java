package com.syntax.class16;

import com.syntax.class17.Employee;

public class Test {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Hello");
        str.append(" world");
        String s=str.toString().toUpperCase();
        System.out.println(s);

        Employee emp=new Employee();
        emp.name="Make";
        emp.printName();

    }
}
