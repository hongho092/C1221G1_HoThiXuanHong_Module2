package ss20_solid.di.demo2_ok;

import java.util.List;

public class Notification {
    // gửi thông tin tới khác hàng
    private List<ISender> senderList;
    public Notification(List<ISender> list) {
        this.senderList = list;
    }
    public void send(){
        for (ISender sender: this.senderList) {
            sender.send();
        }
    }

}
