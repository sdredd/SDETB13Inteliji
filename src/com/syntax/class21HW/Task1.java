package com.syntax.class21HW;

public class Task1 {
    /*
    Create 1 class in which create a methods that will calculate the area (volume in case of box) of
- Rectangle
- Square
- Box
Use separate class to test your code
     */

    public void area (int length, int width) {
        System.out.println("Area of rectangle = "+(length*width));
    }

    public void  area (int length) {
        System.out.println("Area of square = "+(length*length));
    }

    public void volume (int length, int width, int height) {
        System.out.println("Volume of box = "+(length*width*height));
    }
}

class Tester {
    public static void main(String[] args) {
        Task1 task1=new Task1();
        task1.volume(3,4,5);
        task1.area(3);
        task1.area(4, 5);
    }
}

