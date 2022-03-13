package exercise.controller;

import exercise.models.Car;
import exercise.models.Truck;
import exercise.services.CarServicesIplm;
import exercise.services.MotorbikeServicesIplm;
import exercise.services.TruckServicesIplm;
//import exercise.services.VehiclesManager;

import java.util.Scanner;

public class VehiclesTest {
    static CarServicesIplm car = new CarServicesIplm();
    static MotorbikeServicesIplm motorbike = new MotorbikeServicesIplm();
    static TruckServicesIplm truck = new TruckServicesIplm();

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        boolean out = false;
        while (!out) {
            System.out.print("Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Thoát\n" +
                    "Nhập yêu cầu của bạn: ");
            int choice = Integer.parseInt(sca.nextLine());
            switch (choice) {
                case 1:
                    System.out.print("Bạn muốn thêm:\n" +
                            "1. Thêm xe tải,\n" +
                            "2. Thêm ôtô, \n" +
                            "3. Thêm xe máy.\n"+
                            "Nhập yêu cầu của bạn: ");
                    int choice1 = Integer.parseInt(sca.nextLine());
                    switch (choice1) {
                        case 1:
                            truck.add();
                            break;
                        case 2:
                            car.add();
                            break;
                        case 3:
                            motorbike.add();
                            break;
                    }
                    out = false;
                    break;
                case 2:
                    System.out.print("Bạn muốn hiển thị:\n" +
                            "1. Xe tải \n" +
                            "2. Xe ôtô \n" +
                            "3. Xe máy \n"+
                            "Nhập yêu cầu của bạn: ");
                    int choice2 = Integer.parseInt(sca.nextLine());
                    switch (choice2) {
                        case 1:
                            truck.show();
                            break;
                        case 2:
                            car.show();
                            break;
                        case 3:
                            motorbike.show();
                            break;
                    }
                    out = false;
                    break;
                case 3:
                    System.out.print("Bạn muốn xóa loại xe nào:\n" +
                            "1. Xe tải \n" +
                            "2. Xe ôtô \n" +
                            "3. Xe máy \n"+
                            "Nhập yêu cầu của bạn: ");
                    int choice3 = Integer.parseInt(sca.nextLine());
                    switch (choice3) {
                        case 1:
                            truck.delete();
                            break;
                        case 2:
                            car.delete();
                            break;
                        case 3:
                            motorbike.delete();
                          break;
                    }
                    out = false;
                    break;
                case 4:
                    System.out.println("Hoàn tất nhiệm vụ.");
                    out = true;
                    break;
                default:
                    System.out.println("Nhập sai thao tác");
                    out = true;
            }
        }
    }
}
