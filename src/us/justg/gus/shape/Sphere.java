package us.justg.gus.shape;

public class Sphere extends ThreeDimensionalShape {
    
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return (4.0/3.0)*Math.PI*Math.pow(getRadius(), 3);
    }

    @Override
    public double getArea() {
        return 4.0*Math.PI*Math.pow(getRadius(), 2);
    }
    
    @Override
    public String toString() {
        return String.format("%s It is a sphere, with radius of length %f.", super.toString(), getRadius());
    }

    public double getRadius() {
        return radius;
    }
    
}
