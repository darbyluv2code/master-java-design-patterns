package com.luv2code.designpatterns.behavioral.command;

/**
 * Role: Receiver
 *
 * Knows how to perform temperature changes.
 * Has no knowledge of the Command pattern.
 */
public class Thermostat {

    private int temperatureCelsius;

    public Thermostat(int temperatureCelsius) {
        this.temperatureCelsius = temperatureCelsius;
    }

    public int getTemperatureCelsius() {
        return temperatureCelsius;
    }

    public void setTemperatureCelsius(int temperatureCelsius) {
        System.out.println("[Device] Thermostat: " + this.temperatureCelsius
                + "C -> " + temperatureCelsius + "C");
        this.temperatureCelsius = temperatureCelsius;
    }
}
