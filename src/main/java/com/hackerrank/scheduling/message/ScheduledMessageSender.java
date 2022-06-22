package com.hackerrank.scheduling.message;

import org.springframework.stereotype.Component;

@Component
public class ScheduledMessageSender {

    public void sendingInfoMessage() {
        // send message `info` toAddress `info@example.com` at each 5 sec
    }

    public void sendingTestMessage() {
        // send message `test` toAddress `test@example.com` at each 8 sec
    }
}
