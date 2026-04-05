package com.luv2code.designpatterns.behavioral.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * Role: ConcreteMediator
 *
 * Coordinates ticket routing and customer notification.
 */
public class SupportCenter implements TicketMediator {

    private Map<IssueType, SupportService> supportServices;
    private NotificationSender notificationSender;

    public SupportCenter(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
        supportServices = new HashMap<>();
    }

    public void registerService(IssueType issueType, SupportService supportService) {
        supportServices.put(issueType, supportService);
    }

    @Override
    public void submitTicket(Ticket ticket) {

        System.out.println("[Mediator] Routing " + ticket.getType() + " ticket...");

        SupportService supportService = supportServices.get(ticket.getType());

        if (supportService == null) {
            throw new IllegalStateException("No service registered for: " + ticket.getType());
        }

        supportService.handleTicket(ticket);
        notificationSender.sendConfirmation(ticket);
    }
}









