package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class VehiclesManager {
    Scanner sca = new Scanner(System.in);
    private static ArrayList<Car> cars = new ArrayList<Car>();
    private static ArrayList<Motorbike> motorbikes = new ArrayList<Motorbike>();
    private static ArrayList<Truck> trucks = new ArrayList<Truck>();

    static {
        cars.add(new Car("43A-212.56", "Toyota", 2019, "Nguyễn Văn A", 5, "Du lịch"));
        cars.add(new Car("43B-453.88", "Huyndai", 2020, "Nguyễn Văn B", 45, "Xe khách"));
        cars.add(new Car("43B-453.89", "Ford", 2020, "Nguyễn Văn C", 16, "Xe khách"));
        motorbikes.add(new Motorbike("43-K1-678.56", "Yamaha", 2019, "Nguyễn Văn A", 100 ));
        motorbikes.add(new Motorbike("43-H1-345.89", "Honda", 2019, "Nguyễn Văn B", 150 ));
        motorbikes.add(new Motorbike("43-AK-765.23", "Yamaha", 2019, "Nguyễn Văn C", 50 ));
        trucks.add(new Truck("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A",  3));
        trucks.add(new Truck("43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B",  9));
        trucks.add(new Truck("43C-45.235", "Hino", 2021, "Nguyễn Văn C",  12));
    }

    public void addCar() {
        System.out.print("Nhập biển kiểm soát: ");
        String bienKiemSoat = sca.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String hangSanXuat = sca.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(sca.nextLine());
        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu = sca.nextLine();
        System.out.print("Nhập kiểu xe: ");
        String kieuXe = sca.nextLine();
        System.out.print("Nhập số chỗ ngồi: ");
        int soChoNgoi = Integer.parseInt(sca.nextLine());
        Car car = new Car(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, soChoNgoi, kieuXe);
        cars.add(car);
        showListProductCar();
    }
    public void addTruck() {
        System.out.print("Nhập biển kiểm soát: ");
        String bienKiemSoat = sca.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String hangSanXuat = sca.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(sca.nextLine());
        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu = sca.nextLine();
        System.out.print("Nhập tải trọng: ");
        int trongTai = Integer.parseInt(sca.nextLine());
        Truck truck = new Truck(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, trongTai);
        trucks.add(truck);
        showListProductTruck();
    }
    public void addMotorbike() {
        System.out.print("Nhập biển kiểm soát: ");
        String bienKiemSoat = sca.nextLine();
        System.out.print("Nhập hãng sản xuất: ");
        String hangSanXuat = sca.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int namSanXuat = Integer.parseInt(sca.nextLine());
        System.out.print("Nhập chủ sở hữu: ");
        String chuSoHuu = sca.nextLine();
        System.out.print("Nhập công suất: ");
        int congSuat = Integer.parseInt(sca.nextLine());
        Motorbike motorbike = new Motorbike(bienKiemSoat, hangSanXuat, namSanXuat, chuSoHuu, congSuat);
        motorbikes.add(motorbike);
        showListProductTruck();
    }


    public void showListProductCar() {
        for (Car car : cars) {
            System.out.println(car);
        }
    }
    public void showListProductMotorbike() {
        for (Motorbike motorbike : motorbikes) {
            System.out.println(motorbike);
        }
    }
    public void showListProductTruck() {
        for (Truck truck : trucks) {
            System.out.println(truck);
        }
    }

    public void deleteTruck() {
        System.out.print("Nhập biển kiểm soát của xe muốn xóa: ");
        String bienKiemSoat = sca.nextLine();
        for (int i=0; i< trucks.size(); i++) {
            if (trucks.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                System.out.println("Bạn có chắc muốn xóa không (1: có hoặc 2: không): ");
                int ans = Integer.parseInt(sca.nextLine());
                if (ans == 1) {
                    trucks.remove(i);
                } else
                    System.out.println("Bạn không muốn xóa.");
            }
        }
    }
    public void deleteCar() {
        System.out.print("Nhập biển kiểm soát của xe muốn xóa: ");
        String bienKiemSoat = sca.nextLine();
        for (int i=0; i< cars.size(); i++) {
            if (cars.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                System.out.println("Bạn có chắc muốn xóa không (1: có hoặc 2: không): ");
                int ans = Integer.parseInt(sca.nextLine());
                if (ans == 1) {
                    cars.remove(i);
                } else
                    System.out.println("Bạn không muốn xóa.");
            }
        }
    }public void deleteMotorbike() {
        System.out.print("Nhập biển kiểm soát của xe muốn xóa: ");
        String bienKiemSoat = sca.nextLine();
        for (int i=0; i< motorbikes.size(); i++) {
            if (motorbikes.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                System.out.println("Bạn có chắc muốn xóa không (1: có hoặc 2: không): ");
                int ans = Integer.parseInt(sca.nextLine());
                if (ans == 1) {
                    motorbikes.remove(i);
                } else
                    System.out.println("Bạn không muốn xóa.");
            }
        }
    }

}













