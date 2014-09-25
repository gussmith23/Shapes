package us.justg.gus.shape;

public abstract class ThreeDimensionalShape extends Shape {
    
    public abstract double getVolume();
    
    @Override
    public String toString() {
        return String.format("%s It is three dimensional.", super.toString()); 
    }
    
}
