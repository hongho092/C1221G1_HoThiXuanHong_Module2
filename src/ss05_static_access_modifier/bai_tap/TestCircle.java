package ss05_static_access_modifier.bai_tap;

public class TestCircle {
    public static void main(String[] args) {
        Circle cir1 = new Circle(4.5);
        System.out.println("Ban kinh hinh tron 1 la = "+cir1.getRadius());
        System.out.println("Dien tich hinh tron 1 la = "+cir1.getArea());
        System.out.println(cir1.toString() );
        Circle cir2 = new Circle();
        cir2.radius = 5.5;
        System.out.println("Ban kinh hinh tron 2 la = "+cir2.getRadius());
        System.out.println("Dien tich hinh tron 2 la = "+cir2.getArea());
        Circle.color = "yellow";
        System.out.println(cir2.toString());



    }
}
