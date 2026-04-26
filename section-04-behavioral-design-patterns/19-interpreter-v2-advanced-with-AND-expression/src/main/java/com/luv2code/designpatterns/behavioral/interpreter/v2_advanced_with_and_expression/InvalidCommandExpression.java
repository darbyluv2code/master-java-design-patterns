package com.luv2code.designpatterns.behavioral.interpreter.v2_advanced_with_and_expression;

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
    public boolean interpret(ChatContext chatContext) {
        System.out.println("[Error] Invalid command: " + commandText);

        return false;
    }
}
