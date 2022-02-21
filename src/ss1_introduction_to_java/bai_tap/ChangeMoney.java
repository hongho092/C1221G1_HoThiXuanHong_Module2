package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ChangeMoney {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of USD:");
        int usd = Integer.parseInt(scanner.nextLine());
        int value = usd * 20000;
        System.out.println("Value of VND:" + value);
    }
}
