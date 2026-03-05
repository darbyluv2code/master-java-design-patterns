package com.luv2code.designpatterns.behavioral.state;

/**
 * Role: Concrete State
 *
 * Handles ticket behavior when work is complete.
 * Supports a backward transition to OPEN via reopen().
 */
public class ClosedState implements TicketState {

    @Override
    public void startWork(BugTicket ticket) {
        throw new IllegalStateException(
                "Cannot start work on ticket in " + getStatus()
                        + " state - reopen it first.");
    }

    @Override
    public void close(BugTicket ticket) {
        throw new IllegalStateException(
                "Cannot close ticket in " + getStatus()
                        + " state - ticket is already closed.");
    }

    @Override
    public void reopen(BugTicket ticket) {
        // Closed tickets can go back to OPEN when bugs resurface
        ticket.logActivity("Ticket reopened - moving back to OPEN state");
        ticket.setState(new OpenState());
    }

    @Override
    public Status getStatus() {
        return Status.CLOSED;
    }
}
