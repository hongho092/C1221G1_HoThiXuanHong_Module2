package ss01_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        int w = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your height: ");
        int h = Integer.parseInt(scanner.nextLine());
        double bmi = w / Math.pow( h, 2);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else System.out.println("Obese");
    }
}
