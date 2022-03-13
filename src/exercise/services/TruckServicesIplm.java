package exercise.services;

import exercise.models.Brand;
import exercise.models.Car;
import exercise.models.Truck;
import exercise.util.ReadAndWrite;
import exercise.util.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TruckServicesIplm implements IServices{
    Scanner sca = new Scanner(System.in);
    Validate validate = new Validate();

    @Override
    public void add() {
        List<Truck> truckList = new ArrayList<>();
        Truck truck = new Truck();
        System.out.print("Nhập biển kiểm soát: ");
        truck.setBienKiemSoat(sca.nextLine());
        while (! validate.checkBienKiemSoatTruck(truck.getBienKiemSoat())) {
            System.out.print("Nhập sai format biển kiểm soát, nhập lại -> ");
            truck.setBienKiemSoat(sca.nextLine());
        }
        System.out.println("Chọn và nhập hãng sản xuất: ");
        List<Brand> brandList = ReadAndWrite.readBrandListFromCSV();
        for (Brand b : brandList) {
            System.out.println(b.brand());
        }
        truck.setHangSanXuat(sca.nextLine());
        System.out.print("Nhập năm sản xuất: ");
        truck.setNamSanXuat(Integer.parseInt(sca.nextLine()));
        System.out.print("Nhập chủ sở hữu: ");
        truck.setChuSoHuu(sca.nextLine());
        System.out.print("Nhập tải trọng: ");
        truck.setTrongTai(Integer.parseInt(sca.nextLine()));
        truckList.add(truck);
        ReadAndWrite.writeTruckListToCSV(truckList, true);
        show();
    }

    @Override
    public void show() {
        List<Truck> truckList = ReadAndWrite.readTruckListFromCSV();
        System.out.println("Danh sách xe tải: ");
        for (Truck t : truckList) {
            System.out.println(t);
        }
    }

    @Override
    public void delete() {
        List<Truck> truckList = ReadAndWrite.readTruckListFromCSV();
        show();
        System.out.print("Chọn biển kiểm soát muốn xóa -> ");
        String bienKiemSoat = sca.nextLine();
        for (int i=0; i<truckList.size(); i++) {
            if (truckList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                System.out.println("Bạn có chắc muốn xóa không (1: có hoặc 2: không): ");
                int ans = Integer.parseInt(sca.nextLine());
                if (ans == 1) {
                    truckList.remove(i);
                    ReadAndWrite.writeTruckListToCSV(truckList, false);
                } else
                    System.out.println("Bạn không muốn xóa.");
            }
        }
        show();
    }
}
