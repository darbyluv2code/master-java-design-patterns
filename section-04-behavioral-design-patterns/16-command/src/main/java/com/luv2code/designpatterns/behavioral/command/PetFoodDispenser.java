package com.luv2code.designpatterns.behavioral.command;

/**
 * Role: Receiver
 *
 * Knows how to dispense a single serving of pet food.
 * Has no knowledge of the Command pattern.
 */
public class PetFoodDispenser {

    private String petName;

    public PetFoodDispenser(String petName) {
        this.petName = petName;
    }

    public void dispense() {
        System.out.println("[Device] Dispensing one serving for " + petName);
    }
}
