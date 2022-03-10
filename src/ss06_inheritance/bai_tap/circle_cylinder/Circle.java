package ss06_inheritance.bai_tap.circle_cylinder;

public class Circle {
    protected double radius;
    protected String color;

    protected Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    protected Circle() {
        radius = 3.5;
        color = "yellow";
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
