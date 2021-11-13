package labthree.exerciseten;

import java.io.Serializable;

public class Circle implements Serializable
{
    public double radius;
    public double area;
    public double circumference;

    public Circle(double radius, double area, double circumference)
    {
        this.radius = radius;
        this.area = area;
        this.circumference = circumference;
    }// End of constructor

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return area;
    }

    public void setArea(double area)
    {
        this.area = area;
    }

    public double getCircumference()
    {
        return circumference;
    }

    public void setCircumference(double circumference)
    {
        this.circumference = circumference;
    }

    @Override
    public String toString()
    {
        return "Circle{" +
            "radius=" + radius +
            ", area=" + area +
            ", circumference=" + circumference +
            '}';
    } // End of toString() method
} // End of Circle class
