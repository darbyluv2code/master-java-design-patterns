package com.luv2code.designpatterns.structural.decorator;

/**
 * Decorator that adds a signature or footer
 * to the end of a notification message.
 */
public class SignatureDecorator extends NotificationDecorator {

    private String signature;

    public SignatureDecorator(Notification wrappedNotification, String signature) {
        super(wrappedNotification);
        this.signature = signature;
    }

    @Override
    public void notifyUser(String message) {
        String signatureMessage = message + "\n---" + signature;
        super.notifyUser(signatureMessage);
    }

}
