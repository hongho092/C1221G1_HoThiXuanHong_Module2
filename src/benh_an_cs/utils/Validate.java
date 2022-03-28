package benh_an_cs.utils;

import java.util.Scanner;

public class Validate {
    static final String MABENHAN_REGEX = "^BA-[0-9]{3}$";
    static final String MABENHNHAN_REGEX = "^BN-[0-9]{3}$";
    static final String GOIVIP_REGEX = "^(VIP I|VIP II|VIP III)$";
    static final String THOIHANVIP_REGEX = "^\\d+$";
    static final String TEN_REGEX = "^\\\\p{Lu}\\\\p{Ll}+( \\\\p{Lu}\\\\p{Ll}+)*$\n";
    static final String NGAYTHANGNAM_REGEX = "(^(((0[1-9]|1[0-9]|2[0-8])[\\/](0[1-9]|1[012]))|((29|30|31)[\\/](0[13578]|1[02]))|((29|30)[\\/](0[4,6,9]|11)))[\\/](19|[2-9][0-9])\\d\\d$)|(^29[\\/]02[\\/](19|[2-9][0-9])(00|04|08|12|16|20|24|28|32|36|40|44|48|52|56|60|64|68|72|76|80|84|88|92|96)$)";

    public static String regexStr(String temp, String regex, String error) {
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

    public String regexMaBenhAn(String maBenhAn) {
        return regexStr(maBenhAn, MABENHAN_REGEX, "Nhập sai format bệnh án (BA-XXX), nhập lại: ");
    }

    public String regexMaBenhNhan(String maBenhNhan) {
        return regexStr(maBenhNhan, MABENHNHAN_REGEX, "Nhập sai format bệnh nhân (BN-XXX), nhập lại: ");
    }

    public String regexGoiVip(String goiVip) {
        return regexStr(goiVip, GOIVIP_REGEX, "Chỉ được nhập VIP I, VIP II, VIP III, nhập lại: ");
    }

    public String regexNgayThangNam(String ngayThangNam) {
        return regexStr(ngayThangNam, NGAYTHANGNAM_REGEX, "Nhập ngày tháng năm không hộp lí (dd/MM/yyyy), nhập lại: ");
    }

    public String regexTen(String ten) {
        return regexStr(ten, TEN_REGEX, "Nhập sai kiểu tên (phải viết hoa đầu), nhập lại: ");
    }

    public String regexThoiHan(String thoiHan) {
        return regexStr(thoiHan, THOIHANVIP_REGEX, "Phải nhập số, nhập lại");
    }
}

