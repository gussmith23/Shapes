package us.justg.gus.shape;

/**
 *
 * @author hfs5022
 */
public abstract class Shape {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Shape[] shapes = new Shape[6];
        
        shapes[0] = new Circle(2);
        shapes[1] = new Square(2);
        shapes[2] = new Triangle(1, 1, 1, Math.sqrt(3)/2);
        shapes[3] = new Sphere(2);
        shapes[4] = new Cube(2);
        shapes[5] = new Tetrahedron(2);
        
        for (Shape shape : shapes){
            
            System.out.printf("Area: %f\n", shape.getArea());
            
            if(shape instanceof TwoDimensionalShape){
                TwoDimensionalShape twoDimensionalShape = (TwoDimensionalShape) shape;
                System.out.printf("Perimeter: %f\n", twoDimensionalShape.getPerimeter());
            }else if(shape instanceof ThreeDimensionalShape){
                ThreeDimensionalShape threeDimensionalShape = (ThreeDimensionalShape) shape;
                System.out.printf("Perimeter: %f\n", threeDimensionalShape.getVolume());
            }
        }
        
        
    }
    
    public abstract double getArea();
}
