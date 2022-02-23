package ss6_inheritance.bai_tap.circle_cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return Math.pow(radius,2) * Math.PI * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}';
    }
}
