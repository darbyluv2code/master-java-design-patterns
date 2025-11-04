package com.luv2code.designpatterns.creational.initial;

public class NotificationService {

    // initial implementation

    public void sendNotification(String type) {

        if (type.equalsIgnoreCase("email")) {
            // email notification
            EmailNotification emailNotification = new EmailNotification();
            emailNotification.send();
        } else if (type.equalsIgnoreCase("sms")) {
            // sms notification
            SmsNotification smsNotification = new SmsNotification();
            smsNotification.send();
        } else if (type.equalsIgnoreCase("whatsapp")) {
            // whatsapp notification
            WhatsAppNotification whatsAppNotification = new WhatsAppNotification();
            whatsAppNotification.send();
        } else {
            System.out.println("Unknown Notification Type");
        }
    }
}
