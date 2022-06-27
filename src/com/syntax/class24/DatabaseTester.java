package com.syntax.class24;

public class DatabaseTester {
    public static void main(String[] args) {

    Database [] data={new Informix(), new mySQLServer()};

    for (Database d:data) {
        d.open();
        d.readData();
        d.writeData();
        d.closeDatabase();
    }
    }
}
