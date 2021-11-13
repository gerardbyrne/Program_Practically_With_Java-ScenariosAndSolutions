package labtwo.exercisefive;

import java.util.Scanner;

public class CubeCuboidArrays
{
    static Scanner myScanner = new Scanner(System.in);
    static int arrayPosition = 0;
    static double length, breadth, height, volume, perimeter;
    static String shape = "cuboid";
    static double ShapeProperties[] = new double[10];

    public static void main(String[] args)
    {
        // Iteration for the input of the two sets of values
        for (int counter = 0; counter < 2; counter++)
        {
            if(counter==0)
            {
                System.out.println("What is the length of the " + shape);
                length = myScanner.nextDouble();

                System.out.println("What is the breadth of the shape" + shape);
                breadth = myScanner.nextDouble();

                System.out.println("What is the height of the shape" + shape);
                height = myScanner.nextDouble();
            } // End of the if block
            else
            {
                // Set shape as a cube
                shape = "cube";
                System.out.println("What is the length of the shape");
                length = myScanner.nextDouble();

                height = breadth = length;
            } // End of the else block

        // Calculate the volume of the shape
        volume = length * breadth * height;

        // Calculate the perimeter of the shape
        perimeter = 4 * (length + breadth + height);

        // Make a selection based on the length and breadth
        // Display the shape details
        if(length == breadth && breadth == height)
        {
            perimeter = 12 * (length);
            System.out.printf("The cube has a volume of %.2f and a perimeter of %.2f%n", volume, perimeter);
        } // End of if
        else
        {
            perimeter = 4 * (length + breadth + height);
            System.out.printf("The cuboid has a volume of %.2f and a perimeter of %.2f%n", volume, perimeter);
        } // End of else block

            // Keeping all the writing to the array in one location
            if (counter== 1)
            {
                arrayPosition = 4;
            }
            ShapeProperties[arrayPosition] = length;
            ShapeProperties[arrayPosition + 1] = breadth;
            ShapeProperties[arrayPosition + 2] = height;
            ShapeProperties[arrayPosition + 3] = volume;
            ShapeProperties[arrayPosition + 4] = perimeter;
        } // End of for iteration

        arrayPosition = 0;
        // Iteration for the display of the two sets of values
        for (int counter = 0; counter < 2; counter++)
        {
            // Reset shape to cuboid on iteration one
            if(counter==0)
            {
                shape = "cuboid";
            }
            else
            {
                // Set shape to square on iteration two
                shape = "cube";
            }
            // Use shape variable in the display
            System.out.println("***************************************");
            System.out.println("      Properties of the " + shape);
            System.out.println("***************************************");
            System.out.println("The length of the " + shape + " is "  + ShapeProperties[arrayPosition]);
            System.out.println("The breadth of the " + shape + " is "  + ShapeProperties[arrayPosition +1]);
            System.out.println("The height of the " + shape + " is "  + ShapeProperties[arrayPosition +2]);
            System.out.println("The volume of the " + shape + " is "   + ShapeProperties[arrayPosition +3]);
            System.out.println("The perimeter of the  " + shape + " is " + ShapeProperties[arrayPosition +4]);
            arrayPosition = 5;
        } // End of for iteration
    } // End of main() method
} // End of CubeCuboidArrays class