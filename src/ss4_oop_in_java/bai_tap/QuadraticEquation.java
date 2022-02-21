package ss4_oop_in_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a ,b ,c, dis;

    public QuadraticEquation (double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        dis = Math.pow(b,2) - 4*a*c;
        return dis;
    }

    public String getNghiem() {
        if (dis > 0) {
            return "Nghiem 1: "+(-this.b+Math.sqrt(dis))/2*this.a+" va, Nghiem2: "+(this.b-Math.sqrt(dis))/2*this.a;
        } else if (dis == 0) {
            return "1 nghiem kep = " +(-this.c/this.b);
        } else return "Chuong trinh khong co nghiem";
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhap cac he so a, b, c: ");
        double a1 = Integer.parseInt(scan.nextLine());
        double b1 = Integer.parseInt(scan.nextLine());
        double c1 = scan.nextDouble();
        QuadraticEquation qua1 = new QuadraticEquation(a1, b1, c1);
//        System.out.println(qua1.getA());
        System.out.println(qua1.getDiscriminant());
        System.out.println(qua1.getNghiem());
    }
}
