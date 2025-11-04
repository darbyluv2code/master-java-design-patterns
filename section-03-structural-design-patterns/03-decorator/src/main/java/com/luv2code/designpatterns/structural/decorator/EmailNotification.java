package com.luv2code.designpatterns.structural.decorator;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser(String message) {
        System.out.println("Sending email: " + message);
    }

}
