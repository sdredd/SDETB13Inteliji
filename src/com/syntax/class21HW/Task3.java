package com.syntax.class21HW;

public class Task3 {
    /*
    Create 1 class with a static method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
    public static void main(String[] args) {
        School.Rooms();
        School.Rooms(5);
        School.Rooms(10,2);
    }
}

class School {

    public static void Rooms () {
        System.out.println("it is not known how many rooms in the school");
    }

    public static void Rooms (int room) {
        System.out.println("it is "+room+" rooms in the school");
    }

    public static void Rooms (int room, int bathroom) {
        System.out.println("it is "+room+" rooms and "+bathroom+"bathrooms in the school");
    }
}
