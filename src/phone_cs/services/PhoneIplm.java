package phone_cs.services;

import phone_cs.models.DienThoai;
import phone_cs.models.DienThoaiChinhHang;
import phone_cs.models.DienThoaiXachTay;
import phone_cs.utils.GetNumber;
import phone_cs.utils.NotFoundProductException;
import phone_cs.utils.ReadAndWrite;
import phone_cs.utils.Validate;
import java.util.*;

public class PhoneIplm implements IDtService{
    Validate validate = new Validate();
    Scanner sca = new Scanner(System.in);
    GetNumber getNumber = new GetNumber();

    public Set<DienThoai> getDienThoaiList() {
        Set<DienThoai> dienThoaiList = new TreeSet<>();
        dienThoaiList.addAll(ReadAndWrite.readDTCHListFromCSV());
        dienThoaiList.addAll(ReadAndWrite.readDTXTListFromCSV());
        return dienThoaiList;
    }

    public void add(DienThoai dienThoai) {
        Set<DienThoai> dienThoaiList = getDienThoaiList();
        int id = 1;
        int max = 0;
        if (!dienThoaiList.isEmpty()) {
            for (DienThoai dt : dienThoaiList) {
                if (dt.getId() > max) {
                    max = dt.getId();
                }
            }
            id = max + 1;
        }
        dienThoai.setId(id);
        System.out.println("Nhập thông tin cho điện thoại có id: "+id);
        System.out.print("TenDienThoai: ");
        dienThoai.setTenDienThoai(sca.nextLine());
        System.out.print("GiaBan: ");
        dienThoai.setGiaBan(validate.regexSoDuong(sca.nextLine()));
        System.out.print("SoLuong: ");
        dienThoai.setSoLuong(validate.regexSoDuong(sca.nextLine()));
        System.out.print("NhaSanXuat: ");
        dienThoai.setNhaSanXuat(sca.nextLine());
    }

    @Override
    public void addDTXT() {
        DienThoaiXachTay dienThoaiXachTay = new DienThoaiXachTay();
        add(dienThoaiXachTay);
        System.out.print("QuocGiaXachTay: ");
        dienThoaiXachTay.setQuocGiaXachTay(sca.nextLine());
        System.out.print("TrangThai: ");
        dienThoaiXachTay.setTrangThai(validate.regexTrangThai(sca.nextLine()));
        List<DienThoaiXachTay> dtxt = new ArrayList<>();
        dtxt.add(dienThoaiXachTay);
        ReadAndWrite.writeDTXTListToCSV(dtxt, true);
        display();
    }

    @Override
    public void addDTCH() {
        DienThoaiChinhHang dienThoaiChinhHang = new DienThoaiChinhHang();
        add(dienThoaiChinhHang);
        System.out.print("ThoiGianBaoHanh: ");
        dienThoaiChinhHang.setThoiGianBaoHanh(validate.regexThoiGianBaoHanh(sca.nextLine()));
        System.out.print("PhamViBaoHanh: ");
        dienThoaiChinhHang.setPhamViBaoHanh(validate.regexPhamViBaoHanh(sca.nextLine()));
        List<DienThoaiChinhHang> dtch = new ArrayList<>();
        dtch.add(dienThoaiChinhHang);
        ReadAndWrite.writeDTCHListToCSV(dtch, true);
        display();
    }

    public void delete () {
        Set<DienThoai> dienThoais = getDienThoaiList();
        List<DienThoaiChinhHang> dtch = new ArrayList<>();
        List<DienThoaiXachTay> dtxt = new ArrayList<>();
        DienThoai dienThoai = null;
        boolean flag = true;
        boolean out = true;
        if (!dienThoais.isEmpty()) {
            display();
            System.out.print("Chọn Id điện thoại muốn xóa: ");
            int choice = -1;
            do {
                try {
                    choice = Integer.parseInt(sca.nextLine());
                    for (DienThoai dt : dienThoais) {
                        if (choice == dt.getId()) {
                            dienThoai = dt;
                            flag = false;
                            break;
                        }
                    }
                    if (!flag) {
                        System.out.print("Bạn có chắc muốn xóa không (1.Yes/ 2.No): ");
                        int ans = getNumber.getNumberFormat(1,2);
                        switch (ans) {
                            case 1:
                                dienThoais.remove(dienThoai);
                                for (DienThoai dt : dienThoais) {
                                    if (dt instanceof DienThoaiChinhHang) {
                                        dtch.add((DienThoaiChinhHang) dt);
                                    } else if (dt instanceof DienThoaiXachTay) {
                                        dtxt.add((DienThoaiXachTay) dt);
                                    }
                                }
                                ReadAndWrite.writeDTCHListToCSV(dtch, false);
                                ReadAndWrite.writeDTXTListToCSV(dtxt, false);
                                display();
                                break;
                            case 2:
                                System.out.println("Bạn không muốn xóa.");
                                break;
                            default:
                        }
                    } else {
                        throw new NotFoundProductException("ID điện thoại không tồn tại, nhập lại: ");
                    }
                } catch (NotFoundProductException e) {
                    System.out.print(e.getMessage());
                    out = false;
                } catch (NumberFormatException e) {
                    System.out.print("Lỗi format số, nhập lại: ");
                    out = false;
                }
            } while (!out);
        } else
            System.out.println("Danh sách điện thoại trống.");
    }

    @Override
    public void display() {
        Set<DienThoai> dienThoaiList = getDienThoaiList();
        System.out.println("Danh sách điện thoại: ");
        for (DienThoai dt : dienThoaiList) {
            System.out.println(dt);
        }
    }

    @Override
    public void search() {
        Set<DienThoai> dienThoaiList = getDienThoaiList();
        System.out.print("Nhập tên điện thoại muốn tìm kiếm: ");
        String ans = sca.nextLine();
        for (DienThoai th : dienThoaiList) {
            if (th.getTenDienThoai().contains(ans)) {
                System.out.println("Bạn muốn tìm: "+th);
            }
        }
    }
}
