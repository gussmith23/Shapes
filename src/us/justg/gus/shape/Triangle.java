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
