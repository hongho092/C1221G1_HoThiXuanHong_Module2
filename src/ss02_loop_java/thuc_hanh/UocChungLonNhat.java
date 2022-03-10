package ss02_loop_java.thuc_hanh;

import java.util.Scanner;

public class UocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter b:");
        int b = Integer.parseInt(scanner.nextLine());
        a = Math.abs(a);
        b = Math.abs(b);
        if (a==0 || b==0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            }else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);

    }
}
