package com.syntax.class21HW;

public class Task4 {
    /*
    Create 1 class with a private method that has 3 overloaded forms.
    Then call each overloaded method with specific arguments and observe result.
     */
}

class Kitchen {

    private void include (int cabinet) {
        System.out.println("Kitchen include "+cabinet+" cabinets");
    }

    private  void include (int cabinet, String brand) {
        System.out.println("Kitchen include "+cabinet+" cabinets brand "+brand);
    }

    private  void include (int cabinet, String brand, String appliance) {
        System.out.println("Kitchen include " + cabinet + " cabinets brand " + brand +" and "+appliance);
    }

    public static void main(String[] args) {
        Kitchen kitchen=new Kitchen();
        kitchen.include(5);
        kitchen.include(7, "daana");
        kitchen.include(6, "faka", "oven");
    }

}
