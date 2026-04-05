package com.luv2code.designpatterns.behavioral.interpreter;

/**
 * Role: Concrete / Terminal Expression
 *
 * Handles the /join command by adding the user to a chat room.
 */
public class JoinExpression implements Expression{

    private String roomName;

    public JoinExpression(String roomName) {
        this.roomName = roomName;
    }

    @Override
    public void interpret(ChatContext chatContext) {
        System.out.println("[Join] " + chatContext.getCurrentUser()
                + " joined room: " + roomName);
    }
}
