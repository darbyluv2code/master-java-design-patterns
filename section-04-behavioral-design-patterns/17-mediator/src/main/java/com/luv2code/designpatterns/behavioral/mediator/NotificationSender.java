package com.luv2code.designpatterns.behavioral.mediator;

/**
 * Helper class
 *
 * Sends a confirmation message after a ticket is processed.
 */
public class NotificationSender {

    public void sendConfirmation(Ticket ticket) {
        System.out.println("[Notification] Sent to " + ticket.getCustomerName()
                + ": Your " + ticket.getType() + " ticket was received.");
    }
}
