package com.luv2code.designpatterns.creational.abstractfactory;

public class MainApp {

    public static void main(String[] args) {

        NotificationFactory factory;
        EmailNotification emailNotification;
        SmsNotification smsNotification;

        // set up for user
        factory = new UserNotificationFactory();
        emailNotification = factory.createEmailNotification();
        smsNotification = factory.createSmsNotification();

        emailNotification.notifyUser();
        smsNotification.notifyUser();

        System.out.println();

        // now do a similar thing for admin
        //
        // we can reassign variables (interface references)
        // - demonstrates polymorphism and coding to an interface
        factory = new AdminNotificationFactory();
        emailNotification = factory.createEmailNotification();
        smsNotification = factory.createSmsNotification();

        emailNotification.notifyUser();
        smsNotification.notifyUser();
    }
}






