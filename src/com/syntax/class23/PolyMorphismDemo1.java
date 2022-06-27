package com.syntax.class23;

public class PolyMorphismDemo1 {

    void doSome (String name) {
        System.out.println("downloading a movie from the internet "+name);
    }

    void doSome (int num) {
        System.out.println("colculating the text based on the rules");
    }
}


class PolyTester {
    public static void main(String[] args) {
        PolyMorphismDemo1 p=new PolyMorphismDemo1();
        p.doSome("Ozkhan");
        p.doSome(5);
    }
}