package ss3_array_method_in_java.bai_tap;

import java.util.Scanner;

public class AddIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {12,23,34,45,56,67,78,89,91};
        System.out.println("Nhap so can chen: ");
        int num = scanner.nextInt();
        System.out.println("Nhap vi tri muon chen: ");
        int loca = scanner.nextInt();
        while (loca < 0 || loca > arr.length) {
            System.out.println("Khong the chen vao vi tri nay." +
                               "Hay nhap lai vi tri muon chen: ");
            loca = scanner.nextInt();
        }
        for (int i=0; i<arr.length; i++) {
            if (i == loca) {
//                num = arr[i];
                arr[i + 1] = arr[i];
                arr[i] = num;
            }
            System.out.println(arr[i]);
        }
    }
}
