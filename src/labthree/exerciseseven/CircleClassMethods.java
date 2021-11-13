package labthree.exerciseseven;

import java.util.Scanner;

public class CircleClassMethods
{
    static Scanner myScanner = new Scanner(System.in);
    static double radius, area, circumference;
    static int arrayPosition = 0;
    static String shape;

    // Declare and create the array to hold the 3 elements of the circle
    static double circleProperties[] = new double[3];

/*******************************************************************
 Methods are reuseable blocks of code and in this example the methods
 are inside a Circle class and the methods all relate specifically
 to a circle.
 ******************************************************************/

    public String userShapeToBeUsed(int counter)
    {
        // Check if this is iteration one so we ask for the shape
        if(counter ==0)
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
        return shape;
    }  // End of getShapeToBeUsed() method

    public double userInputForRadiusOfShape()
    {
        // Ask the user for the radius of the shape
        System.out.println("What is the radius of your shape");
        radius = myScanner.nextDouble();
        return radius;
    } // End of userInputForRadiusOfShape() method

    public double calculateAreaOfCircle(double radius)
    {
        // Calculate the area of the circle
        area = 3.14 * radius * radius;
        return area;
    }

    public double calculateCircumferenceOfCircle(double radius)
    {
        // Calculate the circumference of the circle
        circumference = 3.14 * radius * 2;
        return circumference;
    }

    public void addCircleValuesToArray(double radius, double area, double circumference)
    {
        // Write the circle details to the CircleProperties array
        circleProperties[arrayPosition] = radius;
        circleProperties[arrayPosition + 1] = area;
        circleProperties[arrayPosition + 2] = circumference;
    }

    public void displayCircleDetails(double[] circlePropertiesPassedIn)
    {
        shape = "circle";
        // Use shape variable in the display
        System.out.println("**********************************************");
        System.out.println("Properties of the " + shape + " from the array");
        System.out.println("**********************************************");
        System.out.printf("The radius of the %s is %.2f%n", shape, circlePropertiesPassedIn[arrayPosition]);
        System.out.printf("The area of the %s is %.2f%n", shape, circlePropertiesPassedIn[arrayPosition +1]);
        System.out.printf("The circumference of the %s is %.2f%n", shape, circlePropertiesPassedIn[arrayPosition +2]);
    }

} // End of CircleClassMethods class