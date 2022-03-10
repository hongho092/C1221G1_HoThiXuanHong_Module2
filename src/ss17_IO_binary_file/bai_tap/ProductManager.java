package ss17_IO_binary_file.bai_tap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {
    Scanner sca = new Scanner(System.in);
    public List<Product> productList = new ArrayList<>();
    private static final String FILE_PRODUCT = "src/ss17_IO_binary_file/bai_tap/Product.txt";

    public static void writeToFile(List<Product> productList) {
        try {
            File file = new File(FILE_PRODUCT);
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
            objOut.writeObject(productList);
            objOut.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Product> readFromFile() {
        List<Product> productList = new ArrayList<>();
        try {
            File file = new File(FILE_PRODUCT);
            FileInputStream fileIn = new FileInputStream(file);
            ObjectInputStream objIn = new ObjectInputStream(fileIn);
            productList = (List<Product>) objIn.readObject();
            objIn.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return productList;
    }

    public void showProduct () {
        productList = readFromFile();
        for (Product products : productList) {
            System.out.println(products);
        }
    }

    public void addProduct () {
        Product product = new Product();
        System.out.println("Nhập id sản phẩm, tên sản phẩm, tên thương hiệu, giá sản phẩm: ");
        product.setIdProduct(Integer.parseInt(sca.nextLine()));
        product.setNameProduct(sca.nextLine());
        product.setNameBrand(sca.nextLine());
        product.setPriceProduct(Integer.parseInt(sca.nextLine()));
        productList.add(product);
        writeToFile(productList);
    }

    public void searchProduct () {
        System.out.print("Nhập tên sản phẩm cần tìm -> ");
        String name = sca.nextLine();
        List<Product> products = readFromFile();
        for (int i=0; i< products.size(); i++) {
            if (products.get(i).getNameProduct().contains(name)) {
                System.out.println("Sản phẩm cần tìm: "+products.get(i));
//                System.out.println("");
            }
        }
    }
}
