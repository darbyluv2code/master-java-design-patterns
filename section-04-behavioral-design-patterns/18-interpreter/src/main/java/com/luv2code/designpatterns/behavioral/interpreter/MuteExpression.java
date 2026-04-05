package com.luv2code.designpatterns.behavioral.interpreter;

/**
 * Role: Concrete / Terminal Expression
 *
 * Handles the /mute command by silencing a target user.
 */
public class MuteExpression implements Expression {

    private String targetUser;

    public MuteExpression(String targetUser) {
        this.targetUser = targetUser;
    }

    @Override
    public void interpret(ChatContext chatContext) {
        System.out.println("[Mute] " + chatContext.getCurrentUser()
                + " muted user: " + targetUser);
    }
}
