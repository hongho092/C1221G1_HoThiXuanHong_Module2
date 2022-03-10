package ss07_abstract_interface.bai_tap.interface_resizeable_colorable;

class ShapeTest {
    public static void main(String[] args) {
        Shape[] arrShape = new Shape[3];
        arrShape[0] = new Circle();
        arrShape[1] = new Rectangle();
        arrShape[2] = new Square();
        System.out.println("Trước khi thay đổi: ");
        for (Shape shape : arrShape) {
            System.out.println(shape);
        }

        System.out.println("---------------------------");

        System.out.println("Sau khi thay đổi: ");
        for (Shape shape : arrShape) {
            shape.resize(Math.random()*100);
            System.out.println(shape);
        }
        System.out.println("---------------------------");

        for (Shape shape : arrShape) {
            if (shape instanceof Square) {
                shape = (Square) shape;
                ((Square) shape).howToColor();
            }
        }


////        sha1.resize(30);
//        sha1 = (Circle) sha1;
//        sha1.resize(30);
//        System.out.println(((Circle) sha1).getArea());
    }
}