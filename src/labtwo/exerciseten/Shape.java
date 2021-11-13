package labtwo.exerciseten;

import java.io.Serializable;

public class Shape implements Serializable
{
    // Declare the properties (variables) to be used in the class
    double length;
    double breadth;
    double height;
    double volume;
    double perimeter;

    public Shape(double length, double breadth, double height, double volume, double perimeter)
    {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
        this.volume = volume;
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

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public double getVolume()
    {
        return volume;
    }

    public void setVolume(double volume)
    {
        this.volume = volume;
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
            ", height=" + height +
            ", volume=" + volume +
            ", perimeter=" + perimeter +
            '}';
    } // End of the toString() class

} // End of the Shape class