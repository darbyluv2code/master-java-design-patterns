package com.luv2code.designpatterns.behavioral.mediator;

/**
 * Role: ConcreteColleague
 *
 * Handles billing-related support tickets.
 */
public class BillingService implements SupportService {

    @Override
    public void handleTicket(Ticket ticket) {
        System.out.println("[BillingService] Processing refund request for "
                + ticket.getCustomerName() + ": " + ticket.getMessage());
    }
}
