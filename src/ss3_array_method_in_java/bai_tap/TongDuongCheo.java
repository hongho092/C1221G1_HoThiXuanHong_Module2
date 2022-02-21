package ss3_array_method_in_java.bai_tap;

import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dong: ");
        int row = scanner.nextInt();
        int col = row;
        int [][] arr = new int[row][col];
        for (int i=0; i<row; i++) {
            System.out.println("Nhap so o ban muon trong dong " + i);
            col = scanner.nextInt();
            for (int j = 0; j < col; j++) {
                System.out.println("Nhap so ban muon: ");
                arr[i][j] = scanner.nextInt();
            }
        }
//        for (int i=0; i<arr.length; i++) {
//            for (int j=0 ; j<arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
        int sum = 0;
        for (int i=0; i< arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Sum cua duong cheo la: "+sum);
    }
}
