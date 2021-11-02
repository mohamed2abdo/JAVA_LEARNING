package com.company;

import java.lang.Math;
public class Traingle extends GeometricObject
{
    protected double side1=1.0;
    protected double side2=1.0;
    protected double side3=1.0;
    public Traingle()
    {

    }
    public Traingle(double side1,double side2,double side3)
    {
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    public double getArea()
    {
        double S=(side1+side2+side3)/2;
        return Math.sqrt(S*(S-side1)*(S-side2)*(S-side3));
    }
    public double getPerimeter()
    {
        return side1+side2+side3;
    }
    public void tostring()
    {
        System.out.println("the first length = "+ side1);
        System.out.println("the second length = "+ side2);
        System.out.println("the third length =" + side3);
    }
}
