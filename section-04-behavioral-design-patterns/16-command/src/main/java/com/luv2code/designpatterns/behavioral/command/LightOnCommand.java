package com.luv2code.designpatterns.behavioral.command;

/**
 * Role: ConcreteCommand
 *
 * Turns a Light on.
 * Undo turns the light off.
 */
public class LightOnCommand implements SmartHomeCommand {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }

    @Override
    public void undo() {
        light.turnOff();
    }

    @Override
    public String getDescription() {
        return "Turn " + light.getLocation() + " light ON";
    }
}
