package case_study.services;

import case_study.models.Facility;
import case_study.models.House;
import case_study.utils.ReadAndWrite;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService{
    Scanner sca = new Scanner(System.in);
    @Override
    public void showList() {
        List<House> house = ReadAndWrite.readHouseListFromCSV();
        System.out.println("Danh sách nhà: ");
        for (Facility h : house) {
            System.out.println(h);
        }
    }

    @Override
    public void add() {
    }

    @Override
    public void addHouse() {
        System.out.println("Nhập tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue, tieuChuanPhong");
        String tenDichVu = sca.nextLine();
        double dienTichSuDung = Integer.parseInt(sca.nextLine());
        double chiPhiThue = Integer.parseInt(sca.nextLine());
        int soLuongNguoi = Integer.parseInt(sca.nextLine());
        String kieuThue = sca.nextLine();
        String tieuChuanPhong = sca.nextLine();
        House house = new House(tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue, tieuChuanPhong);
        LinkedHashMap<House, Integer> houseList = new LinkedHashMap<House, Integer>();
        houseList.put(house, 0);
        ReadAndWrite.writeHouseListToCSV(houseList, true);
        showList();

    }

    @Override
    public void addRoom() {

    }

    @Override
    public void addVilla() {

    }

    @Override
    public void edit() {

    }
}
