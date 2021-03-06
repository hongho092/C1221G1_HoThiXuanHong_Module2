package ss06_inheritance.thuc_hanh;

public class Shape {
    protected String color;
    protected boolean filled;

    protected Shape() {
        color ="green";
        filled = true;
    }

    protected Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with{" +
                "color='" + getColor() + '\'' +
                (isFilled() ? "filled}" : "not filled}");
    }
}
