package labone.exercisefour;

import java.util.Scanner;

public class RectangleSquareIteration
{
    static Scanner myScanner = new Scanner(System.in);
    static double length, breadth, perimeter, area;

    public static void main(String[] args)
    {
        for (int counter = 0; counter < 2; counter++)
        {
            if(counter==0)
            {
                System.out.println("What is the length of the rectangle");
                length = myScanner.nextDouble();

                System.out.println("What is the breadth of the rectangle");
                breadth = myScanner.nextDouble();
            } // End of the if block
            else
            {
                System.out.println("What is the length of the square");
                length = myScanner.nextDouble();

                breadth = length;
            } // End of the else block

            // Calculate the area - same formula for rectangle and square
            area = length * breadth;

            // Make a selection based on the length and breadth
            if (length == breadth)
            {
                perimeter = 4 * length;
                System.out.printf("The square has an area of %.2f and a perimeter of %.2f%n ", area, perimeter);
            } // End of the if block
            else
            {
                perimeter = 2 * (length + breadth);
                System.out.printf("The rectangle has an area of %.2f and a perimeter of %.2f%n", area, perimeter);
            } // End of the else block
        } // End of for iteration
    } // End of main() method
} // End of RectangleSquareIteration class