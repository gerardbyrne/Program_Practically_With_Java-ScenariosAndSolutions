package labone.exerciseten;

import java.io.Serializable;

public class Shape implements Serializable
{
    // Declare the properties (variables) to be used in the class
    double length;
    double breadth;
    double area;
    double perimeter;

    public Shape(double length, double breadth, double area, double perimeter)
    {
        this.length = length;
        this.breadth = breadth;
        this.area = area;
        this.perimeter = perimeter;
    } // End of the class constructor

    public double getLength()
    {
        return length;
    }

    public void setLength(double length)
    {
        this.length = length;
    }

    public double getBreadth()
    {
        return breadth;
    }

    public void setBreadth(double breadth)
    {
        this.breadth = breadth;
    }

    public double getArea()
    {
        return area;
    }

    public void setArea(double area)
    {
        this.area = area;
    }

    public double getPerimeter()
    {
        return perimeter;
    }

    public void setPerimeter(double perimeter)
    {
        this.perimeter = perimeter;
    }

    @Override
    public String toString()
    {
        return "Shape{" +
            "length=" + length +
            ", breadth=" + breadth +
            ", area=" + area +
            ", perimeter=" + perimeter +
            '}';
    } // End of the toString() class

} // End of the Shape class