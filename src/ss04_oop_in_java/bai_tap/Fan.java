package ss04_oop_in_java.bai_tap;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color ="blue";

    public Fan () {
    }
    public Fan (int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    @Override
    public String toString() {
       if (on) {
           return "Fan{" +
                   "speed=" + speed +
                   ", fan is on"+
                   ", radius=" + radius +
                   ", color='" + color + '\'' +
                   '}';
       } else
           return "Fan{" +
                   "speed=" + speed +
                   ", fan is off"+
                   ", radius=" + radius +
                   ", color='" + color + '\'' +
                   '}';
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.setSpeed(FAST);
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        System.out.println(fan1);
        Fan fan2 = new Fan(MEDIUM, false, 5, "blue");
        System.out.println(fan2);
    }
}


