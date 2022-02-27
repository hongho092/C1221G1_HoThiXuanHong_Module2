package oop_review.car;

public class Vehicle {
    private double xyLanh;
    private double valueCar;
    public static int count = 0;
    private double tax;

    public Vehicle(double xyLanh, double valueCar) {
        this.xyLanh = xyLanh;
        this.valueCar = valueCar;
        count++;
    }

    public Vehicle() {
        count++;
    }

    public double getXyLanh() {
        return xyLanh;
    }

    public void setXyLanh(double xyLanh) {
        this.xyLanh = xyLanh;
    }

    public double getValueCar() {
        return valueCar;
    }

    public void setValueCar(double valueCar) {
        this.valueCar = valueCar;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "xyLanh=" + xyLanh +
                ", valueCar=" + valueCar +
                '}';
    }

    public double getTax() {
        if(xyLanh > 200) {
            return tax = valueCar * 0.05;
        } else if(xyLanh > 100) {
            return tax = valueCar * 0.03;
        } else
            return tax = valueCar * 0.01;
    }
}
