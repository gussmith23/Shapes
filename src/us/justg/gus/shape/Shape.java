/**
 * CMPSC 221
 * HW3 - 9/25/14
 * Gus Henry Smith
 * 
 * This homework is an object hierarchy of shapes. At the top is Shape, with
 * TwoDimensional and ThreeDimensionalShape below it. All three of these are
 * abstract. Below these are concrete classes representing actual shapes.
 * 
 */

package us.justg.gus.shape;

public abstract class Shape {

    public static void main(String[] args) {
        
        // Create and fill our shape array.
        Shape[] shapes = new Shape[6];
        shapes[0] = new Circle(2);
        shapes[1] = new Square(2);
        shapes[2] = new Triangle(1, 1, 1, Math.sqrt(3)/2);
        shapes[3] = new Sphere(2);
        shapes[4] = new Cube(2);
        shapes[5] = new Tetrahedron(2);
        
        // For all six shapes:
        for (Shape shape : shapes){
            
            // Polymorphism handles these calls, accessing the appropriate methods.
            System.out.printf("%s\n", shape.toString());
            System.out.printf("Area: %f\n", shape.getArea());
            
            // Using instanceof to find either perimiter or volume.
            if(shape instanceof TwoDimensionalShape){
                TwoDimensionalShape twoDimensionalShape = (TwoDimensionalShape) shape;
                System.out.printf("Perimeter: %f\n", twoDimensionalShape.getPerimeter());
            }else if(shape instanceof ThreeDimensionalShape){
                ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) shape;
                System.out.printf("Volume: %f\n", threeDimensionalShape.getVolume());
            }
            
            // Print a return after all that info.
            System.out.println();
        }
        
        
    }
    
    public abstract double getArea();

    @Override
    public String toString() {
        return "This is a shape.";
    }
    
    
    
}
