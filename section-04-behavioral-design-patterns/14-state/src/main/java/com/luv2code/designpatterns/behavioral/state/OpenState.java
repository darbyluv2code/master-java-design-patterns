package com.luv2code.designpatterns.behavioral.state;

/**
 * Role: Concrete State
 *
 * Handles ticket behavior when newly created.
 * Only valid transition is to IN_PROGRESS via startWork().
 */
public class OpenState implements TicketState {

    @Override
    public void startWork(BugTicket ticket) {
        // Transition to IN_PROGRESS
        ticket.logActivity("Work started on the ticket");
        ticket.setState(new InProgressState());
    }

    @Override
    public void close(BugTicket ticket) {
        throw new IllegalStateException(
                "Cannot close ticket in " + getStatus() + " state - start work first.");
    }

    @Override
    public void reopen(BugTicket ticket) {
        throw new IllegalStateException(
                "Cannot reopen ticket in " + getStatus() + " state - ticket is already open.");
    }

    @Override
    public Status getStatus() {
        return Status.OPEN;
    }
}
