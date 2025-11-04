package com.luv2code.designpatterns.creational.singleton.lazy;

public class DemoLogger {

    // static variable to hold the single instance
    private static DemoLogger instance;

    // private constructor to prevent external instantiation
    private DemoLogger() {
        System.out.println("Logger is initialized");
    }

    // public method to return the single instance (with lazy initialization)
    public static DemoLogger getInstance() {

        // create instance if it doesn't exist
        if (instance == null) {
            instance = new DemoLogger();
        }

        return instance;
    }

    // simple log method to display message
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}











