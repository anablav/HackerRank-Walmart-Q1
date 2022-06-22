package com.hackerrank.scheduling.message;

import com.hackerrank.scheduling.model.MessageObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledMessageSender {

    @Autowired
    JmsTemplate jmsTemplate;

    @Scheduled(cron = "0/5 0 * * * ?")
    public void sendingInfoMessage() {
        // send message `info` toAddress `info@example.com` at each 5 sec
        MessageObject message = new MessageObject("info@example.com", "info");
        jmsTemplate.convertAndSend("msgbox", message);
    }

    @Scheduled(cron = "0/8 0 * * * ?")
    public void sendingTestMessage() {
        // send message `test` toAddress `test@example.com` at each 8 sec
        MessageObject message = new MessageObject("test@example.com", "test");
        jmsTemplate.convertAndSend("msgbox", message);
    }
}
