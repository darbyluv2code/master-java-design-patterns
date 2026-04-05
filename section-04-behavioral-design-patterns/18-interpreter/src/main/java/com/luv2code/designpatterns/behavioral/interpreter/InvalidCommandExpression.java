package com.luv2code.designpatterns.behavioral.interpreter;

/**
 * Role: Concrete / Terminal Expression
 *
 * Handles unrecognized commands by reporting an error.
 */
public class InvalidCommandExpression implements Expression {

    private String commandText;

    public InvalidCommandExpression(String commandText) {
        this.commandText = commandText;
    }

    @Override
    public void interpret(ChatContext chatContext) {
        System.out.println("[Error] Invalid command: " + commandText);
    }
}
