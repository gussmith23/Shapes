package us.justg.gus.shape;

public class Circle extends TwoDimensionalShape {
    
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(getRadius(), 2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI*2*getRadius();
    }

    @Override
    public String toString() {
        return String.format("%s It is a sphere, with equal sides of length %f.", super.toString(), getRadius());
    }
    
    public double getRadius() {
        return radius;
    }
   
}
