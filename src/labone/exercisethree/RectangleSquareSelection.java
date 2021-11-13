package labone.exercisethree;

import java.util.Scanner;

public class RectangleSquareSelection
{
    static Scanner myScanner = new Scanner(System.in);
    static double length, breadth, perimeter, area;

    public static void main(String[] args)
    {
        System.out.println("What is the length of the shape");
        length = myScanner.nextDouble();

        System.out.println("What is the breadth of the shape");
        breadth = myScanner.nextDouble();

        // Calculate the area - same formula for rectangle and square
        area = length * breadth;

        // Make a selection based on the length and breadth
        if(length == breadth)
        {
            perimeter = 4 * length;
            System.out.printf("The square has an area of %.2f and a perimeter of %.2f ", area, perimeter);
        }
        else
        {
            perimeter = 2 * (length + breadth);
            System.out.printf("The rectangle has an area of %.2f and a perimeter of %.2f ", area, perimeter);
        }
    } // End of main() method
} // End of RectangleSquareSelection class