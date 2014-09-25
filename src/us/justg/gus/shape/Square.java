package us.justg.gus.shape;

public class Square extends TwoDimensionalShape {
    
    private final double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getPerimeter() {
        return 4*getA();
    }

    @Override
    public double getArea() {
        return Math.pow(getA(), 2);
    }
    
    @Override
    public String toString() {
        return String.format("%s It is a square, with four equal sides of length %f.", super.toString(), getA());
    }
    
    public double getA() {
        return a;
    }
  
}
