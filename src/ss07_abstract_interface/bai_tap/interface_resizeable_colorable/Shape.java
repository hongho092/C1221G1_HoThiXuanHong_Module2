package ss07_abstract_interface.bai_tap.interface_resizeable_colorable;

public abstract class Shape implements IResizeable {
    private String color = "Red";
    private boolean filled = true;

    public Shape(){}

    public Shape(String color,boolean filled){
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
        return " Shape có màu "
                + getColor()
                + " và "
                + (isFilled() ? "được tô" : "không được tô");
    }

    @Override
    public void resize(double percent) {
    }
}
