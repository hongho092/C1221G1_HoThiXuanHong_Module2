package ss07_abstract_interface.bai_tap.interface_resizeable_colorable;

public class Circle extends Shape{

    private double radius = 1.0;
    public Circle(){}

    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius,String color,boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public void resize(double percent) {
        this.radius = this.radius + this.radius * (percent/100);
    }

    @Override
    public String toString() {
        return "Hình tròn có bán kính radius= " + radius + ", là 1 lớp con của " + super.toString() + ",Area = " + getArea();
    }
}
