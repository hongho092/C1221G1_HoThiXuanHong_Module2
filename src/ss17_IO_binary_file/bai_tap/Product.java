package ss17_IO_binary_file.bai_tap;

import java.io.Serializable;

public class Product implements Serializable {
    private int idProduct;
    private String nameProduct;
    private String nameBrand;
    private int priceProduct;

    public Product() {
    }

    public Product(int idProduct, String nameProduct, String nameBrand, int priceProduct) {
        this.idProduct = idProduct;
        this.nameProduct = nameProduct;
        this.nameBrand = nameBrand;
        this.priceProduct = priceProduct;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public int getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(int priceProduct) {
        this.priceProduct = priceProduct;
    }

    @Override
    public String toString() {
        return "Product -> {" +
                "idProduct=" + idProduct +
                ", nameProduct='" + nameProduct + '\'' +
                ", nameBrand='" + nameBrand + '\'' +
                ", priceProduct=" + priceProduct +
                '}';
    }
}
