package com.luv2code.designpatterns.behavioral.interpreter;

/**
 * Role: Concrete / Terminal Expression
 *
 * Handles the /remind command by creating a reminder for the current user.
 */
public class RemindExpression implements Expression {

    private String reminderText;

    public RemindExpression(String reminderText) {
        this.reminderText = reminderText;
    }

    @Override
    public void interpret(ChatContext chatContext) {
        System.out.println("[Remind] Reminder created for "
                + chatContext.getCurrentUser() + ": " + reminderText);
    }
}
