package labthree.exercisethree;

import java.util.Scanner;

public class CircleSphereSelection
{
    static Scanner myScanner = new Scanner(System.in);
    static double radius, area, circumference, surfaceArea, volume;
    static String shape;

    public static void main(String[] args)
    {
        // Ask the user what there shape is
        System.out.println("Are you working with a circle or sphere?");
        System.out.println("Type C or c for circle");
        System.out.println("Type S or s for sphere");
        shape = myScanner.next();

        // Ask the user for the radius of the shape
        System.out.println("What is the radius of your shape");
        radius = myScanner.nextDouble();

        // Select the shape based on the letter input by the user
        if(shape.equalsIgnoreCase("c"))
        {
            // Calculate the area of the circle
            area = 3.14 * radius * radius;

            // Calculate the circumference of the circle
            circumference = 3.14 * radius * 2;

            System.out.printf("The circle has an area of %.2f and a circumference of %.2f ", area, circumference);
        }
        else if (shape.equalsIgnoreCase("s"))
        {
            // Calculate the volume of the sphere
            volume = (4 * 3.14 * radius * radius * radius) / 3;

            // Calculate the surface of the sphere
            surfaceArea = 4 * 3.14 * radius * radius;

            System.out.printf("The sphere has a volume of %.2f and a surface area of %.2f ", volume, surfaceArea);
        }
    } // End of main() method
} // End of CircleSphereSelection class