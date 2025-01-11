package org.example.services;

import org.example.domain.Email;

public class EmailService {
    public void send(String recepeint, String subject, String message) {
        System.out.println("--" + subject + "--" + message);
    }

    public Email sendMail(Email email) {
        return email;
    }

}
