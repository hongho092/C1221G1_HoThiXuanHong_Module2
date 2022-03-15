package ss20_solid.di.demo1_not;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        SMSSender smsSender = new SMSSender();
        Notification notification = new Notification(emailSender);
        notification.send();
    }
}
