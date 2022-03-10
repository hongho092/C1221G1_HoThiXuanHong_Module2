package ss06_inheritance.thuc_hanh;

public class TestShape {
    public static void main(String[] args) {
//        Circle cir1 = new Circle();
////        Circle cir2 = new Circle("yellow", true, 5.6);
//        Circle cir3 = new Circle("red",false,6.7);
////        System.out.println(cir1.toString());
//        System.out.println(cir3.toString());

//        Square squ = new Square(2.3);
//        System.out.println(squ);

        Shape sha = new Rectangle("yellow", false, 34, 45);
        Rectangle rec = new Rectangle(12,34);
//        sha = rec;
//        System.out.println(sha);
        rec = (Rectangle) sha;
        System.out.println(rec);


    }
}
