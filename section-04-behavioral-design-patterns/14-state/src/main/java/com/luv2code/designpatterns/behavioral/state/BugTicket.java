package com.luv2code.designpatterns.behavioral.state;

import java.util.ArrayList;
import java.util.List;

/**
 * Role: Context
 *
 * Holds a reference to the current TicketState
 * and delegate all operations to it,
 * with no conditional logic.
 */
public class BugTicket {

    private String id;
    private String title;
    private String description;

    private TicketState currentState;
    private List<String> comments;

    public BugTicket(String id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;

        comments = new ArrayList<>();

        // New tickets start in OPEN state
        currentState = new OpenState();

        logActivity("Ticket created in OPEN state");
    }

    // State Transition Methods
    // These methods delegate to the current state object

    public void startWork() {
        currentState.startWork(this);
    }

    public void close() {
        currentState.close(this);
    }

    public void reopen() {
        currentState.reopen(this);
    }

    public void addComment(String comment) {
        comments.add(comment);
        logActivity("Comment added: " + comment);
    }

    // State Management
    // Allow state objects to transition to ticket to a new state.

    void setState(TicketState newState) {
        Status oldStatus = currentState.getStatus();
        currentState = newState;
        logActivity("State transition: " + oldStatus + " -> " + newState.getStatus());
    }


    void logActivity(String activity) {
        System.out.println("[" + id + "]" + activity);
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getComments() {
        // Return copy to protect the internal list
        return new ArrayList<>(comments);
    }

    public Status getStatus() {
        return currentState.getStatus();
    }

    public void printStatus() {
        System.out.println("\n===============================");
        System.out.println("Ticket ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Current Status: " + getStatus());
        System.out.println("Comments: " + comments.size());
        System.out.println("===============================\n");
    }
}









