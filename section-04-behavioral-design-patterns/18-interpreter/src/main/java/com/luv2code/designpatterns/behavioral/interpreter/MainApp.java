package com.luv2code.designpatterns.behavioral.interpreter;

/**
 * Role: Client
 *
 * Drives the demo by sending sample chat commands through the interpreter.
 */
public class MainApp {

    static void main() {

        System.out.println("--- Demo: Chat Command Interpreter ---");

        CommandParser commandParser = new CommandParser();

        runCommand("/join java-room", "Angel", commandParser);
        runCommand("/mute Liam", "Angel", commandParser);
        runCommand("/remind Team meeting at 3pm", "Angel", commandParser);
        runCommand("/dance now", "Angel", commandParser);

    }

    private static void runCommand(String inputCommand,
                                   String currentUser,
                                   CommandParser commandParser) {

        ChatContext chatContext = new ChatContext(currentUser);

        System.out.println("\nInput: " + inputCommand);

        Expression parsedExpression = commandParser.parse(inputCommand);
        parsedExpression.interpret(chatContext);
    }
}









