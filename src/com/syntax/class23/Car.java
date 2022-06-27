package com.syntax.class23;

public class Car {
    void start(){
        System.out.println("Use keys to start me");
    }

    void stop (){
        System.out.println("Use breaks to stop me");
    }

    void park() {
        System.out.println("you can park me manually");
    }

}

class BMW extends Car {
    @Override
    void start() {
        System.out.println("push start button");
    }

    @Override
    void stop() {
        System.out.println("autobreaking or manual breaks to stop");
    }
}

class Tesla extends Car {
    @Override
    void start() {
        System.out.println("start from app");
    }

    @Override
    void stop() {
        System.out.println("auto breaking to stop");
    }

    @Override
    void park() {
        System.out.println("I can park myself");
    }
}

class Toyota extends Car {
    @Override
    void start() {
        super.start();
    }

    @Override
    void stop() {
        super.stop();
    }

    @Override
    void park() {
        super.park();
    }
}
