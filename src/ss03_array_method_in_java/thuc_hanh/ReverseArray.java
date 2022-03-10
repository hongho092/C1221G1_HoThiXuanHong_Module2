package ss03_array_method_in_java.thuc_hanh;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong phan tu: ");
        int num = scanner.nextInt();
        int [] arr = new int[num];
        for (int i=0; i<num; i++) {
            System.out.println("Nhap index: "+i);
            arr[i] = scanner.nextInt();
        }
        for (int i : arr) {
            System.out.println(i);
        }
        for (int i=0; i<num/2; i++) {
            int tem = arr[arr.length - 1-i];
            arr[arr.length-1-i] = arr[i];
            arr[i] = tem;
        }
        for (int i=0; i<num; i++) {
            System.out.println(arr[i]);
        }

    }
}
