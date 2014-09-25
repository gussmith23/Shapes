package us.justg.gus.shape;

public class Tetrahedron extends ThreeDimensionalShape {
    
    private double a;

    public Tetrahedron(double a) {
        this.a = a;
    }

    @Override
    public double getVolume() {
        return Math.pow(getA(), 3)/(6.0*Math.sqrt(2));
    }

    @Override
    public double getArea() {
        return Math.sqrt(3)*Math.pow(getA(), 2);
    }
    
    @Override
    public String toString() {
        return String.format("%s It is a tetrahedron, with equal sides of length %f.", super.toString(), getA());
    }

    public double getA() {
        return a;
    }
    
}
