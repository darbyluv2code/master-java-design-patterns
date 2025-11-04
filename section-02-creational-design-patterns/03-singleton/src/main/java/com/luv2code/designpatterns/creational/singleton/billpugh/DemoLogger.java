package com.luv2code.designpatterns.creational.singleton.billpugh;

public class DemoLogger {

    // private constructor to prevent external instantiation
    private DemoLogger() {
        System.out.println("Logger is initialized");
    }

    // Static inner class holds the single instance
    // This inner class is not loaded until getInstance() is called (lazy init)
    // This provides lazy initialization and is threadsafe without synchronized
    private static class SingletonHelper {
        private static final DemoLogger INSTANCE = new DemoLogger();
    }

    // public method to return the single instance
    public static DemoLogger getInstance() {

        return SingletonHelper.INSTANCE;
    }

    // simple log method to display message
    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}











