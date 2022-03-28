package he_thong_quan_li_sinh_vien_cs.controller;

import he_thong_quan_li_sinh_vien_cs.services.GiaoVienIplm;
import he_thong_quan_li_sinh_vien_cs.services.SinhVienIplm;
import he_thong_quan_li_sinh_vien_cs.utils.GetNumber;

public class QuanLiController {
    GetNumber getNumber = new GetNumber();
    SinhVienIplm sinhVienIplm = new SinhVienIplm();
    GiaoVienIplm giaoVienIplm = new GiaoVienIplm();
    public void displayMainMenu(){
        boolean out = true;
        while (out) {
            System.out.print("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN-–\n" +
                    "Chọn chức năng theo số (để tiếp tục):\n" +
                    "      1. Thêm mới sinh viên\n" +
                    "      2. Xóa sinh viên\n" +
                    "      3. Xem danh sách sinh viên\n" +
                    "      4. Xem thông tin giáo viên\n" +
                    "      5. Tìm kiếm sinh viên\n" +
                    "      6. Thoát\n" +
                    "Chọn chức năng: ");
            int choice = getNumber.getNumberFormat(1, 6);
            switch (choice) {
                case 1:
                    sinhVienIplm.add();
                    break;
                case 2:
                    sinhVienIplm.delete();
                    break;
                case 3:
                    sinhVienIplm.display();
                    break;
                case 4:
                    giaoVienIplm.display();
                    break;
                case 5:
                    sinhVienIplm.search();
                    break;
                case 6:
                    System.out.println("Đã hoàn thành các thao tác.");
                    out = false;
                    break;
            }
        }
    }
}
