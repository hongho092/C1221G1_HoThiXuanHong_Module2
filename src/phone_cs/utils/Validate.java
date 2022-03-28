package phone_cs.utils;

import java.util.Scanner;

public class Validate {
    static final String SODUONG_REGEX = "^[0-9]+$";
    static final String THOIGIANBAOHANH_REGEX = "^(\\d{1}|[1-9]{1}[1-9]{1}|[1-6]{1}[1-9]{1}[1-9]{1}|[7]{1}[1-2]{1}[1-9]{1}|730)$";
    static final String PHAMVIBAOHANH_REGEX = "^(Toan quoc|Quoc te)$";
    static final String TRANGTHAI_REGEX = "^(Da sua chua|Chua sua chua)$";

    public static String regexStr (String temp, String regex, String error) {
        Scanner sca = new Scanner(System.in);
        boolean check = false;
        do {
            if (temp.matches(regex)) {
                check = true;
            } else {
                System.out.print(error);
                temp = sca.nextLine();
            }
        } while (!check);
        return temp;
    }

    public String regexSoDuong (String soDuong) {
        return regexStr(soDuong, SODUONG_REGEX, "Nhập sai format số, nhập lại: ");
    }

    public String regexThoiGianBaoHanh (String thoiGianBanHanh) {
        return regexStr(thoiGianBanHanh, THOIGIANBAOHANH_REGEX, "Thời gian bảo hành chỉ trong 730 ngày, nhập lại: ");
    }
    public String regexPhamViBaoHanh (String phamViBaoHanh) {
        return regexStr(phamViBaoHanh, PHAMVIBAOHANH_REGEX, "Nhập Toan quoc hoặc Quoc te, nhập lại: ");
    }

    public String regexTrangThai (String trangThai) {
        return regexStr(trangThai, TRANGTHAI_REGEX, "Nhập Da sua chua hoặc Chua sua chua, nhập lại: ");
    }
}
