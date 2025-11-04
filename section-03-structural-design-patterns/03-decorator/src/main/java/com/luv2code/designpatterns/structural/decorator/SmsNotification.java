package com.luv2code.designpatterns.structural.decorator;

public class SmsNotification implements Notification {

    @Override
    public void notifyUser(String message) {
        System.out.println("Sending sms: " + message);
    }

}
