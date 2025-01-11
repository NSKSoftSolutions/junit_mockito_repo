package org.example;

import org.example.services.EmailService;
import org.example.services.NotificationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class NotificationServiceTest {


    @InjectMocks
    NotificationService notificationService;

    @Mock
    EmailService emailService;

    @Test
    public void testSendEmail() {
        doNothing().when(emailService).send(anyString(), anyString(), anyString());
        //calling actual method
        notificationService.sendEmail("sajjad@gmail.com", "Hello Dear");
        verify(emailService, atLeastOnce()).send(anyString(), anyString(), anyString());
    }


}
