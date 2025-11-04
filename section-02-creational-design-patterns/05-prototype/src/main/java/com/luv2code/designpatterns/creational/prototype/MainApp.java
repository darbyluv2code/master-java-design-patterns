package com.luv2code.designpatterns.creational.prototype;

public class MainApp {

    public static void main(String[] args) throws CloneNotSupportedException {

        EmailTemplate baseTemplate = new EmailTemplate("Hello!", "This is your monthly update", "Regards, XYZ");
        System.out.println("Base Template: " + baseTemplate);

        System.out.println();

        // group email
        System.out.println("SENDING GROUP EMAIL");

        EmailTemplate groupEmail = (EmailTemplate) baseTemplate.clone();
        groupEmail.setSubject("Hello Team");

        groupEmail.sendEmail("techteam@gmail.com");

        System.out.println();

        // individual email
        System.out.println("SENDING INDIVIDUAL EMAIL");

        EmailTemplate individualEmail = (EmailTemplate) baseTemplate.clone();
        individualEmail.setSubject("Hello Ravi");

        individualEmail.sendEmail("ravi@gmail.com");
    }
}







