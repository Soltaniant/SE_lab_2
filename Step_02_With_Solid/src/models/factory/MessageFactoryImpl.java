package models.factory;

import models.*;
import services.EmailMessageService;
import services.MessageService;
import services.SmsMessageService;
import services.TelegramMessageService;

public class MessageFactoryImpl implements AbstractMessageFactory {

    @Override
    public Message createMessage(MessageType messageType) {
        switch (messageType) {
            case SMS:
                return new SmsMessage();
            case EMAIL:
                return new EmailMessage();
            case TELEGRAM:
                return new TelegramMessage();
            default:
                throw new IllegalArgumentException("Invalid messageType.");
        }
    }

    @Override
    public MessageService createMessageService(MessageType messageType) {
        switch (messageType) {
            case SMS:
                return new SmsMessageService();
            case EMAIL:
                return new EmailMessageService();
            case TELEGRAM:
                return new TelegramMessageService();
            default:
                throw new IllegalArgumentException("Invalid messageType.");
        }
    }
}
