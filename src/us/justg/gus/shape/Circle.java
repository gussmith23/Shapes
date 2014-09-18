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

    public double getRadius() {
        return radius;
    }
   
}
