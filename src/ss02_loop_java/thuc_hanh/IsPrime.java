package ss02_loop_java.thuc_hanh;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number you want");
        int num = Integer.parseInt(scanner.nextLine());
        boolean check = true;
        if (num < 2) {
            System.out.println("number is not a prime");
        } else {
            int i = 2;
            while (i <= Math.sqrt(num)) {
                if (num % i == 0) {
                check = false;
                break;
            }
            i++;
            }
            if (check) {
                System.out.println("number is a prime");
            } else System.out.println("number is not a prime");
        }
    }
}
