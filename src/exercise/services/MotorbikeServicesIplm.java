package exercise.services;

import exercise.models.Brand;
import exercise.models.Car;
import exercise.models.Motorbike;
import exercise.models.Truck;
import exercise.util.ReadAndWrite;
import exercise.util.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MotorbikeServicesIplm implements IServices {
    Scanner sca = new Scanner(System.in);
    Validate validate = new Validate();

    @Override
    public void add() {
        Motorbike motorbike = new Motorbike();
        System.out.print("Nhập biển kiểm soát: ");
        motorbike.setBienKiemSoat(sca.nextLine());
        while (! validate.checkBienKiemSoatMotorbike(motorbike.getBienKiemSoat())) {
            System.out.print("Nhập sai format biển kiểm soát, nhập lại -> ");
            motorbike.setBienKiemSoat(sca.nextLine());
        }
        System.out.println("Chọn và nhập hãng sản xuất: ");
        List<Brand> brandList = ReadAndWrite.readBrandListFromCSV();
        for (Brand b : brandList) {
            System.out.println(b.brand());
        }
        motorbike.setHangSanXuat(sca.nextLine());
        System.out.print("Nhập năm sản xuất: ");
        motorbike.setNamSanXuat(Integer.parseInt(sca.nextLine()));
        System.out.print("Nhập chủ sở hữu: ");
        motorbike.setChuSoHuu(sca.nextLine());
        System.out.print("Nhập công suất: ");
        motorbike.setCongSuat(Integer.parseInt(sca.nextLine()));
        List<Motorbike> motorbikeList = new ArrayList<>();
        motorbikeList.add(motorbike);
        ReadAndWrite.writeMotorbikeListToCSV(motorbikeList, true);
        show();
    }

    @Override
    public void show() {
        List<Motorbike> motorbikeList = ReadAndWrite.readMotorbikeListFromCSV();
        System.out.println("Danh sách xe máy: ");
        for (Motorbike m : motorbikeList) {
            System.out.println(m);
        }
    }

    @Override
    public void delete() {
        List<Motorbike> motorbikeList = ReadAndWrite.readMotorbikeListFromCSV();
        show();
        System.out.print("Chọn biển kiểm soát muốn xóa -> ");
        String bienKiemSoat = sca.nextLine();
        for (int i=0; i<motorbikeList.size(); i++) {
            if (motorbikeList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                System.out.println("Bạn có chắc muốn xóa không (1: có hoặc 2: không): ");
                int ans = Integer.parseInt(sca.nextLine());
                if (ans == 1) {
                    motorbikeList.remove(i);
                    ReadAndWrite.writeMotorbikeListToCSV(motorbikeList, false);
                } else
                    System.out.println("Bạn không muốn xóa.");
            }
        }
        show();
    }
}
