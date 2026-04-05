package com.luv2code.designpatterns.behavioral.mediator;

/**
 * Demonstrates the Mediator pattern
 *
 * The SupportCenter (Mediator) coordinates communication between components.
 */
public class MainApp {

    static void main() {

        System.out.println("--- Demo: Support Ticket Routing ---");

        NotificationSender notificationSender = new NotificationSender();
        SupportCenter supportCenter = new SupportCenter(notificationSender);

        supportCenter.registerService(IssueType.BILLING, new BillingService());
        supportCenter.registerService(IssueType.TECHNICAL, new TechnicalService());

        Ticket billingTicket = new Ticket(
                IssueType.BILLING,
                "Refund not processed",
                "Alice"
        );

        Ticket technicalTicket = new Ticket(
                IssueType.TECHNICAL,
                "App is crashing",
                "Bob"
        );

        supportCenter.submitTicket(billingTicket);

        System.out.println();

        supportCenter.submitTicket(technicalTicket);
    }
}









