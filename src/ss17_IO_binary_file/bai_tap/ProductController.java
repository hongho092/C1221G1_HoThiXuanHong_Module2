package ss17_IO_binary_file.bai_tap;

import java.util.Scanner;

public class ProductController {
    static ProductManager productManager = new ProductManager();
    static Scanner sca = new Scanner(System.in);
    public static void showMenu() {
        boolean out = false;
        while (!out) {
            System.out.print("Menu: \n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Hiển thị sản phẩm\n" +
                    "3. Tìm kiếm sản phẩm\n" +
                    "4. Thoát menu\n" +
                    "Chọn chức năng -> ");
            int choice = Integer.parseInt(sca.nextLine());
            switch (choice) {
                case 1:
                    productManager.addProduct();
                    out = false;
                    break;
                case 2:
                    productManager.showProduct();
                    out = false;
                    break;
                case 3:
                    productManager.searchProduct();
                    out = false;
                    break;
                default:
                    System.out.println("Chương trình hoàn thành.");
                    out = true;
            }
        }
    }

    public static void main(String[] args) {
        showMenu();
    }
}
