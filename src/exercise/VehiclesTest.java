package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehiclesTest {

    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Motorbike> motorbikes = new ArrayList<>();
        ArrayList<Truck> trucks = new ArrayList<>();
////         bienKiemSoat, String hangSanXuat, int namSanXuat, String chuSoHuu, int soChoNgoi, String kieuXe
//        Car car1 = new Car("hgfjfn", "fbdhfbi", 3452, "34523", 5, "7855");
//        cars.add(car1);
//        System.out.println(car1.showHangSanXuat());
//        System.out.println(cars);
//        ArrayList<Motorbike> motorbikes = new ArrayList<>();
//        ArrayList<Truck> truck = new ArrayList<>();
        Scanner sca = new Scanner(System.in);
        boolean out = false;
        while (!out) {
            System.out.print("Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Thoát\n" +
                    "Nhập yêu cầu của bạn: ");
            int choice = sca.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Bạn muốn thêm:\n" +
                            "1. Thêm xe tải,\n" +
                            "2. Thêm ôtô, \n" +
                            "3. Thêm xe máy.\n"+
                            "Nhập yêu cầu của bạn: ");
                    int choice1 = sca.nextInt();
                    switch (choice1) {
                        case 1:
                            Truck truck = new Truck().addTruck();
                            trucks.add(truck);
                            System.out.println("OK, đã thêm xe tải\n"+ cars);
                            break;
                        case 2:
                            Car car = new Car().addCar();
                            cars.add(car);
                            System.out.println("OK, đã thêm oto\n"+ motorbikes);
                            break;
                        case 3:
                            Motorbike motorbike = new Motorbike().addMotorbike();
                            motorbikes.add(motorbike);
                            System.out.println("OK, đã thêm xe máy");
                            break;
                    }
                    out = false;
                    break;
                case 2:
                    System.out.println("Bạn muốn hiển thị:\n" +
                            "1. Xe tải,\n" +
                            "2. Xe ôtô, \n" +
                            "3. Xe máy.\n"+
                            "Nhập yêu cầu của bạn: ");
                    int choice2 = sca.nextInt();
                    switch (choice2) {
                        case 1:
                            for (Truck truck:trucks) {
                                System.out.println(truck);
                            }
                            break;
                        case 2:
                            for (Car car:cars) {
                                System.out.println(car);
                            }
                            break;
                        case 3:
                            for (Motorbike motorbike:motorbikes) {
                                System.out.println(motorbike);
                            }
                            break;
                    }
                    System.out.println("hien thi");
                    out = false;
                    break;
                case 3:
                    System.out.println("Nhập biển kiểm soát: ");
                    String bKS = sca.nextLine();
//                    for (int i=0; i< trucks.size(); i++) {
//                        for(int j=0; j<trucks[i].)
//                    }
//                    out = false;
                    break;
                default:
                    System.out.println("da out");
                    out = true;
            }

        }

    }
}
