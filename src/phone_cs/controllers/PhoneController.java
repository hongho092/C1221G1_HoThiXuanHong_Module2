package phone_cs.controllers;

import phone_cs.services.PhoneIplm;
import phone_cs.utils.GetNumber;

import java.util.Scanner;

public class PhoneController {
    PhoneIplm phoneIplm = new PhoneIplm();
    Scanner sca = new Scanner(System.in);
    GetNumber getNumberFormat = new GetNumber();
    public void displayMainMenu(){
        boolean out = true;
        while (out) {
            System.out.print("--CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI -–\n" +
                    "Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách điện thoại\n" +
                    "4. Tìm kiếm\n" +
                    "5. Thoát\n" +
                    "Chọn chức năng: ");
            int choice = getNumberFormat.getNumberFormat(1, 5);
            switch (choice) {
                case 1:
                    System.out.print("Chọn loại điện thoại muốn thêm:\n" +
                            "1. DTCH\n" +
                            "2. DTXT\n" +
                            "Chọn: ");
                    int choice1 = getNumberFormat.getNumberFormat(1, 2);
                    switch (choice1) {
                        case 1:
                            phoneIplm.addDTCH();
                            break;
                        case 2:
                            phoneIplm.addDTXT();
                            break;
                        default:
                    }
                    break;
                case 2:
                    phoneIplm.delete();
                    break;
                case 3:
                    phoneIplm.display();
                    break;
                case 4:
                    phoneIplm.search();
                    break;
                case 5:
                    out = false;
                    break;
            }
        }
    }
}
