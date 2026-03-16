package com.luv2code.designpatterns.behavioral.command;

/**
 * Role: ConcreteCommand
 *
 * Sets the Thermostat to a target temperature.
 * Undo restores the temperature that was active
 * before execute() was called.
 */
public class ThermostatSetCommand implements SmartHomeCommand {

    private Thermostat thermostat;
    private int targetTemperatureCelsius;
    private int previousTemperatureCelsius;

    public ThermostatSetCommand(Thermostat thermostat, int targetTemperatureCelsius) {
        this.thermostat = thermostat;
        this.targetTemperatureCelsius = targetTemperatureCelsius;
    }

    @Override
    public void execute() {
        previousTemperatureCelsius = thermostat.getTemperatureCelsius();
        thermostat.setTemperatureCelsius(targetTemperatureCelsius);
    }

    @Override
    public void undo() {
        thermostat.setTemperatureCelsius(previousTemperatureCelsius);
    }

    @Override
    public String getDescription() {
        return "Set thermostat to " + targetTemperatureCelsius + "C";
    }
}
