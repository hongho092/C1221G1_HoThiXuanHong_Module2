package benh_an_cs.services;

import benh_an_cs.models.BenhAn;
import benh_an_cs.models.BenhAnThuong;
import benh_an_cs.models.BenhAnVip;
import benh_an_cs.utils.GetNumber;
import benh_an_cs.utils.NotFoundMedicalRecordException;
import benh_an_cs.utils.ReadAndWrite;
import benh_an_cs.utils.Validate;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class BenhAnIplm implements IBenhAnServices{
    Validate validate = new Validate();
    Scanner scanner = new Scanner(System.in);
    GetNumber getNumber = new GetNumber();

    public Set<BenhAn> getBenhAnList() {
        Set<BenhAn> benhAns = new TreeSet<>();
        benhAns.addAll(ReadAndWrite.readBenhAnThuongListFromCSV());
        benhAns.addAll(ReadAndWrite.readBenhAnVipListFromCSV());
        return benhAns;
    }

    @Override
    public void addBenhAnThuong() {
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        BenhAnThuong benhAnThuong = new BenhAnThuong();
        addBenhAnCommon(benhAnThuong);
        System.out.print("Nhập phí nằm viện: ");
//        int pNV = Integer.parseInt(scanner.nextLine());
//        String phiNamVien = currencyVN.format(Integer.parseInt(scanner.nextLine()));
        benhAnThuong.setPhiNamVien(currencyVN.format(Integer.parseInt(scanner.nextLine())));
        List<BenhAnThuong> benhAnThuongs = new ArrayList<>();
        benhAnThuongs.add(benhAnThuong);
        ReadAndWrite.writeBenhAnThuongListToCSV(benhAnThuongs, true);
        System.out.println("Đã thêm bênh án thường thành công.");
        display();
    }

    @Override
    public void addBenhAnVip() {
        BenhAnVip benhAnVip = new BenhAnVip();
        addBenhAnCommon(benhAnVip);
        System.out.print("Nhập loại Vip: ");
        benhAnVip.setLoaiVip(validate.regexGoiVip(scanner.nextLine()));
        System.out.print("Nhập thời hạn Vip");
        benhAnVip.setThoiHanVip(validate.regexThoiHan(scanner.nextLine()));
        List<BenhAnVip> benhAnVips = new ArrayList<>();
        benhAnVips.add(benhAnVip);
        ReadAndWrite.writeBenhAnVipListToCSV(benhAnVips, true);
        System.out.println("Đã thêm bênh án Vip thành công.");
        display();
    }

    @Override
    public void delete() {
        Set<BenhAn> benhAns = getBenhAnList();
        List<BenhAnThuong> bat = new ArrayList<>();
        List<BenhAnVip> bav = new ArrayList<>();
        BenhAn benhAn = null;
        boolean flag = true;
        boolean out = true;
        if (!benhAns.isEmpty()) {
            display();
            System.out.print("Chọn bệnh án điện thoại muốn xóa: ");
            int choice = -1;
            do {
                try {
                    choice = Integer.parseInt(scanner.nextLine());
                    for (BenhAn an : benhAns) {
                        if (choice == an.getSoThuTu()) {
                            benhAn = an;
                            flag = false;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.print("Bạn có chắc muốn xóa không (1.Yes/ 2.No): ");
                        int ans = getNumber.getNumberFormat(1,2);
                        switch (ans) {
                            case 1:
                                benhAns.remove(benhAn);
                                for (BenhAn an : benhAns) {
                                    if (an instanceof BenhAnThuong) {
                                        bat.add((BenhAnThuong) an);
                                    } else if (an instanceof BenhAnVip) {
                                        bav.add((BenhAnVip) an);
                                    }
                                }
                                ReadAndWrite.writeBenhAnThuongListToCSV(bat, false);
                                ReadAndWrite.writeBenhAnVipListToCSV(bav, false);
                                display();
                                break;
                            case 2:
                                System.out.println("Bạn không muốn xóa.");
                                break;
                            default:
                        }
                    } else {
                        throw new NotFoundMedicalRecordException("Bệnh án không tồn tại, nhập lại: ");
                    }
                } catch (NotFoundMedicalRecordException e) {
                    System.out.print(e.getMessage());
                    out = false;
                } catch (NumberFormatException e) {
                    System.out.print("Lỗi format số, nhập lại: ");
                    out = false;
                }
            } while (!out);
        } else
            System.out.println("Danh sách bệnh án trống.");
    }

    @Override
    public void display() {
        Set<BenhAn> benhAns = getBenhAnList();
        System.out.println("Danh sách bệnh án.");
        for (BenhAn ba : benhAns) {
            System.out.println(ba);
        }
    }

    public void addBenhAnCommon(BenhAn benhAn) {
        Set<BenhAn> benhAns = getBenhAnList();
        int id = 1;
        int max = 0;
        if (!benhAns.isEmpty()) {
            for (BenhAn an : benhAns) {
                if (an.getSoThuTu() > max) {
                    max = an.getSoThuTu();
                }
            }
            id = max + 1;
        }
        benhAn.setSoThuTu(id);
        System.out.println("Nhập thông tin cho bệnh án có id: "+id);
        System.out.print("Nhập mã bệnh án: ");
        benhAn.setMaBenhAn(validate.regexMaBenhAn(scanner.nextLine()));
        System.out.print("Nhập mã bệnh nhân: ");
        benhAn.setMaBenhNhan(validate.regexMaBenhNhan(scanner.nextLine()));
        System.out.print("Nhập tên bệnh nhân: ");
        benhAn.setTenBenhNhan(scanner.nextLine());
        System.out.print("Nhập ngày nhập viên: ");
        benhAn.setNgayNhapVien(validate.regexNgayThangNam(scanner.nextLine()));
        System.out.print("Nhập ngày ra viện: ");
        int check = 1;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate start = LocalDate.parse(benhAn.getNgayNhapVien(), formatter);
        do {
            benhAn.setNgayRaVien(validate.regexNgayThangNam(scanner.nextLine()));
            LocalDate end = LocalDate.parse(benhAn.getNgayRaVien(), formatter);
            if (Period.between(start, end).getDays() < 0) {
                System.out.print("Ngày kết thúc phải lớn hơn hoặc cùng ngày nhập viện: ");
                check = 2;
            } else check = 1;
        } while (check == 2);
        System.out.print("Nhập lí do nhập viện: ");
        benhAn.setLiDoNhapVien(scanner.nextLine());
    }
}
