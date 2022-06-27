package com.syntax.class24;

public abstract class Phone {

    abstract void displayPictures();
    abstract void unlock();
    void sendText() {
        System.out.println("mesg");
    }

}

class Iphone extends Phone {

    void displayPictures () {
        System.out.println("use the photos app to display the pictures");
    }

    void unlock () {
        System.out.println("use faceID to unlock the phone");
    }
}

class Samsung extends Phone {

    @Override
    void displayPictures() {
        System.out.println("Use the Gallery to display the pictures");
    }

    @Override
    void unlock() {
        System.out.println("use finger print senser to unlock");
    }
}

class Tester {
    public static void main(String[] args) {
        Samsung samsung=new Samsung();
        samsung.displayPictures();
    }
}
