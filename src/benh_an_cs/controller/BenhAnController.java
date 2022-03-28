package benh_an_cs.controller;

import benh_an_cs.services.BenhAnIplm;
import benh_an_cs.utils.GetNumber;

public class BenhAnController {
    BenhAnIplm benhAnIplm = new BenhAnIplm();
    GetNumber getNumber = new GetNumber();
    public void displayMainMenu(){
        boolean out = true;
        while (out) {
            System.out.print("--CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN–\n" +
                    "Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới\n" +
                    "2. Xóa\n" +
                    "3. Xem danh sách các bệnh án\n" +
                    "4. Thoát\n" +
                    "Chọn chức năng: ");
            int choice = getNumber.getNumberFormat(1,4);
            switch (choice) {
                case 1:
                    System.out.print("Chọn loại bệnh án muốn thêm:\n" +
                            "1. Bệnh án thường\n" +
                            "2. Bệnh án Vip\n" +
                            "Chọn: ");
                    int choice1 = getNumber.getNumberFormat(1,2);
                    switch (choice1) {
                        case 1:
                            benhAnIplm.addBenhAnThuong();
                            break;
                        case 2:
                            benhAnIplm.addBenhAnVip();
                            break;
                        default:
                    }
                    break;
                case 2:
                    benhAnIplm.delete();
                    break;
                case 3:
                    benhAnIplm.display();
                    break;
                case 4:
                    out = false;
                    break;
            }
        }
    }
}
