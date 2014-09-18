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

    public double getA() {
        return a;
    }
  
}
