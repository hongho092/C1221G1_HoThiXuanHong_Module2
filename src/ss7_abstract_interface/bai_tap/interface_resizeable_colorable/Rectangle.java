package ss7_abstract_interface.bai_tap.interface_resizeable_colorable;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * this.height;
    }

    public double getPerimeter() {
        return 2 * (width + this.height);
    }

    @Override
    public String toString() {
        return "Hình chữ nhật với chiều rộng width= " + width + " và chiều dài height= " + height + ",là 1 lớp con của " +
                super.toString() + " có diện tích area= " + getArea() + " và chu vi P= " + getPerimeter();
    }

    @Override
    public void resize(double percent) {
        this.width = this.width + this.width * (percent / 100);
        this.height = this.height + this.height * (percent / 100);
    }
}

