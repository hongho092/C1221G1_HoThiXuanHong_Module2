package case_study.services.Iplm.check_in_iplm;

import case_study.models.check_in.Booking;
import case_study.models.check_in.Contract;
import case_study.services.interface_service.IContactService;
import case_study.utils.ReadAndWrite;

import java.sql.SQLOutput;
import java.util.*;

public class ContactServiceImpl implements IContactService {
    BookingServiceImpl bookingService = new BookingServiceImpl();
    Scanner sca = new Scanner(System.in);
    static List<Contract> contractList = ReadAndWrite.readContractListFromCSV();

    @Override
    public void showList() {
        System.out.println("Danh sách hợp đồng.");
        for (Contract c : contractList) {
            System.out.println(c);
        }
    }

    @Override
    public void add() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = bookingService.bookingSet;
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            int maBooking = booking.getMaBooking();
            int maKhachHang = booking.getMaKhachHang();
            System.out.println("Tạo contract cho Booking có thông tin: "+booking);
            System.out.print("SoHopDong: ");
            int soHopDong = Integer.parseInt(sca.nextLine());
            System.out.print("SoTienDatCoc: ");
            int soTienDatCoc = Integer.parseInt(sca.nextLine());
            System.out.print("TongThanhToan: ");
            int tongThanhToan = Integer.parseInt(sca.nextLine());
            Contract contract = new Contract(soHopDong, maBooking, soTienDatCoc, tongThanhToan, maKhachHang);
            contractList.add(contract);
            ReadAndWrite.writeContractListToCSV(contractList, true);
        }
        showList();
    }

    @Override
    public void edit() {
        showList();

        boolean out1 = true;
        int soHopDong = -1;
        do {
            try {
                System.out.print("Nhập SoHopDong cần sửa: ");
                soHopDong = Integer.parseInt(sca.nextLine());
                for (int i=0; i<contractList.size(); i++) {
                    if (soHopDong == contractList.get(i).getSoHopDong()) {
                        out1 = true;
                        break;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Đã nhập sai format số.");
                out1 = false;
            }
        } while (!out1);

        boolean out = true;
        do {
            System.out.print("1. SoHopDong\n" +
                    "2. MaBoooking\n" +
                    "3. SoTienDatCoc\n" +
                    "4. TongThanhToan\n" +
                    "5. MaKhachHang\n" +
                    "Chọn thông tin bạn muốn sửa");
            int choice = Integer.parseInt(sca.nextLine());
            for (int i=0; i<contractList.size(); i++) {
                if (soHopDong == contractList.get(i).getSoHopDong()) {
                    switch (choice) {
                        case 1 :
                            System.out.print("SoHopDong: ");
                            contractList.get(i).setSoHopDong(Integer.parseInt(sca.nextLine()));
                            break;
                        case 2:
                            System.out.print("MaBoooking: ");
                            contractList.get(i).setMaBooking(Integer.parseInt(sca.nextLine()));
                            break;
                        case 3:
                            System.out.print("SoTienDatCoc: ");
                            contractList.get(i).setSoTienDatCoc(Integer.parseInt(sca.nextLine()));
                            break;
                        case 4:
                            System.out.print("TongThanhToan: ");
                            contractList.get(i).setTongThanhToan(Integer.parseInt(sca.nextLine()));
                            break;
                        case 5:
                            System.out.print("MaKhachHang: ");
                            contractList.get(i).setMaKhachHang(Integer.parseInt(sca.nextLine()));
                            break;
                        default:
                            System.out.println("Không có lựa chọn nào. ");
                    }
                    System.out.print("Bạn có muốn thoát (Y?N?): ");
                    String ans = sca.nextLine();
                    if ("Y".equals(ans)) {
                        out = false;
                    }
                }
            }
        } while (out);
        ReadAndWrite.writeContractListToCSV(contractList, false);
        showList();
    }
}
