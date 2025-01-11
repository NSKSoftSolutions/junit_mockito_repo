package org.example;

import org.example.domain.User;
import org.example.repos.UserRepository;
import org.example.services.MessageService;
import org.example.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    UserRepository userRepository;

    @Mock
    MessageService messageService;

    @InjectMocks
    UserService userService;

    @Captor
    ArgumentCaptor<User> userArgumentCaptor;

    @Test
    public void testCreateUserSuccessScenerio() {

        doReturn(true).when(userRepository).saveUser(any(User.class));
        //doReturn(false).when(userRepository).saveUser(any(User.class));
        doNothing().when(messageService).sendWelcomeMessage(any(User.class));
        //doNothing().when(messageService).sendRegretMessage(any(User.class));

        User user = new User();
        user.setFirstName("Sajjad");
        user.setLastName("Navab");
        userService.createUser(user);

        verify(userRepository, atLeastOnce()).saveUser(userArgumentCaptor.capture());
        verify(messageService, atLeastOnce()).sendWelcomeMessage(userArgumentCaptor.capture());

        //verify(messageService, atLeastOnce()).sendRegretMessage(userArgumentCaptor.capture());

        System.out.println(userArgumentCaptor.getValue().getFirstName() + " -- " + userArgumentCaptor.getValue().getLastName());


    }

    @Test
    public void testCreateUserFailureScenerio() {

        doReturn(false).when(userRepository).saveUser(any(User.class));
        doNothing().when(messageService).sendRegretMessage(any(User.class));

        User user = new User();
        user.setFirstName("Sajjad");
        user.setLastName("Navab");
        userService.createUser(user);

        verify(userRepository, atLeastOnce()).saveUser(userArgumentCaptor.capture());
        verify(messageService, atLeastOnce()).sendRegretMessage(userArgumentCaptor.capture());

        System.out.println(userArgumentCaptor.getValue().getFirstName() + " -- " + userArgumentCaptor.getValue().getLastName());
    }
}
