package ss3_array_method_in_java.bai_tap;

import java.util.Scanner;

public class DeleteIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {12,23,34,45,56,67,78,89,91};
        System.out.println("Enter number that you find: ");
        int num = scanner.nextInt();
        boolean check = false;
        for (int i=0; i<arr.length; i++) {
            if (num == arr[i]) {
                System.out.println("Index of this arr");
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Not exist");
        }
        for (int i=0; i< arr.length; i++) {
            if (num == arr[i]) {
                arr[i] = arr[i+1];
            }
        }
        arr[arr.length-1] =0;
        for (int x:arr) {
            System.out.println(x);
        }
    }
}
