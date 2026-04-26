package com.luv2code.designpatterns.behavioral.interpreter.v2_advanced_with_and_expression;

/**
 * Role: Context
 *
 * Holds the shared state passed to every expression during interpretation.
 */
public class ChatContext {

    private String currentUser;

    public ChatContext(String currentUser) {
        this.currentUser = currentUser;
    }

    public String getCurrentUser() {
        return currentUser;
    }
}
