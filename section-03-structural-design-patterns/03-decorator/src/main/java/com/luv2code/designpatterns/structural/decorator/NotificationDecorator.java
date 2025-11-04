package com.luv2code.designpatterns.structural.decorator;

/**
 * Abstract decorator that wraps a Notification
 * and forwards calls to it.
 */
public abstract class NotificationDecorator  implements Notification {

    private Notification wrappedNotification;

    public NotificationDecorator(Notification wrappedNotification) {
        this.wrappedNotification = wrappedNotification;
    }

    @Override
    public void notifyUser(String message) {
        wrappedNotification.notifyUser(message);
    }

}
