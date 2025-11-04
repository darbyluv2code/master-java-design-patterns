package com.luv2code.designpatterns.creational.abstractfactory;

public class AdminNotificationFactory implements NotificationFactory {

    @Override
    public EmailNotification createEmailNotification() {
        return new AdminEmailNotification();
    }

    @Override
    public SmsNotification createSmsNotification() {
        return new AdminSmsNotification();
    }

}
