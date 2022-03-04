package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class VehiclesTest {
    static VehiclesManager vehiclesManager = new VehiclesManager();

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
                            vehiclesManager.addTruck();
                            break;
                        case 2:
                            vehiclesManager.addCar();
                            break;
                        case 3:
                            vehiclesManager.addMotorbike();
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
                            vehiclesManager.showListProductTruck();
                            break;
                        case 2:
                            vehiclesManager.showListProductCar();
                            break;
                        case 3:
                            vehiclesManager.showListProductMotorbike();
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
                            vehiclesManager.deleteTruck();
                            break;
                        case 2:
                            vehiclesManager.deleteCar();
                            break;
                        case 3:
                            vehiclesManager.deleteMotorbike();
                            break;
                    }
                    out = false;
                    break;
                default:
                    System.out.println("Hoàn tất nhiệm vụ");
                    out = true;
            }
        }
    }
}
