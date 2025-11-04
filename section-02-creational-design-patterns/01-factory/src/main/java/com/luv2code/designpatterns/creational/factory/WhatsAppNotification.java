package com.luv2code.designpatterns.creational.factory;

public class WhatsAppNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending whatsapp ...");
    }

}
