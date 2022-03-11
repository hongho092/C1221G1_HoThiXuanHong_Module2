package ss19_string_regex.bai_tap;

import java.util.Scanner;

public class CheckNumberPhone {
    public static void main(String[] args) {
        Validate validate = new Validate();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số điện thoại của bạn -> ");
        String numberPhone = scanner.nextLine();
        while (!validate.ValidatePhoneNumber(numberPhone)) {
            System.out.print("Nhập sai format, nhập lại số điện thoại -> ");
            numberPhone = scanner.nextLine();
        }
        System.out.println("Đã hoàn thành nhập số điện thoại.");
    }
}
