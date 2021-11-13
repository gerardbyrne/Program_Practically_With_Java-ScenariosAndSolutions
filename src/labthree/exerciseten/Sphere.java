package labthree.exerciseten;

import java.io.Serializable;

public class Sphere implements Serializable
{
    public double radius;
    public double volume;
    public double surfaceArea;

    public Sphere(double radius, double volume, double surfaceArea)
    {
        this.radius = radius;
        this.volume = volume;
        this.surfaceArea = surfaceArea;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getVolume()
    {
        return volume;
    }

    public void setVolume(double volume)
    {
        this.volume = volume;
    }

    public double getSurfaceArea()
    {
        return surfaceArea;
    }

    public void setSurfaceArea(double surfaceArea)
    {
        this.surfaceArea = surfaceArea;
    }

    @Override
    public String toString()
    {
        return "Sphere{" +
            "radius=" + radius +
            ", volume=" + volume +
            ", surfaceArea=" + surfaceArea +
            '}';
    } // End of toString() method
} // End of sphere class
