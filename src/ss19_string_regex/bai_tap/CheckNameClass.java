package ss19_string_regex.bai_tap;

import java.util.Scanner;

public class CheckNameClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Validate validate = new Validate();
        System.out.print("Nhập tên lớp: ");
        String nameClass = scanner.nextLine();
        while (!validate.ValidateNameClass(nameClass)) {
            System.out.print("Nhập sai format, nhập lại tên lớp: ");
            nameClass = scanner.nextLine();
        }
        System.out.println("Đã hoàn thành tên lớp.");
    }
}
