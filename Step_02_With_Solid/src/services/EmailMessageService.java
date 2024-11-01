package services;

import models.Message;

public class EmailMessageService implements MessageService {

    @Override
    public void sendMessage(Message message) {
        if (message.isValid())
            System.out.printf("Sending an Email from %s to %s with content: %s\n", message.getSource(), message.getTarget(), message.getContent());
        else
            throw new IllegalArgumentException("Email Address is Not Correct!");
    }
}
