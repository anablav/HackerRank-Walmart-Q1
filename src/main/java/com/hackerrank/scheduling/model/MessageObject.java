package com.hackerrank.scheduling.model;

public class MessageObject {
    private String toAddress;
    private String message;

    public MessageObject() {
    }

    public MessageObject(String toAddress, String message) {
        this.toAddress = toAddress;
        this.message = message;
    }

    public String getToAddress() {
        return toAddress;
    }

    public void setToAddress(String toAddress) {
        this.toAddress = toAddress;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return String.format("Message{toAddress=%s, message=%s}", getToAddress(), getMessage());
    }
}
