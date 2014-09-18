/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package us.justg.gus.shape;

/**
 *
 * @author hfs5022
 */
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

    public double getRadius() {
        return radius;
    }
    
}
