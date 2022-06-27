package com.syntax.class18;

public class Laptop {
    public String make;
    public String model;
    public String storage;
    public String memory;
    public double screenSize;

    public Laptop() {
        System.out.println("Basic constraction is happening");
    }

    public Laptop (String make) {
        this.make = make;

    }

    public Laptop (String make, String model) {
       //this.make = make;
        this(make);
        this.model = model;
    }

    public Laptop (String make, String model, String storage) {
        /*this.make = make;
        this.model = model;8/
         */
        this(make, model);
        this.storage = storage;
    }
    public Laptop (String make, String model, String storage, String memory) {
        /*this.make = make;
        this.model = model;
        this.storage = storage;*/
        this(make, model, storage);
        this.memory = memory;
    }

    public Laptop(String make, String model, String storage, String memory, double screenSize) {
        /*this.make = make;
        this.model = model;
        this.storage = storage;
        this.memory = memory;*/
        this(make, model, storage, memory);
        this.screenSize = screenSize;
    }

    public static void main(String[] args) {
        Laptop apple=new Laptop("Apple", "M1Pro 14", "512", "16", 14.2);
    }
}