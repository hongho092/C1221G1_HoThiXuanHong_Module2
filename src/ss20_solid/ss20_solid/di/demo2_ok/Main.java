package ss20_solid.di.demo2_ok;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmailSender emailSender = new EmailSender();
        SMSSender smsSender = new SMSSender();
        List<ISender> list= new ArrayList<>();
        list.add(emailSender);
        list.add(smsSender);
        Notification notification = new Notification(list);
        notification.send();
    }
}
