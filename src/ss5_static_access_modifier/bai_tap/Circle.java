package ss5_static_access_modifier.bai_tap;

public class Circle {
    protected double radius = 1.0;
    public static String color = "red";

    Circle () {
    }
    Circle (double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea () {
        return Math.pow(radius, 2) * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
