package com.luv2code.designpatterns.behavioral.mediator;

/**
 * Role: ConcreteColleague
 *
 * Handles technical support tickets.
 */
public class TechnicalService implements SupportService {

    @Override
    public void handleTicket(Ticket ticket) {
        System.out.println("[TechnicalService] Escalating to engineering for "
                + ticket.getCustomerName() + ": " + ticket.getMessage());
    }
}
