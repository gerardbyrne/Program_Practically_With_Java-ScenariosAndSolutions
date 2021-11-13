package labtwo.exerciseone;

import java.util.Scanner;

public class CubeCuboid
{
    static Scanner myScanner = new Scanner(System.in);
    static double length, breadth, height;

    public static void main(String[] args)
    {
        System.out.println("What is the length of the shape");
        length = myScanner.nextDouble();

        System.out.println("What is the breadth of the shape");
        breadth = myScanner.nextDouble();

        System.out.println("What is the height of the shape");
        height = myScanner.nextDouble();

        System.out.printf("The cuboid has a length of %.2f, a breadth of %.2f and a height of %.2f ", length, breadth, height);

    } // End of main() method
} // End of CubeCuboid class