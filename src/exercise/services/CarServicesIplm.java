package exercise.services;

import exercise.models.Brand;
import exercise.models.Car;
import exercise.util.ReadAndWrite;
import exercise.util.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarServicesIplm implements IServices{
    Scanner sca = new Scanner(System.in);
    Validate validate = new Validate();
    @Override
    public void add() {
        System.out.print("Nhập biển kiểm soát: ");
        String a = sca.nextLine();
        while (! validate.checkBienKiemSoatCar(a)) {
            System.out.print("Nhập sai format biển kiểm soát, nhập lại -> ");
            a = sca.nextLine();
        }
        System.out.println("Chọn và nhập hãng sản xuất: ");
        List<Brand> brandList = ReadAndWrite.readBrandListFromCSV();
        for (Brand b : brandList) {
            System.out.println(b.brand());
        }
        String b = sca.nextLine();
        System.out.print("Nhập năm sản xuất: ");
        int c = Integer.parseInt(sca.nextLine());
        System.out.print("Nhập chủ sở hữu: ");
        String d = sca.nextLine();
        System.out.print("Nhập số chỗ ngồi: ");
        int f = Integer.parseInt(sca.nextLine());
        System.out.print("Nhập kiểu xe: ");
        String e = sca.nextLine();
        Car car = new Car(a,b,c,d,f,e);
        List<Car> carList = new ArrayList<>();
        carList.add(car);
        ReadAndWrite.writeCarListToCSV(carList,true);
        show();
    }

    @Override
    public void show() {
        List<Car> carList =  ReadAndWrite.readCarListFromCSV();
        System.out.println("Danh sách xe hơi: ");
        for (Car c : carList) {
            System.out.println(c);
        }
    }

    @Override
    public void delete() {
        List<Car> carList = ReadAndWrite.readCarListFromCSV();
        show();
        System.out.print("Chọn biển kiểm soát muốn xóa -> ");
        String bienKiemSoat = sca.nextLine();
        for (int i=0; i<carList.size(); i++) {
            if (carList.get(i).getBienKiemSoat().equals(bienKiemSoat)) {
                System.out.println("Bạn có chắc muốn xóa không (1: có hoặc 2: không): ");
                int ans = Integer.parseInt(sca.nextLine());
                if (ans == 1) {
                    carList.remove(i);
                    ReadAndWrite.writeCarListToCSV(carList, false);
                } else
                    System.out.println("Bạn không muốn xóa.");
            }
        }
        show();
    }
}
