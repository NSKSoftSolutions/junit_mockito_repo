package org.example.services;

public class NotificationService {

    private EmailService emailService;

    public void sendEmail(String recepeint, String message) {
        String subject = "Welcome !";
        emailService.send(recepeint, subject, message);
    }

}
