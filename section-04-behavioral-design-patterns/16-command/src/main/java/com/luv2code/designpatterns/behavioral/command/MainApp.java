package com.luv2code.designpatterns.behavioral.command;

import java.util.List;

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

        System.out.println("\n--- Demo 4: Macro Command Demo ---");
        runMacroCommandDemo();
    }

    private static void runMacroCommandDemo() {

        Light officeLight = new Light("Office");
        Light bedroomLight = new Light("Bedroom");
        Thermostat thermostat = new Thermostat(16);
        RemoteControl remoteControl = new RemoteControl();

        // Build a "Good Morning" scene - one button press runs all three commands
        SmartHomeCommand goodMorningCommand = new MacroCommand("Good Morning",
                List.of(new LightOnCommand(officeLight),
                        new LightOnCommand(bedroomLight),
                        new ThermostatSetCommand(thermostat, 21)
                ));

        remoteControl.pressButton(goodMorningCommand);

        System.out.println("\n-- Undoing the entire scene with one press --");
        remoteControl.pressUndo();
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


















