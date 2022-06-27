package com.syntax.class17;

public class DogTester {
    public static void main(String[] args) {
        ConstractorDemos dog=new ConstractorDemos("Lo", "Russian",
                "white", 3, 33);
        dog.printInfo();

        ConstractorDemos dog2=new ConstractorDemos("Port", "German",
                "black", 24, 3);
        dog2.printInfo();
    }
}
