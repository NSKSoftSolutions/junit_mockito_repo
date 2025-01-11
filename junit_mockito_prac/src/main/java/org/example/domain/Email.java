package org.example.domain;

public class Email {

    private String emailRecepint;
    private String message;
    private String subject;

    public Email() {
        System.out.println("Email Object is created");
    }

    public Email(String emailRecepint, String message, String subject) {
        this.emailRecepint = emailRecepint;
        this.message = message;
        this.subject = subject;
    }

    public String getEmailRecepint() {
        return emailRecepint;
    }

    public void setEmailRecepint(String emailRecepint) {
        this.emailRecepint = emailRecepint;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Email{" +
                "emailRecepint='" + emailRecepint + '\'' +
                ", message='" + message + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}
