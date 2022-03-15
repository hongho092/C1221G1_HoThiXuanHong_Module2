package ss20_solid.di.demo1_not;

public class Notification {
    private EmailSender emailSender;
    public Notification(EmailSender emailSender) {
        this.emailSender = emailSender;
    }
    public void send(){
        // gửi email
        this.emailSender.send();
    }
}
