package org.example;

import org.example.domain.Email;
import org.example.services.EmailService;
import org.example.services.NotificationService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class NotifcationServiceCaptorArgumentTest {

    @Mock
    EmailService emailService;

    @InjectMocks
    NotificationService notificationService;

    @Captor
    ArgumentCaptor<Email> argumentCaptor;

    @Test
    public void testSend() {

        Email email = new Email();
        email.setEmailRecepint("sajjad@gmail.com");
        email.setMessage("Hello Good Day");
        email.setSubject("Greetings");
        when(emailService.sendMail(any(Email.class))).thenReturn(email);

        //calling actual method
        notificationService.send("sajjad@gmail.com", "Hello Dear");

        verify(emailService, times(1)).sendMail(argumentCaptor.capture());
        System.out.println(argumentCaptor.getValue().getEmailRecepint() + "--" + argumentCaptor.getValue().getSubject());
    }


}
