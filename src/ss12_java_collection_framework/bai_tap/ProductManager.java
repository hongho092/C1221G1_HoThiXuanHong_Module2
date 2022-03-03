package ss12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    Scanner scanner = new Scanner(System.in);
    private static ArrayList<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1, "Fan", 100));
        products.add(new Product(2, "Air conditioner", 1000));
        products.add(new Product(3, "Fridge", 100000));
        products.add(new Product(4, "Washing machine", 10000));
    }


    public void addProduct() {
        System.out.print("Hãy nhập id của sản phẩm -> ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Hãy nhập tên sản phẩm -> ");
        String name = scanner.nextLine();
        System.out.print("Hãy nhập giá sản phẩm -> ");
        int price = Integer.parseInt(scanner.nextLine());
        products.add(new Product(id, name, price));
        showListProduct();
    }

    public void editProduct() {
        System.out.print("Nhập id sản phầm cần sửa -> ");
        int id = Integer.parseInt(scanner.nextLine());
        int k = 0;
        boolean choice = true;
        for (int i=0; i< products.size(); i++) {
            if (products.get(i).getId() == id) {
                k = i;
                choice = true;
                break;
            } else if (products.get(i).getId() != id) {
                choice = false;
            }
        }
        if (choice) {
            System.out.print("Sửa id sản phẩm -> ");
            products.get(k).setId(Integer.parseInt(scanner.nextLine()));
            System.out.print("Sửa tên sản phẩm -> ");
            products.get(k).setNameProduct(scanner.nextLine());
            System.out.print("Sửa giá sản phẩm -> ");
            products.get(k).setPrice(Integer.parseInt(scanner.nextLine()));
            showListProduct();
        } else System.out.println("Không có sản phẩm này.");
    }

    public void deleteProduct() {
        System.out.print("Nhập id sản phẩm cần xóa -> ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i=0; i< products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
            }
        }
        showListProduct();
    }

    public void showListProduct() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void searchProduct() {
        System.out.print("Nhập tên sản phẩm cần tìm -> ");
        String name = scanner.nextLine();
        boolean choice = true;
        int k = 0;
        for (int i=0; i< products.size(); i++) {
            if (products.get(i).getNameProduct().equals(name)) {
                k = i;
                choice = true;
                break;
            } else choice = false;
        }
        if (choice) {
            System.out.println(products.get(k).toString());
        } else System.out.println("Không có sản phẩm này");
    }

    public void sortProduct () {
        System.out.print("Chọn 1 -> giảm hoặc 2 -> tăng: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Sắp xếp giảm dần theo giá: ");
                SortesDcendingPrice dcendingPrice = new SortesDcendingPrice();
                Collections.sort(products, dcendingPrice);
                showListProduct();
                break;
            case 2:
                System.out.println("Sắp xếp tăng dần theo giá: ");
                SortUpAscendingPrice upAscendingPrice = new SortUpAscendingPrice();
                Collections.sort(products, upAscendingPrice);
                showListProduct();
                break;
            default:
                System.out.println("Không chọn gì hết.");
        }
    }
}
