package ss03_array_method_in_java.bai_tap;

import java.util.Scanner;

public class CountCharacter {
    public static void main(String[] args) {
        Scanner sca = new Scanner (System.in);
        System.out.print("Nhập vào chuỗi để kiểm tra: ");
        String string = sca.nextLine();
        System.out.print("Chuỗi nhập vào là: " + "'" + string + "'");

        System.out.println("");

        System.out.print("Nhập vào kí tự cần kiểm tra: ");
        char ktu = sca.next().charAt(0);

        int count = 0;
        char [] str = string.toCharArray();
        for (int i=0; i<str.length; i++) {
            if (ktu == str[i]) {
                count ++;
            }
        }

        System.out.println("Số lần kí tự xuất hiện: "+count);
    }
}
