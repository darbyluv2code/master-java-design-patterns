package com.luv2code.designpatterns.structural.decorator;

public class UpperCaseDecorator extends NotificationDecorator {

    public UpperCaseDecorator(Notification wrappedNotification) {
        super(wrappedNotification);
    }

    @Override
    public void notifyUser(String message) {
        String upperCaseMessage = message.toUpperCase();
        super.notifyUser(upperCaseMessage);
    }

}
