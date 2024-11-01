
import models.EmailMessage;
import models.Message;
import models.SmsMessage;
import models.TelegramMessage;
import services.EmailMessageService;
import services.MessageService;
import services.SmsMessageService;
import services.TelegramMessageService;

import java.util.Scanner;

public class Main {

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        scanner.useDelimiter("\n");
        System.out.println("Hello and Welcome to SE Lab Messenger.");

        int userAnswer;
        do{
            Message message = null;
            MessageService messageService = null;

            String source;
            String target;
            String content;

            System.out.println("In order to send Sms message enter 1");
            System.out.println("In order to send Email message enter 2");
            System.out.println("In order to send Telegram message enter 3");
            System.out.println("In order to Exit, Enter 0");

            userAnswer= scanner.nextInt();

            if(userAnswer==0){
                break;
            }

            switch (userAnswer){
                case 1:
                    message = new SmsMessage();
                    messageService = new SmsMessageService();
                    break;
                case 2:
                    message = new EmailMessage();
                    messageService = new EmailMessageService();
                    break;
                case 3:
                    message = new TelegramMessage();
                    messageService = new TelegramMessageService();
                    break;
            }

            System.out.print("Enter source phone : ");
            source = scanner.next();
            message.setSource(source);
            System.out.print("Enter target phone : ");
            target = scanner.next();
            message.setTarget(target);
            System.out.println("Write Your Message : ");
            content = scanner.next(".*$");
            message.setContent(content);

            messageService.sendMessage(message);

        }while (true);
    }
}