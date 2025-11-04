package com.luv2code.designpatterns.creational.factory;

public class MainApp {

    public static void main(String[] args) {

        Notification emailNotification = NotificationFactory.createNotification("email");
        emailNotification.notifyUser();

        Notification smsNotification = NotificationFactory.createNotification("sms");
        smsNotification.notifyUser();

        Notification whatsappNotification = NotificationFactory.createNotification("whatsapp");
        whatsappNotification.notifyUser();

        // Notification pushNotification = NotificationFactory.createNotification("push");
        // pushNotification.notifyUser();

    }
}
