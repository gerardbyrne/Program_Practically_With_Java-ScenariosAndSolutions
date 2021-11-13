package labthree.exercisefive;

import java.util.Scanner;

public class CircleSphereArrays
{
    static Scanner myScanner = new Scanner(System.in);
    static double radius, area, circumference, surfaceArea, volume;
    static int arrayPosition = 0;
    static String shape;

    // Declare and create the two arrays to hold the 3 elements of each shape
    static double circleProperties[] = new double[3];
    static double sphereProperties[] = new double[3];

    public static void main(String[] args)
    {
        // Iterate to allow for 2 sets of values
        for (int counter = 0; counter < 2; counter++)
        {
            // Check if this is iteration one so we ask for the shape
            if(counter==0)
            {
                // Ask the user what there shape is
                System.out.println("Are you working with a circle or sphere?");
                System.out.println("Type C or c for circle");
                System.out.println("Type S or s for sphere");
                shape = myScanner.next();
            } // End of outer if section
            /* As this is not the first iteration we know what shape the user
               picked the first time so we now need to set the shape to the second
               option i.e. either a c (Circle) or s (Sphere)
             */
            else
            {
                if(shape.equalsIgnoreCase("c"))
                {
                    shape = "s";
                } // End of inner if section
                else
                {
                    shape = "c";
                } // End of inner else section
            } // End of outer else section

        // Ask the user for the radius of the shape
        System.out.println("What is the radius of your shape");
        radius = myScanner.nextDouble();

        // Select the shape based on the letter input by the user
        // If it is c for circle we perform the calculations for a circle
        if(shape.equalsIgnoreCase("c"))
        {
            // Calculate the area of the circle
            area = 3.14 * radius * radius;

            // Calculate the circumference of the circle
            circumference = 3.14 * radius * 2;

            // Write the circle details to the CircleProperties array
            circleProperties[arrayPosition] = radius;
            circleProperties[arrayPosition + 1] = area;
            circleProperties[arrayPosition + 2] = circumference;

            System.out.printf("The circle has an area of %.2f and a circumference of %.2f%n", area, circumference);
        }
        // If it is s for sphere we perform the calculations for a sphere
        else if (shape.equalsIgnoreCase("s"))
        {
            // Calculate the volume of the sphere
            volume = (4 * 3.14 * radius * radius * radius) / 3;

            // Calculate the surface of the sphere
            surfaceArea = 4 * 3.14 * radius * radius;

            // Write the sphere details to the SphereProperties array
            sphereProperties[arrayPosition] = radius;
            sphereProperties[arrayPosition + 1] = volume;
            sphereProperties[arrayPosition + 2] = surfaceArea;

            System.out.printf("The sphere has a volume of %.2f and a surface area of %.2f%n", volume, surfaceArea);
        }
        } // End of for iteration

        arrayPosition = 0;
        // Iteration for the display of the two sets of values
        for (int counter = 0; counter < 2; counter++)
        {
            // Reset shape on iteration one
            if(counter==0)
            {
                shape = "circle";
                // Use shape variable in the display
                System.out.println("**********************************************");
                System.out.println("Properties of the " + shape + " from the array");
                System.out.println("**********************************************");
                System.out.printf("The radius of the %s is %.2f%n", shape, circleProperties[arrayPosition]);
                System.out.printf("The area of the %s is %.2f%n", shape, circleProperties[arrayPosition +1]);
                System.out.printf("The circumference of the %s is %.2f%n", shape, circleProperties[arrayPosition +2]);
            } // End of if section
            else
            {
                // Set shape to sphere on iteration two
                shape = "sphere";
                // Use shape variable in the display
                System.out.println("**********************************************");
                System.out.println("Properties of the " + shape + " from the array");
                System.out.println("**********************************************");
                System.out.printf("The radius of the %s is %.2f%n", shape, sphereProperties[arrayPosition]);
                System.out.printf("The volume of the %s is %.2f%n", shape, sphereProperties[arrayPosition +1]);
                System.out.printf("The surface area of the %s is %.2f%n", shape, sphereProperties[arrayPosition +2]);
            } // End of else section
        } // End of for iteration
    } // End of main() method
} // End of CircleSphereArrays class