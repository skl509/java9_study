package com.study.java.ch04.practice02;

import java.util.ArrayList;

public final class Message {
    private String sender;
    private ArrayList<String> recipients;
    private String text;
        
    public Message(String sender, String text) {
        this.sender = sender;
        this.text = text;
        recipients = new ArrayList<>();
    }

    public void addRecipient(String recipient) { 
        recipients.add(recipient);
    };
    
    public Message clone() {
        try {
            Message cloned = (Message) super.clone();
            @SuppressWarnings("unchecked") ArrayList<String> clonedRecipients 
                = (ArrayList<String>) recipients.clone();
            cloned.recipients = clonedRecipients; 
            return cloned;
        } catch (CloneNotSupportedException ex) { //5장 로깅에서 자세히 설명, 검사예외설명하는 이유
            return null;
        }
    }
}
