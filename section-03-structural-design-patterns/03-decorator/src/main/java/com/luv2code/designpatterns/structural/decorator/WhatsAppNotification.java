package com.luv2code.designpatterns.structural.decorator;

public class WhatsAppNotification implements Notification {

    @Override
    public void notifyUser(String message) {
        System.out.println("Sending whatsapp: " + message);
    }

}
