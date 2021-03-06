package ss12_java_collection_framework.bai_tap;

public class Product { // MVC - model
    protected int id;
    protected String nameProduct;
    protected int price;

    public Product() {
    }

    public Product(int id, String nameProduct, int price) {
        this.id = id;
        this.nameProduct = nameProduct;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product -> {" +
                "id= " + id +
                ", nameProduct= '" + nameProduct + '\'' +
                ", price= " + price +
                '}';
    }

}
