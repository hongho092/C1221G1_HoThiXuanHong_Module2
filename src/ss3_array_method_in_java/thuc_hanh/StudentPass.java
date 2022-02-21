package ss3_array_method_in_java.thuc_hanh;

import java.util.Scanner;

public class StudentPass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong sinh vien: ");
        int num = scanner.nextInt();
        while (num > 30) {
            System.out.println("Da qua so luong sinh vien. " +
                    "Hay nhap lai.");
            num = scanner.nextInt();
        }
        int [] mark = new int[num];
        for (int i=1; i<=num; i++) {
            System.out.println("Nhap diem cua sinh vien "+i+" :");
            mark[i] = scanner.nextInt();
        }
        int count = 0;
        for (int j=0; j<num; j++) {
            System.out.println("Diem cua sinh vien "+j+" la: "+mark[j]);
            if (mark[j] >5) {
                count++;
            }
        }
        System.out.println("So luong sinh vien pass: "+count);
    }
}
