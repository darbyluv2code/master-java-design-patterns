package com.luv2code.designpatterns.structural.decorator;

public class NotificationFactory {

    public static Notification createNotification(String type) {

        if (type == null || type.isEmpty()) {
            return null;
        }

        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            case "whatsapp" -> new WhatsAppNotification();
            default -> throw new IllegalArgumentException("Unknown notification type: " + type);
        };
    }
}
