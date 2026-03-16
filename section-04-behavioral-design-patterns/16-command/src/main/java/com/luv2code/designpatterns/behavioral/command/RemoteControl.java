package com.luv2code.designpatterns.behavioral.command;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Role: Invoker
 *
 * Triggers commands and maintains a history stack for undo support.
 * Depends only on the SmartHomeCommand interface.
 */
public class RemoteControl {

    private Deque<SmartHomeCommand> history = new ArrayDeque<>();

    public void pressButton(SmartHomeCommand command) {
        if (command == null) {
            throw new IllegalArgumentException("Command cannot be null");
        }

        command.execute();
        history.push(command);
    }

    public void pressUndo() {
        if (history.isEmpty()) {
            System.out.println("[Remote] Nothing to undo.");
        }

        SmartHomeCommand command = history.pop();
        System.out.println("[Remote] Undoing: " + command.getDescription());
        command.undo();
    }

    public void printHistory() {
        System.out.println("[Remote] Command History (most recent first):");

        if (history.isEmpty()) {
            System.out.println("  (empty)");
        } else {
            for (SmartHomeCommand tempCommand : history) {
                System.out.println(" - " + tempCommand.getDescription());
            }
        }
    }

}











