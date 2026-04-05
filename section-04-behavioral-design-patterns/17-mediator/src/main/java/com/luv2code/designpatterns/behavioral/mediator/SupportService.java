package com.luv2code.designpatterns.behavioral.mediator;

/**
 * Role: Colleague
 *
 * Defines the common behavior for support services
 */
public interface SupportService {

    void handleTicket(Ticket ticket);
}
