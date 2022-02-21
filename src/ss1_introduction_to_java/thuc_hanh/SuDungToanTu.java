package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter height: ");
        int height = scanner.nextInt();
        System.out.println("Height is: " + height);
        System.out.println("Please enter width: ");
        int width = scanner.nextInt();
        System.out.println("Width is: " + width);
        int area = height * width;
        System.out.println("Area is: " + area);
    }
}
