package com.syntax.class24;

public abstract class Database {

    abstract void open();
    abstract void readData();
    abstract boolean writeData();
    public void closeDatabase(){
        System.out.println("Terminate the connection to close it");
    }
}

class Informix extends Database {

    @Override
    void open() {
        System.out.println("Opening the informix database class");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from the Informix");
    }

    @Override
    boolean writeData() {
        System.out.println("Data written successfully");
        return false;
    }
}

class mySQLServer extends Database {

    @Override
    void open() {
        System.out.println("Opening the mySQLServer database class");
    }

    @Override
    void readData() {
        System.out.println("Reading the data from the mySQLServer");
    }

    @Override
    boolean writeData() {
        System.out.println("Data written successfully");
        return false;
    }
}