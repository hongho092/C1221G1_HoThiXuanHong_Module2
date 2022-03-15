package ss20_solid.di.demo2_ok;

public class EmailSender implements ISender {
    @Override
    public void send(){
        System.out.println("gửi emaail");
    }
}
