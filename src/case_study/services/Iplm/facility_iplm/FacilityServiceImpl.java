package case_study.services.Iplm.facility_iplm;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.services.interface_service.IFacilityService;
import case_study.utils.ReadAndWrite;
import case_study.utils.Validate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    Scanner sca = new Scanner(System.in);
    Validate validate = new Validate();

    @Override
    public void showList() {
        Map<Facility, Integer> facilityList = new LinkedHashMap<>();
        facilityList.putAll(ReadAndWrite.readVillaListFromCSV());
        facilityList.putAll(ReadAndWrite.readHouseListFromCSV());
        facilityList.putAll(ReadAndWrite.readRoomListFromCSV());
        for (Map.Entry<Facility, Integer> entry : facilityList.entrySet()) {
            System.out.println(entry);
        }
    }

    @Override
    public void addHouse() {
        House house = new House();
        System.out.println("Nhập maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue, tieuChuanPhong, soTang: ");
        commonFacility(house);
        System.out.print("TieuChuanPhong: ");
        house.setTieuChuanPhong(sca.nextLine());
        while (!validate.ValidateTen(house.getTieuChuanPhong())) {
            System.out.print("Nhập kieuThue sai format, hãy nhập lại: ");
            house.setTieuChuanPhong(sca.nextLine());
        }
        System.out.print("SoTang: ");
        house.setSoTang(Integer.parseInt(sca.nextLine()));
        while (house.getSoTang() < 0) {
            System.out.print("Số tầng bé hơn 0, hãy nhập lại: ");
            house.setSoTang(Integer.parseInt(sca.nextLine()));
        }
        Map<House, Integer> houseList = new LinkedHashMap<House, Integer>();
        houseList.put(house, 0);
        ReadAndWrite.writeHouseListToCSV((LinkedHashMap<House, Integer>) houseList, true);
        showList();
    }

    @Override
    public void addRoom() {
        Room room = new Room();
        System.out.println("Nhập maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue, dichVuKem:");
        commonFacility(room);
        System.out.print("DichVuKem: ");
        room.setDichVuKem(sca.nextLine());
        Map<Room, Integer> roomList = new LinkedHashMap<>();
        roomList.put(room, 0);
        ReadAndWrite.writeRoomListToCSV((LinkedHashMap<Room, Integer>) roomList, true);
        showList();
    }

    @Override
    public void addVilla() {
        Villa villa = new Villa();
        System.out.println("Nhập maDichVu, tenDichVu, dienTichSuDung, chiPhiThue, soLuongNguoi, kieuThue, tieuChuanPhong, dienTichHoBoi, soTang:");
        commonFacility(villa);
        System.out.print("TieuChuanPhong: ");
        villa.setTieuChuanPhong(sca.nextLine());
        while (!validate.ValidateTen(villa.getTieuChuanPhong())) {
            System.out.print("Nhập TieuChuanPhong sai format, hãy nhập lại: ");
            villa.setTieuChuanPhong(sca.nextLine());
        }
        System.out.print("DienTichHoBoi: ");
        villa.setDienTichHoBoi(Integer.parseInt(sca.nextLine()));
        while (villa.getDienTichHoBoi() < 30) {
            System.out.print("Diện tích bé hơi 30m2, hãy nhập lại: ");
            villa.setDienTichHoBoi(Integer.parseInt(sca.nextLine()));
        }
        System.out.print("SoTang: ");
        villa.setSoTang(Integer.parseInt(sca.nextLine()));
        while (villa.getSoTang() < 0) {
            System.out.print("Số tầng bé hơn 0, hãy nhập lại: ");
            villa.setSoTang(Integer.parseInt(sca.nextLine()));
        }
        Map<Villa, Integer> villaList = new LinkedHashMap<>();
        villaList.put(villa, 0);
        ReadAndWrite.writeVillaListToCSV((LinkedHashMap<Villa, Integer>) villaList, true);
        showList();
    }

    public void commonFacility(Facility facility) {
        System.out.print("MaDichVu: ");
        facility.setMaDichVu(sca.nextLine());
        if (facility instanceof Villa) {
            while (!validate.ValidateMaVilla(facility.getMaDichVu())) {
                System.out.print("Nhập maDichVu sai format, hãy nhập lại (SVVL-YYYY): ");
                facility.setMaDichVu(sca.nextLine());
            }
        } else if (facility instanceof House) {
            while (!validate.ValidateMaHouse(facility.getMaDichVu())) {
                System.out.print("Nhập maDichVu sai format, hãy nhập lại (SVHO-YYYY): ");
                facility.setMaDichVu(sca.nextLine());
            }
        } else if (facility instanceof Room) {
            while (!validate.ValidateMaRoom(facility.getMaDichVu())) {
                System.out.print("Nhập maDichVu sai format, hãy nhập lại (SVRO-YYYY): ");
                facility.setMaDichVu(sca.nextLine());
            }
        }
        System.out.print("TenDichVu: ");
        facility.setTenDichVu(sca.nextLine());
        while (!validate.ValidateTen(facility.getTenDichVu())) {
            System.out.print("Nhập tenDichVu sai format, hãy nhập lại: ");
            facility.setTenDichVu(sca.nextLine());
        }
        System.out.print("DienTichSuDung: ");
        facility.setDienTichSuDung(Integer.parseInt(sca.nextLine()));
        while (facility.getDienTichSuDung() < 30) {
            System.out.print("Diện tích bé hơn 30m2, hãy nhập lại: ");
            facility.setDienTichSuDung(Integer.parseInt(sca.nextLine()));
        }
        System.out.print("ChiPhiThue: ");
        facility.setChiPhiThue(Integer.parseInt(sca.nextLine()));
        while (facility.getChiPhiThue() < 0) {
            System.out.print("Chi phí thuê bé hơn 0, hãy nhập lại: ");
            facility.setChiPhiThue(Integer.parseInt(sca.nextLine()));
        }
        System.out.print("SoLuongNguoi: ");
        facility.setSoLuongNguoi(Integer.parseInt(sca.nextLine()));
        while (facility.getSoLuongNguoi()<0 || facility.getSoLuongNguoi()>20) {
            System.out.print("Số lượng người sai quy định, hãy nhập lại: ");
            facility.setSoLuongNguoi(Integer.parseInt(sca.nextLine()));
        }
        System.out.print("KieuThue: ");
        facility.setKieuThue(sca.nextLine());
        while (!validate.ValidateTen(facility.getKieuThue())) {
            System.out.print("Nhập kieuThue sai format, hãy nhập lại: ");
            facility.setKieuThue(sca.nextLine());
        }
    }

}
