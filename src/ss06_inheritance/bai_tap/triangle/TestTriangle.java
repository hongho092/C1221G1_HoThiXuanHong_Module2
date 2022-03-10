package ss06_inheritance.bai_tap.triangle;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle tri = new Triangle(6, 8, 10);
        System.out.println("Before change -> "+tri);
        tri.setFilled(false);
        tri.setColor("red");
        tri.setSide2(4.5);
        System.out.println("After changed -> "+tri);
////        System.out.println(" ");
//        Triangle tri1 = new Triangle(3, 4, 5);
////        tri = tri1;
//        System.out.println(tri1);
////        System.out.println(tri1.getArea());

    }
}
