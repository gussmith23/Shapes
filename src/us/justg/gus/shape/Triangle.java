package us.justg.gus.shape;

public class Triangle extends TwoDimensionalShape {
    
    private final double base;
    private final double height;
    private final double a,c;

    public Triangle(double a, double base, double c, double height) {
        this.base = base;
        this.height = height;
        this.a = a;
        this.c = c;
    }
    
    @Override
    public double getPerimeter() {
        return getA() + getBase() + getC();
    }

    @Override
    public double getArea() {
        return .5*getBase()*getHeight();
    }

    @Override
    public String toString() {
        return String.format("%s It is a triangle, with sides of length %f, %f, %f.", super.toString(), getA(), getBase(), getC());
    }
    
    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getA() {
        return a;
    }

    public double getC() {
        return c;
    }
    
}
