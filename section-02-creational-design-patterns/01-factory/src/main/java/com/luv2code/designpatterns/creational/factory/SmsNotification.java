package com.luv2code.designpatterns.creational.factory;

public class SmsNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending sms ...");
    }

}
