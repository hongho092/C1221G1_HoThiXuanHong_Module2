package ss12_java_collection_framework.bai_tap;

import java.util.ArrayList;

public class ProductManager {
    private static ArrayList<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1, "Fan", 100));
        products.add(new Product(2, "Air conditioner", 1000));
        products.add(new Product(3, "Fridge", 100000));
        products.add(new Product(4, "Washing machine", 10000));
    }

    public void addProduct() {

    }

    public void editProduct() {

    }

    public void deleteProduct() {

    }

    public void showListProduct() {
        for (Product product : products) {
            System.out.println(product);
        }
    }

    public void searchProduct() {

    }



}
