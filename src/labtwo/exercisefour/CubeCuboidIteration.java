package labtwo.exercisefour;

import java.util.Scanner;

public class CubeCuboidIteration
{
    static Scanner myScanner = new Scanner(System.in);
    static double length, breadth, height, volume, perimeter;

    public static void main(String[] args)
    {
        for (int counter = 0; counter < 2; counter++)
        {
            if(counter==0)
            {
                System.out.println("What is the length of the shape");
                length = myScanner.nextDouble();

                System.out.println("What is the breadth of the shape");
                breadth = myScanner.nextDouble();

                System.out.println("What is the height of the shape");
                height = myScanner.nextDouble();
            } // End of the if block
            else
            {
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
            System.out.printf("The cube has a volume of %.2f and a perimeter of %.2f ", volume, perimeter);
        } // End of if
        else
        {
            perimeter = 4 * (length + breadth + height);
            System.out.printf("The cuboid has a volume of %.2f and a perimeter of %.2f%n", volume, perimeter);
        } // End of else block
        } // End of for iteration
    } // End of main() method
} // End of CubeCuboidIteration class