package com.luv2code.designpatterns.creational.abstractfactory;

public class UserSmsNotification implements SmsNotification {

    @Override
    public void notifyUser() {
        System.out.println("Sending User sms notification");
    }

}
