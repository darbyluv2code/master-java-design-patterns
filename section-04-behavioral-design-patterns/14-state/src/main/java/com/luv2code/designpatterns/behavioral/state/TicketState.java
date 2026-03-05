package com.luv2code.designpatterns.behavioral.state;

/**
 * Role: State
 *
 * Defines the contract all concrete states must implement.
 */
public interface TicketState {

    void startWork(BugTicket ticket);

    void close(BugTicket ticket);

    void reopen(BugTicket ticket);

    Status getStatus();
}
