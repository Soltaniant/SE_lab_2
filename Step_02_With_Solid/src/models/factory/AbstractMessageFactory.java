package models.factory;

import models.Message;
import models.MessageType;
import services.MessageService;

public interface AbstractMessageFactory {

    Message createMessage(MessageType messageType);

    MessageService createMessageService(MessageType messageType);
}
