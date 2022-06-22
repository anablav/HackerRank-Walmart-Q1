package com.hackerrank.scheduling.message;

import com.hackerrank.scheduling.model.MessageObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class ScheduledMessageReceiver {

    @Autowired
    ScheduledMessageErrorHandler errorHandler;

    @JmsListener(destination = "msgbox", containerFactory = "jmsListenerContainerFactory")
    public void receiveMessage(MessageObject message) {
        // receive messages here
        if (message.getToAddress().equalsIgnoreCase("test@example.com")) {
            RuntimeException ex = new RuntimeException("Incorrect message");
            errorHandler.handleError(ex);
        } else if (message.getToAddress().equalsIgnoreCase("info@example.com")) {
            System.out.println(message.getMessage());
        }
    }
}
