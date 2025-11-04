package com.luv2code.designpatterns.creational.singleton.eager;

public class DemoLogger {

    // static variable to hold the single instance
    //
    // create the single instance when the class is loaded
    private static final DemoLogger instance = new DemoLogger();

    // private constructor to prevent external instantiation
    private DemoLogger() {
        System.out.println("Logger is initialized");
    }

    // public method to return the single instance
    public static DemoLogger getInstance() {

        return instance;
    }

    // simple log method to display message
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}











