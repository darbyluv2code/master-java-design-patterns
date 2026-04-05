package com.luv2code.designpatterns.behavioral.interpreter;

/**
 * Role: Helper (Parser)
 *
 * Parses a raw command string and builds the appropriate Expression.
 *
 * Not part of the GoF pattern itself ... this is the caller that constructs
 * and triggers the expressions.
 */
public class CommandParser {

    public Expression parse(String inputCommand) {

        if (inputCommand == null || inputCommand.isBlank()) {
            return new InvalidCommandExpression("empty input");
        }

        String trimmedInput = inputCommand.trim();
        String[] parts = trimmedInput.split("\\s+", 2);

        String commandName = parts[0];
        String argument = parts.length > 1 ? parts[1] : "";

        return switch (commandName) {
            case "/join" -> new JoinExpression(argument);
            case "/mute" -> new MuteExpression(argument);
            case "/remind" -> new RemindExpression(argument);
            default -> new InvalidCommandExpression(commandName);
        };
    }
}











