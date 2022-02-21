package ss3_array_method_in_java.thuc_hanh;

import java.util.Scanner;

public class ChangeTemplate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean choice = true;
        do {
            System.out.println("Menu\n" +
                    "1. Fahrenheit to Celsius\n" +
                    "2. Celsius to Fahrenheit\n" +
                    "0. Exit\n" +
                    "Choice number: ");
            int num = scanner.nextInt();
            switch (num) {
                case 1 :
                    System.out.println("Enter F to change C: ");
                    float F = scanner.nextFloat();
                    System.out.println("C: " + (5.0 / 9) * (F - 32));
                    break;
                case 2 :
                    System.out.println("Enter C to change F: ");
                    float C = scanner.nextFloat();
                    System.out.println("F: " + (9.0 / 5) * C + 32);
                    break;
                default:
                    choice = false;
            }
        } while (choice);
    }
}
