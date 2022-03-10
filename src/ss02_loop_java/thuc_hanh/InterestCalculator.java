package ss02_loop_java.thuc_hanh;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your money:");
        double money = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter interest rate:");
        double interestRate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter month:");
        int month = Integer.parseInt(scanner.nextLine());
        double totalInterest = 0;
        for (int i=0; i<month; i++) {
            totalInterest += money * (interestRate/100)/12 * month;
        }
        System.out.println("Total of interest: "+totalInterest);

    }
}
