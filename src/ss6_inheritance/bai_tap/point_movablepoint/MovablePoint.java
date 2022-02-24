package ss6_inheritance.bai_tap.point_movablepoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float [] arrSpeed = new float[2];
        arrSpeed[0] = this.xSpeed;
        arrSpeed[1] = this.ySpeed;
        return arrSpeed;
    }

    @Override
    public String toString() {

        return "Point with {x = "+getX()+", y = "+getY()+
                "} and MovablePoint with {xSpeed = "+getxSpeed()+
                ", ySpeed = "+getySpeed()+"}";

    }
    public MovablePoint move() {
//        x += xSpeed;
//        y += ySpeed;
//        return super.getXY();
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }
}
