package org.example.services;

import org.example.domain.User;

public class MessageService {

    //message service is having functionality to send welcome message to the user

    public void sendWelcomeMessage(User user) {
        System.out.println("Welcome to NSKSolutions --" + user.getFirstName() + " " + user.getLastName());
    }


    public void sendRegretMessage(User user) {
        System.out.println("Sorry to Inform You Ur Details are Not saved --" + user.getFirstName() + " " + user.getLastName() + " -- check whether u have already account with us");
    }
}
