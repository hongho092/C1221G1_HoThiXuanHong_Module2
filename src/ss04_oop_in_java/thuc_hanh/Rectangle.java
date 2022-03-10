package ss04_oop_in_java.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    double width, height;
//    public Rectangle () {
//    }
    public Rectangle (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.width * this.height;
    }
    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }
    public String display() {
        return "Rectangle{" + "width=" + width+ ", height=" + height + "}";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = Integer.parseInt(scan.nextLine());
        System.out.println("Enter height: ");
        double height = Integer.parseInt(scan.nextLine());
        Rectangle rec = new Rectangle(width, height);
        System.out.println("Your rectangle: " + rec.display());
        System.out.println("Area: " + rec.getArea());
        System.out.println("Perimeter: " + rec.getPerimeter());
    }
}
