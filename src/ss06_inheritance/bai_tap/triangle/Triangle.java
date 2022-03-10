package ss06_inheritance.bai_tap.triangle;

import ss06_inheritance.thuc_hanh.Shape;

public class Triangle extends Shape {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;

    protected Triangle() {
    }

    protected Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    protected double getPerimeter() {
        return side1 + side2 + side3;
    }

    protected double getArea() {
        double per = side1 + side2 + side3;
        double p = per / 2;
        return Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
    }

    @Override
    public String toString() {
        return "A Triangle with{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", color=" + color +
                (isFilled() ?", filled" :", not filled") +
                ", perimeter=" + getPerimeter() +
                ", area=" + getArea()+
                '}';
    }
}
