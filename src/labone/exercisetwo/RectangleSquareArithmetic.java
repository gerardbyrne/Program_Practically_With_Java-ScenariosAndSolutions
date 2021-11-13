package labone.exercisetwo;

import java.util.Scanner;

public class RectangleSquareArithmetic
{
    static Scanner myScanner = new Scanner(System.in);
    static double length, breadth, perimeter, area;

    public static void main(String[] args)
    {
        System.out.println("What is the length of the shape");
        length = myScanner.nextDouble();

        System.out.println("What is the breadth of the shape");
        breadth = myScanner.nextDouble();

        // Calculate the area of the shape
        area = length * breadth;

        // Calculate the perimeter of the shape
        perimeter = 4 * length;

        // Display the shape details
        System.out.printf("The rectangle has an area of %.2f and a perimeter of %.2f ", area, perimeter);

    } // End of main() method
} // End of RectangleSquareArithmetic class