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
public class Cube extends ThreeDimensionalShape {
    
    private double a;

    public Cube(double a) {
        this.a = a;
    }

    @Override
    public double getVolume() {
        return Math.pow(getA(), 3);
    }

    @Override
    public double getArea() {
        return 6*Math.pow(getA(), 2);
    }

    public double getA() {
        return a;
    }
    
}
