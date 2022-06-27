package com.syntax.class22;

public class AdvanceCalc {
    /*void sum(int num1, int num2) {
        System.out.println(num1+num2);
    }

    void sum(int num1, int num2, int num3) {
        System.out.println(num1+num2+num3);
    }

    void sum(int num1, int num2, int num3, int num4) {
        System.out.println(num1+num2+num3+num4);
    }*/

    static void sum (int ... arr) {
     int sum=0;
     for(int i=0; i<arr.length; i++) {
         sum+=arr[i];
     }
        System.out.println(sum);
        printNames("Alladin", "Alladin", "Aladin");
    }

    static void printNames (String ... names) {
        for(String name:names) {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        sum(2,2,3);
        //printNames("Alladin", "Alladin", "Aladin");

        int age=10;
        String name;
        if (age>18) {
            name="Time to go work";
        } else {
            name="Enjoy no work";
        }
        System.out.println(name);

        String name2=age>18? age>10? "nested im":"Time to go work":"Enjoy no work";
    }


}
