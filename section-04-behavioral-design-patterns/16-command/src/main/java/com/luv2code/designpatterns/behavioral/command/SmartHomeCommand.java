package com.luv2code.designpatterns.behavioral.command;

/**
 * Role: Command
 *
 * Declares the contract for all smart home commands.
 * Every concrete command must support execute, undo and a description.
 */
public interface SmartHomeCommand {

    void execute();

    void undo();

    String getDescription();
}
