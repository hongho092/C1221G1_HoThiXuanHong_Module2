package ss3_array_method_in_java.bai_tap;

import java.util.Scanner;

public class FindMin {
    public static void main(String[] args) {
        // Tim min trong mang 2 chieu:
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap so dong: ");
//        int row = scanner.nextInt();
//        int col = 3;
//        int [][] arr = new int[row][col];
//        for (int i=0; i<row; i++) {
//            System.out.println("Nhap so o ban muon trong dong "+i);
//            col = scanner.nextInt();
//            for (int j=0 ; j<col; j++) {
//                System.out.println("Nhap so ban muon: ");
//                arr[i][j] = scanner.nextInt();
//            }
//        }
//        int min = arr [0][0];
//        for (int i=0; i<arr.length; i++) {
//            for (int j=0 ; j<arr[i].length; j++) {
//                if(arr [i][j] < min) {
//                    min = arr [i][j];
//                }
//            }
//        }

        // tim min trong mang 1 chieu
        System.out.print("Nhap so phan tu: ");
        int num = scanner.nextInt();
        int [] arr = new int[num];
        for(int i=0; i<num; i++){
            System.out.print("Nhap phan tu thu "+(i+1)+": ");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int i=1; i<num; i++){
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("min: "+min);
    }
}
