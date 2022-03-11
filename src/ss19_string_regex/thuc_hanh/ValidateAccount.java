package ss19_string_regex.thuc_hanh;

import java.util.Scanner;

public class ValidateAccount {
    public static boolean checkAccount (String account) {
        String regex = "^[a-z_0-9]{6,}$";
        return account.matches(regex);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập tên tài khoản muốn tạo -> ");
        String account = scanner.nextLine();
        while (! checkAccount(account)) {
            System.out.print("Nhập sai, nhập lại tên tài khoản muốn tạo -> ");
            account = scanner.nextLine();
        }
        System.out.println("Tên tài khoản thành công.");


//        do {
//            System.out.print("Nhập sai, nhập lại số tài khoản muốn tạo -> ");
//            account = scanner.nextLine();
//        } while (! accountExample.checkAccount(account));
    }
}
