package ss06_inheritance.bai_tap.point2D_point3D;

public class Point3D extends Point2D{
    private float z =0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public float[] getXYZ() {
        float[] getXYZ = new float[3];
        getXYZ[0] = this.x;
        getXYZ[1] = this.y;
        getXYZ[2] = this.z;
        return getXYZ;
    }

    @Override
    public String toString() {
        return "Point3D with {x = "+getX()+", y = "+getY()+", z = "+getZ()+"}";
    }

}
