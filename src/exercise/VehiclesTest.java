package exercise;

import java.util.ArrayList;
import java.util.Scanner;

public class VehiclesTest {
    private static ArrayList<Car> cars = new ArrayList<>();
    private static ArrayList<Motorbike> motorbikes = new ArrayList<>();
    private static  ArrayList<Truck> trucks = new ArrayList<>();
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
                    System.out.print("Bạn muốn hiển thị:\n" +
                            "1. Xe tải \n" +
                            "2. Xe ôtô \n" +
                            "3. Xe máy \n"+
                            "Nhập yêu cầu của bạn: ");
                    int choice2 = Integer.parseInt(sca.nextLine());
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
                    out = false;
                    break;
                case 3:
                    System.out.println("Nhập biển kiểm soát: ");
                    String xeMuonXoa = sca.nextLine();
                    for (int i=0; i<trucks.size(); i++) {
                        if (trucks.get(i).getBienKiemSoat().equals(xeMuonXoa)) {
                            System.out.print("Bạn có chắc chắn muốn xóa không ->");
                            String choice3 = sca.nextLine();
                            if (choice3.equals("yes")) {
                                trucks.remove(i);
                                System.out.println("Đã xóa thành công");
                            } else if (choice3.equals("no")) {
                                break;
                            }
                        } else
                            break;
                    }

                    for (int i=0; i<cars.size(); i++) {
                        if (cars.get(i).getBienKiemSoat().equals(xeMuonXoa)) {
                            System.out.print("Bạn có chắc chắn muốn xóa không ->");
                            String choice3 = sca.nextLine();
                            if (choice3.equals("yes")) {
                                cars.remove(i);
                                System.out.println("Đã xóa thành công");
                            } else if (choice3.equals("no")) {
                                break;
                            }
                        }else
                            break;
                    }

                    for (int i=0; i<motorbikes.size(); i++) {
                        if (motorbikes.get(i).getBienKiemSoat().equals(xeMuonXoa)) {
                            System.out.print("Bạn có chắc chắn muốn xóa không ->");
                            String choice3 = sca.nextLine();
                            if (choice3.equals("yes")) {
                                motorbikes.remove(i);
                                System.out.println("Đã xóa thành công");
                            } else if (choice3.equals("no")) {
                                break;
                            }
                        }else
                            break;
                    }
                    break;
                default:
                    System.out.println("Hoàn tất nhiệm vụ");
                    out = true;
            }
        }
    }
}
