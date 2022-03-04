//package oop_review.car;
//
//import java.util.Scanner;
//
////import static oop_review.car.Vehicle.count;
//
//public class TestVehicle {
//    public static void main(String[] args) {
//        Scanner sca = new Scanner(System.in);
//        Vehicle [] cars = new Vehicle[50];
//        boolean out = false;
//        while (!out) {
//            System.out.print("Menu:\n" +
//                    "1. Tao cac doi tuong xe va nhap thong tin\n" +
//                    "2. Xuat bang ke khai tien thue cua cac xe\n" +
//                    "3. Thoat\n" +
//                    "Nhap yeu cau cua ban: ");
//            int choice = sca.nextInt();
//            switch (choice) {
//                case 1 :
//                    System.out.print("Nhap dung tich xy lanh cua xe: ");
//                    double xyLanh = sca.nextInt();
//                    System.out.print("Nhap gia tri cua xe: ");
//                    double valueCar = sca.nextInt();
//                    int count;
////                    cars[count] = new Vehicle(xyLanh, valueCar);
//                    out = false;
//                    break;
//                case 2 :
////                    for (int i=0; i<count; i++) {
//                        System.out.println("Thue cua xe "+i+" la: "+cars[i].getTax());
//                    }
//                    out = false;
//                    break;
////                default:
//                    System.out.println("-> Da hoan thanh <-");
//                    out = true;
//            }
//        }
//
////        System.out.println(count);
////        System.out.println(cars[0]);
//
//    }
//}
