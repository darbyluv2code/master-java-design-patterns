package com.luv2code.designpatterns.creational.singleton.threadsafe;

public class DemoLogger {

    // static variable to hold the single instance
    private static DemoLogger instance;

    // private constructor to prevent external instantiation
    private DemoLogger() {
        System.out.println("Logger is initialized");
    }

    // public method to return the single instance
    //
    // synchronized method to make it thread-safe (one thread at a time)
    public synchronized static DemoLogger getInstance() {

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











