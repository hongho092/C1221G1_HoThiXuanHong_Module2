package ss2_loop_java.thuc_hanh;

import java.util.Scanner;

public class DrawMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        boolean flag = true;
        do {
            System.out.println("Menu: \n"+
                    "1. Draw the triangle\n"+
                    "2. Draw the square\n"+
                    "3. Draw the rectangle\n"+
                    "4. Exit\n"+
                    "Enter your number: ");
            int num = Integer.parseInt(scanner.nextLine());
            switch (num) {
                case 1:
                    System.out.println("******\n"+
                            "*****\n"+
                            "****\n"+
                            "***\n"+
                            "**\n"+
                            "*");
                    break;
                case 2:
                    System.out.println("*****\n"+
                            "*****\n"+
                            "*****\n"+
                            "*****\n"+
                            "*****");
                    break;
                case 3:
                    System.out.println("******\n"+
                            "******\n"+
                            "******");
                    break;
                default:
                    flag = false;
            }
        } while (flag);
    }
}
