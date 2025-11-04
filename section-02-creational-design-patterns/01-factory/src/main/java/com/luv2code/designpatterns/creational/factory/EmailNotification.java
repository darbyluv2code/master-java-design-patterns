package com.luv2code.designpatterns.creational.factory;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending email ...");
    }

}
