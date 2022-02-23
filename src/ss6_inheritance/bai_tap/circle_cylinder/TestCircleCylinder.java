package ss6_inheritance.bai_tap.circle_cylinder;

public class TestCircleCylinder {
    public static void main(String[] args) {
        Circle cir = new Circle();
        System.out.println(cir);
        Cylinder cyl = new Cylinder(4.5);
        System.out.println("Cylinder truoc khi thay doi -> "+cyl);
        System.out.println("Dien tich truoc khi thay doi"+cyl.getArea());
        cyl.setColor("red");
        cyl.setRadius(2.1);
        System.out.println("Cylinder sau khi thay doi -> "+cyl);
        System.out.println("Dien tich sau khi thay doi -> "+cyl.getArea());
    }
}
