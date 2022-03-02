package ss12_java_collection_framework.bai_tap;

import java.util.Scanner;

public class ProductTest {
    static ProductManager productManager = new ProductManager();

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        boolean out = false;
        while (!out) {
            System.out.print("Chọn chức năng:\n" +
                    "1. Thêm sản phẩm\n" +
                    "2. Sửa thông tin sản phẩm (theo id)\n" +
                    "3. Xóa sản phẩm (theo id)\n" +
                    "4. Hiển thị danh sách sản phẩm\n" +
                    "5. Tìm kiếm sản phẩm theo tên\n" +
                    "6. Sắp xếp sản phẩm tăng dần/ giảm dần\n" +
                    "7. Thoát\n" +
                    "Nhập yêu cầu của bạn: ");
            int choice = sca.nextInt();
            switch (choice) {
                case 1:
                    out = false;
                    break;
                case 2:
                    out = false;
                    break;
                case 3:
                    out = false;
                    break;
                case 4:
                    System.out.println("Danh sách sản phẩm: ");
                    productManager.showListProduct();
                    out = false;
                    break;
                case 5:
                    out = false;
                    break;
                case 6:
                    out = false;
                    break;
                default:
                    System.out.println("Đã hoàn thành.");
                    out = true;
            }
        }
    }
}
