package services;

import models.Message;

public class TelegramMessageService implements MessageService {

    @Override
    public void sendMessage(Message message) {
        if (message.isValid())
            System.out.printf("Sending a PM from %s to %s with content: %s\n", message.getSource(), message.getTarget(), message.getContent());
        else
            throw new IllegalArgumentException("Username is Not Correct!");
    }
}
