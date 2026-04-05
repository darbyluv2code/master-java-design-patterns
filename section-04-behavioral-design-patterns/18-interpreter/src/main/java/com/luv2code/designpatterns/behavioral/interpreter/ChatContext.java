package com.luv2code.designpatterns.behavioral.interpreter;

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
