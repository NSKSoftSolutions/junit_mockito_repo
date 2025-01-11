package org.example.services;

import org.example.domain.Email;

public class NotificationService {

    private EmailService emailService;

    public void sendEmail(String recepeint, String message) {
        String subject = "Welcome !";
        emailService.send(recepeint, subject, message);
    }

    public Email send(String recepeint, String message) {
        String subject = "Welcome !";
        Email email = new Email(recepeint, subject, message);
        Email newEmail = emailService.sendMail(email);
        return newEmail;
    }
}
