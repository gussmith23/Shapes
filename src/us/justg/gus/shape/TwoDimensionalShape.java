package us.justg.gus.shape;

public abstract class TwoDimensionalShape extends Shape {
    
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return String.format("%s It is two dimensional.", super.toString()); 
    }
      
}
