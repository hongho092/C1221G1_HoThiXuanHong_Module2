package ss03_array_method_in_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu mang arr1 va arr2:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int [] arr1 = new int[num1];
        int [] arr2 = new int[num2];
        for (int i=0; i<num1; i++) {
            System.out.println("Nhap phan tu mang arr1 cua phan tu "+i);
            arr1[i] = scanner.nextInt();
        }
        for (int i=0; i<num2; i++) {
            System.out.println("Nhap phan tu mang arr2 cua phan tu "+i);
            arr2[i] = scanner.nextInt();
        }
//        for (int x:arr1) {
//            System.out.println(x);
//        }
//        for (int x:arr2) {
//            System.out.println(x);
//        }
        int num3 = num1 + num2;
        int [] arr3 = new int[num3];
        for (int i=0; i<arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i=num1; i<num3; i++) {
            arr3[i] = arr2[i-num1];
        }
        for (int x:arr3) {
            System.out.println(x);
        }
    }
}
