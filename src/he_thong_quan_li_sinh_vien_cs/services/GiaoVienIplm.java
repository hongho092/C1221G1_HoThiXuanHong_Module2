package he_thong_quan_li_sinh_vien_cs.services;

import he_thong_quan_li_sinh_vien_cs.models.GiaoVien;
import he_thong_quan_li_sinh_vien_cs.utils.ReadAndWrite;

import java.util.List;

public class GiaoVienIplm implements IGiaoVienServices{

    @Override
    public void display() {
        List<GiaoVien> giaoVienList = ReadAndWrite.readGiaoVienListFromCSV();
        System.out.println("--------------------------------------Danh sách giáo viên--------------------------------------");
        for (GiaoVien gv : giaoVienList) {
            System.out.println(gv);
        }
        System.out.println(" ");
    }
}
