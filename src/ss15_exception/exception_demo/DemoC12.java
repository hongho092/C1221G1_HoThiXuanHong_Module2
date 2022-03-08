package ss15_exception;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class DemoC12 {
    public static void main(String[] args) {
        System.out.println("bắt đầu chương trình");
//        method1();
//        try {
//            readFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        do {
            flag=false;
            System.out.println("nhập tuổi");
            int age = Integer.parseInt(scanner.nextLine());
            try {
                checkAge(age);
            } catch (AgeException e) {
                System.out.println(e.getMessage());
                System.out.println("yêu cầu nhập lại");
                flag = true;
            }
        } while (flag);
        System.out.println("kết thúc chương trình");
    }

    public static void method1() {
        int[] arr = {10, 20, 30};
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao vị trí của mảng");
        int index = 0;
        try {
            index = Integer.parseInt(scanner.nextLine());
            System.out.println("giá trị phần tử thứ " + index + "là " + arr[index]);

        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.println(" lỗi do nhập số");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("lỗi do nhập pt ngoài mảng ");
        } catch (Exception e) {
            System.out.println(" lỗi");
            e.printStackTrace();

        } finally {
            System.out.println(" khối finally chạy");
        }

        System.out.println("vị trí của mảng vừa nhập là là" + index);
    }

    public static void readFile() throws IOException {
        FileReader fileReader = new FileReader("abc");
    }

    public static void checkAge(int age) throws AgeException {

        if (age < 0 || age > 100) {
            throw new AgeException("Tuổi không hợp lý");
        }

    }
}

