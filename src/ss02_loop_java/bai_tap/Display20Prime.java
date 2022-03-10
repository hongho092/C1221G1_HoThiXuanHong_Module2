package ss02_loop_java.bai_tap;

import java.util.Scanner;

public class Display20Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so luong nguyen to can in: ");
        int number = Integer.parseInt(scanner.nextLine());
        int dem = 0;
        int num = 2;
        boolean check;
        if (number <= 20){
            while (dem < number){
                check = true;
                for (int i = 2; i <= Math.sqrt(num);i++){
                    if (num % i == 0){
                        check = false;
                        break;
                    }
                }
                if (check){
                    System.out.println(num);
                    dem++;
                }
                num++;
            }
        }else {
            System.out.print("Quá giới hạn cho phép.");
        }
    }
}
