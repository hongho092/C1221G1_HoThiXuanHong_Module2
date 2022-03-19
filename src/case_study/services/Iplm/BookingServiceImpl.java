package case_study.services.Iplm;

import case_study.models.Booking;
import case_study.models.facility.Facility;
import case_study.models.person.Customer;
import case_study.services.IBookingService;
import case_study.utils.ReadAndWrite;
import java.util.*;

public class BookingServiceImpl implements IBookingService {
    Scanner sca = new Scanner(System.in);
    @Override
    public void showList() {
        Set<Booking> bookingSet = ReadAndWrite.readBookingListFromCSV();
        for (Booking b : bookingSet) {
            System.out.println(b);
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập maBooking, ngayBatDau, ngayKetThuc, maKhachHang, maDichVu, loaiDichVu: ");
        int maBooking = Integer.parseInt(sca.nextLine());
        String ngayBatDau =  sca.nextLine();
        String ngayKetThuc = sca.nextLine();
        int maKhachHang = chonMaKhachHang();
        String maDichVu = chonMaDichVu();
        String loaiDichVu = sca.nextLine();
        Booking booking = new Booking(maBooking, ngayBatDau, ngayKetThuc, maKhachHang, maDichVu, loaiDichVu);
        Set<Booking> bookingList = new TreeSet<>();
        bookingList.add(booking);
        ReadAndWrite.writeBookingListToCSV( bookingList, true);
        showList();
    }

    @Override
    public void edit() {
    }

    public int chonMaKhachHang() {
        List<Customer> customerList = ReadAndWrite.readCustomerListFromCSV();
        for (int i = 0; i < customerList.size(); i++) {
            System.out.println(i + 1 + " " + customerList.get(i).getMaKhachHang());
        }
        System.out.print("Chọn mã khách hàng: ");
        int choice = Integer.parseInt(sca.nextLine());
        int maKhachHang = 0;
        for (int i = 0; i < customerList.size(); i++) {
            maKhachHang = customerList.get(choice - 1).getMaKhachHang();
        }
        return maKhachHang;
    }

    public String chonMaDichVu() {
        List<String> mangmaDichVu = new ArrayList<>();
        Map<Facility, Integer> facilityList = new LinkedHashMap<>();
        facilityList.putAll(ReadAndWrite.readVillaListFromCSV());
        facilityList.putAll(ReadAndWrite.readHouseListFromCSV());
        facilityList.putAll(ReadAndWrite.readRoomListFromCSV());
        for (Facility f : facilityList.keySet()) {
            mangmaDichVu.add(f.getMaDichVu());
        }
        for (int i=0; i<mangmaDichVu.size(); i++) {
            System.out.println(i+1 +" "+ mangmaDichVu.get(i));
        }
        System.out.print("Chọn mã dịch vụ: ");
        int choice = Integer.parseInt(sca.nextLine());
        String maDichVu = null;
        for (int i=0; i<mangmaDichVu.size(); i++) {
            maDichVu = mangmaDichVu.get(choice - 1);
        }
        return maDichVu;
    }
}
