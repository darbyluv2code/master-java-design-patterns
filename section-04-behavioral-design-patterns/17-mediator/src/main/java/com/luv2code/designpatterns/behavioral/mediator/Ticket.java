package com.luv2code.designpatterns.behavioral.mediator;

/**
 * Domain object
 *
 * Represents a customer support ticket
 */
public class Ticket {

    private IssueType type;
    private String message;
    private String customerName;

    public Ticket(IssueType type, String message, String customerName) {
        this.type = type;
        this.message = message;
        this.customerName = customerName;
    }

    public IssueType getType() {
        return type;
    }

    public String getMessage() {
        return message;
    }

    public String getCustomerName() {
        return customerName;
    }
}
