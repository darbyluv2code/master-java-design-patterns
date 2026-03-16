package com.luv2code.designpatterns.behavioral.command;

/**
 * Role: Receiver
 *
 * Knows how to perform the actual lighting operations.
 * Has no knowledge of the Command pattern.
 */
public class Light {

    private String location;

    public Light(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void turnOn() {
        System.out.println("[Device] " + location + " light -> ON");
    }

    public void turnOff() {
        System.out.println("[Device] " + location + " light -> OFF");
    }

}










