package com.luv2code.designpatterns.creational.singleton.threadsafe;

public class MainApp {

    public static void main(String[] args) {

        DemoLogger instance1 = DemoLogger.getInstance();
        instance1.log("Welcome to the Student Center");

        DemoLogger instance2 = DemoLogger.getInstance();
        instance2.log("Enjoy the course!");

        System.out.println();

        boolean flag = (instance1 == instance2);
        System.out.println("Are the logger instances the same? " + flag);

    }

}
