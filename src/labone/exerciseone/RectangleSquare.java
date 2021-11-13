package labone.exerciseone;

import java.util.Scanner;

public class RectangleSquare
{
    static Scanner myScanner = new Scanner(System.in);
    static double length, breadth;

    public static void main(String[] args)
    {
        System.out.println("What is the length of the shape");
        length = myScanner.nextDouble();

        System.out.println("What is the breadth of the shape");
        breadth = myScanner.nextDouble();

        System.out.printf("The rectangle has a length of %.2f and a breadth of %.2f ", length, breadth);

    } // End of main() method
} // End of RectangleSquare class