package us.justg.gus.shape;

public class Cube extends ThreeDimensionalShape {
    
    private double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double getVolume() {
        return Math.pow(getA(), 3);
    }

    @Override
    public double getArea() {
        return 6*Math.pow(getA(), 2);
    }

    @Override
    public String toString() {
        return String.format("%s It is a cube, with equal sides of length %f.", super.toString(), getA());
    }
    
    public double getA() {
        return a;
    }
    
}
