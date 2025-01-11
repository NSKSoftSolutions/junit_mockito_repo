package org.example.services;

import org.example.domain.User;
import org.example.repos.UserRepository;

public class UserService {

    MessageService messageService;

    UserRepository userRepository;

    public boolean createUser(User user) {
        System.out.println("User Details are captured");
        boolean isSaved = userRepository.saveUser(user);
        if (isSaved) {
            messageService.sendWelcomeMessage(user);
        } else {
            System.out.println("user object is not saved in database");
            messageService.sendRegretMessage(user);
        }
        return isSaved;
    }


}
