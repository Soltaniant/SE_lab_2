
import models.*;
import models.factory.AbstractMessageFactory;
import models.factory.MessageFactoryImpl;
import services.MessageService;

import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useDelimiter("\n");
        System.out.println("Hello and Welcome to SE Lab Messenger.");

        int userAnswer;
        do {
            Message message;
            MessageService messageService;

            String source;
            String target;
            String content;

            System.out.println("In order to send Sms message enter 1");
            System.out.println("In order to send Email message enter 2");
            System.out.println("In order to send Telegram message enter 3");
            System.out.println("In order to Exit, Enter 0");

            userAnswer= scanner.nextInt();

            if(userAnswer==0)
                break;

            MessageType messageType = MessageType.fromOrdinal(userAnswer);
            AbstractMessageFactory factory = new MessageFactoryImpl();

            message = factory.createMessage(messageType);
            messageService = factory.createMessageService(messageType);

            System.out.printf("Enter source [%s]: ", messageType);
            source = scanner.next();
            message.setSource(source);
            System.out.printf("Enter target [%s]: ", messageType);
            target = scanner.next();
            message.setTarget(target);
            System.out.println("Write Your Message: ");
            content = scanner.next(".*$");
            message.setContent(content);

            messageService.sendMessage(message);

        } while (true);
    }
}