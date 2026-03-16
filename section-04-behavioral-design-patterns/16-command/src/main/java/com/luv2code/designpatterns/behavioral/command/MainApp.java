package com.luv2code.designpatterns.behavioral.command;

/**
 * Role: Client
 *
 * Demonstrates the Command pattern.
 * The RemoteControl (Invoker) is reused across all demos without modification.
 */
public class MainApp {

    static void main() {

        System.out.println("--- Demo 1: Smart Home Demo ---");
        runSmartHomeDemo();

        System.out.println("\n--- Demo 2: Thermostat Demo ---");
        runThermostatDemo();

        System.out.println("\n--- Demo 3: Pet Food Demo ---");
        runPetFoodDemo();
    }

    private static void runPetFoodDemo() {

        PetFoodDispenser petFoodDispenser = new PetFoodDispenser("Max");
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.pressButton(new PetFoodDispenserCommand(petFoodDispenser));

        // Attempting undo
        remoteControl.pressUndo();
    }

    private static void runThermostatDemo() {

        Thermostat thermostat = new Thermostat(18);
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.pressButton(new ThermostatSetCommand(thermostat, 22));

        System.out.println("\n-- Undoing temperature change ---");
        remoteControl.pressUndo();
    }

    private static void runSmartHomeDemo() {

        Light livingRoomLight = new Light("Living Room");
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.pressButton(new LightOnCommand(livingRoomLight));
        remoteControl.pressButton(new LightOffCommand(livingRoomLight));

        System.out.println();
        remoteControl.printHistory();
    }
}


















