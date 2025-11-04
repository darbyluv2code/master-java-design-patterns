package com.luv2code.designpatterns.structural.decorator;

public class MainApp {

    public static void main(String[] args) {

        // Email with priority
        Notification emailNotification = NotificationFactory.createNotification("email");

        Notification priorityEmail = new PriorityDecorator(emailNotification);
        priorityEmail.notifyUser("Course update available");

        System.out.println();

        // SMS with uppercase
        Notification smsNotification = NotificationFactory.createNotification("sms");

        Notification loudSms = new UpperCaseDecorator(smsNotification);
        loudSms.notifyUser("Assignment due tomorrow!");

        System.out.println();

        // Whatsapp with priority + uppercase + signature
        Notification whatsAppNotification = NotificationFactory.createNotification("whatsapp");

        Notification multiDecoratorsWhatsApp = new PriorityDecorator(
                new UpperCaseDecorator(
                    new SignatureDecorator(whatsAppNotification,
                "System Admin Team")));

        multiDecoratorsWhatsApp.notifyUser("The servers will be down over the weekend for upgrades.");
    }
}
