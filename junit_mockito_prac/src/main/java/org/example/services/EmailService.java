package org.example.services;

public class EmailService {
    public void send(String recepeint, String subject, String message) {
        System.out.println("--" + subject + "--" + message);
    }
}
