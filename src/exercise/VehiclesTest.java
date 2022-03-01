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
                            Motorbike motorbike = new Motorbike().addVehicle();
                            motorbikes.add(motorbike);
                            System.out.println("OK, đã thêm xe tải\n"+ cars);
                            break;
                        case 2:
                            Car car = new Car().addVehicle();
                            cars.add(car);
                            System.out.println("OK, đã thêm oto\n"+ motorbikes);
                            break;
                        case 3:
                            System.out.println("OK, đã thêm xe máy");
                            break;
                    }
                    out = false;
                    break;
                case 2:
                    System.out.println("hien thi");
                    out = false;
                    break;
                case 3:
                    System.out.println("xoa");
                    out = false;
                    break;
                default:
                    System.out.println("da out");
                    out = true;
            }

        }

    }
}
