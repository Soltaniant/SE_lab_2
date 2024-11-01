package services;

import models.Message;

public class SmsMessageService implements MessageService{

    @Override
    public void sendMessage(Message message) {
        if (message.isValid())
            System.out.printf("Sending a SMS from %s to %s with content: %s\n", message.getSource(), message.getTarget(), message.getContent());
        else
            throw new IllegalArgumentException("Phone Number is Not Correct!");
    }
}
