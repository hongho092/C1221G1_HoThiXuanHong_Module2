package ss3_array_method_in_java.bai_tap;

import java.util.Scanner;

public class TongCuaCot {
    public static void main(String[] args) {
        int [][] arr = {
                {4,6,5,3,6,10},
                {7,3,6,3,6,8},
                {4,2,6,3,5,12}
        };
        Scanner num = new Scanner(System.in);
        System.out.println("Nhap so cot ban muon cong tong: ");
        int col = num.nextInt();
        int sum = 0;
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                if (j == col) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
