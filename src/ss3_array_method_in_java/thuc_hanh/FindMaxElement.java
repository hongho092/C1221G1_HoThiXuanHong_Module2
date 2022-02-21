package ss3_array_method_in_java.thuc_hanh;

import java.util.Scanner;

public class FindMaxElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong muon tim: ");
        int num = scanner.nextInt();
        while (num >= 20 ) {
            System.out.println("Da vuot qua muc." +
                    "Hay nhap lai so luong");
            num = scanner.nextInt();
        }
        int [] money = new int[num];
        for (int i=0; i<num; i++) {
            System.out.println("Hay nhap so tien thu "+i+" :");
            money[i] = scanner.nextInt();
        }
        for (int m : money) {
            System.out.println(m);
        }
        int max = money[0];
        for (int i=0; i<money.length; i++) {
            if (money[i] > max) {
                max = money[i];
            }
        }
        System.out.println("So tien lon nhat la: "+ max);
    }
}
