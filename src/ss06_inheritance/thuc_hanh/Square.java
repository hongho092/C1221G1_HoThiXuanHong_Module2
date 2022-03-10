package ss06_inheritance.thuc_hanh;

public class Square extends Rectangle{

    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
        super.width = 1;
        super.height = 1;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        setWidth(side);
        setHeight(side);
    }

    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    @Override
    public void setHeight(double height) {
        setSide(height);
    }

    @Override
    public String toString() {
        return "A Square with: " +
                "side=" + getSide() + " ,"+
                super.toString();
    }
}
