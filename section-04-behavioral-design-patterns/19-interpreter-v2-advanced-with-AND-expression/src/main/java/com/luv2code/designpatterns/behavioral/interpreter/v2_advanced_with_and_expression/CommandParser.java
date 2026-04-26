package com.luv2code.designpatterns.behavioral.interpreter.v2_advanced_with_and_expression;

/**
 * Role: Helper (Parser)
 *
 * Parses a raw command string and builds the appropriate Expression.
 *
 * Not part of the GoF pattern itself ... this is the caller that constructs
 * and triggers the expressions.
 */
public class CommandParser {

    private static final String AND_SEPARATOR = " AND ";

    public Expression parse(String inputCommand) {

        if (inputCommand == null || inputCommand.isBlank()) {
            return new InvalidCommandExpression("empty input");
        }

        String trimmedInput = inputCommand.trim();

        // check for AND expressions
        int andIndex = trimmedInput.indexOf(AND_SEPARATOR);
        if (andIndex != -1) {
            // we found AND
            String leftInput = trimmedInput.substring(0, andIndex).trim();
            String rightInput = trimmedInput.substring(andIndex + AND_SEPARATOR.length()).trim();
            return new AndExpression(parse(leftInput), parse(rightInput));
        }

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











