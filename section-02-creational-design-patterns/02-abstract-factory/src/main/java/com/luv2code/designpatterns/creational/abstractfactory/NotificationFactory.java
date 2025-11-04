package com.luv2code.designpatterns.creational.abstractfactory;

public interface NotificationFactory {

    EmailNotification createEmailNotification();
    SmsNotification createSmsNotification();

}
