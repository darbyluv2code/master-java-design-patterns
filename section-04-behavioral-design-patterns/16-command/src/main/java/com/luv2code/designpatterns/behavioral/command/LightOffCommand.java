package com.luv2code.designpatterns.behavioral.command;

/**
 * Role: ConcreteCommand
 *
 * Turns a Light off.
 * Undo turns the light on.
 */
public class LightOffCommand implements SmartHomeCommand {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }

    @Override
    public void undo() {
        light.turnOn();
    }

    @Override
    public String getDescription() {
        return "Turn " + light.getLocation() + " light OFF";
    }
}
