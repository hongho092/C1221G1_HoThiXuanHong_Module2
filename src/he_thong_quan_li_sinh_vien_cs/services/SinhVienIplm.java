package he_thong_quan_li_sinh_vien_cs.services;

import he_thong_quan_li_sinh_vien_cs.models.LopHoc;
import he_thong_quan_li_sinh_vien_cs.models.SinhVien;
import he_thong_quan_li_sinh_vien_cs.utils.GetNumber;
import he_thong_quan_li_sinh_vien_cs.utils.NotFoundStudentException;
import he_thong_quan_li_sinh_vien_cs.utils.ReadAndWrite;
import he_thong_quan_li_sinh_vien_cs.utils.Validate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVienIplm implements ISinhVienServices{
    Validate validate = new Validate();
    Scanner scanner = new Scanner(System.in);
    GetNumber getNumber = new GetNumber();

    public List<SinhVien> getListSinhVien() {
        List<SinhVien> sinhVienList = ReadAndWrite.readSinhVienListFromCSV();
        return sinhVienList;
    }
    @Override
    public void display() {
        List<SinhVien> sinhVienList = getListSinhVien();
        System.out.println("----------------------------------------------Danh sách sinh viên----------------------------------------------");
        for (SinhVien sv : sinhVienList) {
            System.out.println(sv);
        }
        System.out.println(" ");
    }

    @Override
    public void delete() {
        List<SinhVien> sinhVienList = getListSinhVien();
        SinhVien sinhVien = null;
        boolean flag = true;
        boolean out = true;
        if (!sinhVienList.isEmpty()) {
            display();
            System.out.print("Nhập id của sinh viên mà bạn muốn xóa: ");
            int choice = -1;
            do {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    for (SinhVien sv : sinhVienList) {
                        if (choice == sv.getId()) {
                            sinhVien = sv;
                            flag = false;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.print("Bạn có chắc muốn xóa không, nhập số (1.Yes/ 2.No): ");
                        int ans = getNumber.getNumberFormat(1,2);
                        switch (ans) {
                            case 1:
                                sinhVienList.remove(sinhVien);
                                ReadAndWrite.writeSinhVienListToCSV(sinhVienList, false);
                                display();
                                break;
                            case 2:
                                System.out.println("Bạn không muốn xóa.");
                                break;
                            default:
                        }
                    } else {
                        throw new NotFoundStudentException("Sinh viên tồn tại, nhập lại: ");
                    }
                } catch (NotFoundStudentException e) {
                    System.out.print(e.getMessage());
                    out = false;
                } catch (NumberFormatException e) {
                    System.out.print("Lỗi format số, nhập lại: ");
                    out = false;
                }
            } while (!out);
        } else
            System.out.println("Danh sách sinh viên trống.");
        System.out.println(" ");
    }

    @Override
    public void search() {
        List<SinhVien> sinhVienList = getListSinhVien();
        System.out.println("Nhập tên sinh viên muốn tìm kiếm: ");
        String ans = scanner.nextLine();
        for (SinhVien sv : sinhVienList) {
            if (sv.getTen().contains(ans)) {
                System.out.println("Bạn muốn tìm: "+sv);
            }
        }
        System.out.println(" ");
    }

    @Override
    public void add() {
        List<SinhVien> sinhVienList1 = getListSinhVien();
        SinhVien sinhVien = new SinhVien();
        int id = 1;
        if (!sinhVienList1.isEmpty()) {
            SinhVien sv = sinhVienList1.get(sinhVienList1.size()-1);
            id = sv.getId() + 1;
        }
        sinhVien.setId(id);
        System.out.println("Nhập thông tin cho sinh viên có mã sinh viên: "+id);
        System.out.print("Nhập tên sinh viên: ");
        sinhVien.setTen(validate.regexTen(scanner.nextLine()));
        System.out.print("Nhập ngày sinh: ");
        sinhVien.setNgaySinh(validate.regexNgayThangNam(scanner.nextLine()));
        System.out.print("Nhập giới tính: ");
        sinhVien.setGioiTinh(validate.regexGioiTinh(scanner.nextLine()));
        System.out.print("Nhập số điện thoại: ");
        sinhVien.setSoDienThoai(validate.regexSoDienThoai(scanner.nextLine()));
        sinhVien.setMaLopHoc(chonMaLopHoc());
        List<SinhVien> sinhVienList2 = new ArrayList<>();
        sinhVienList2.add(sinhVien);
        ReadAndWrite.writeSinhVienListToCSV(sinhVienList2,true);
        System.out.println("Đã thêm sinh viên thành công.");
        display();
        System.out.println(" ");
    }

    public String chonMaLopHoc() {
        List<LopHoc> lopHocList = ReadAndWrite.readLopHocListFromCSV();
        System.out.println("-----------------------------------------------Danh sách lớp học-----------------------------------------------");
        for (LopHoc lh : lopHocList) {
            System.out.println(lh);
        }
        System.out.print("Chọn mã lớp học: ");
        int choice = getNumber.getNumberFormat(1,6);
        String ma = null;
        switch (choice) {
            case 1:
                ma = lopHocList.get(0).getMaLopHoc();
                break;
            case 2:
                ma =  lopHocList.get(1).getMaLopHoc();
                break;
            case 3:
                ma =  lopHocList.get(2).getMaLopHoc();
                break;
            case 4:
                ma =  lopHocList.get(3).getMaLopHoc();
                break;
            case 5:
                ma =  lopHocList.get(4).getMaLopHoc();
                break;
            case 6:
                ma =  lopHocList.get(5).getMaLopHoc();
                break;
            default:
        }
        return ma;
    }
}
