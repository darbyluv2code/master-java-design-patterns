package com.luv2code.designpatterns.behavioral.state;

/**
 * Role: Concrete State
 *
 * Handles ticket behavior while work is in progress.
 * The only valid transition is to CLOSED via close().
 */
public class InProgressState implements TicketState {

    @Override
    public void startWork(BugTicket ticket) {
        throw new IllegalStateException(
                "Cannot start work on ticket in " + getStatus()
                        + " state - work is already in progress.");
    }

    @Override
    public void close(BugTicket ticket) {
        // Work is complete ... close the ticket
        ticket.logActivity("Ticket closed and resolved");
        ticket.setState(new ClosedState());
    }

    @Override
    public void reopen(BugTicket ticket) {
        throw new IllegalStateException(
                "Cannot reopen ticket in " + getStatus()
                        + " state - only closed tickets can be reopened.");
    }

    @Override
    public Status getStatus() {
        return Status.IN_PROGRESS;
    }
}
