package labtwo.exercisetwo;

import java.util.Scanner;

public class CubeCuboidArithmetic
{
    static Scanner myScanner = new Scanner(System.in);
    static double length, breadth, height, volume, perimeter;

    public static void main(String[] args)
    {
        System.out.println("What is the length of the shape");
        length = myScanner.nextDouble();

        System.out.println("What is the breadth of the shape");
        breadth = myScanner.nextDouble();

        System.out.println("What is the height of the shape");
        height = myScanner.nextDouble();

        // Calculate the volume of the shape
        volume = length * breadth * height;

        // Calculate the perimeter of the shape
        perimeter = 4 * (length + breadth + height);

        // Display the shape details
        System.out.printf("The cuboid has a volume of %.2f and a perimeter of %.2f ", volume, perimeter);

    } // End of main() method
} // End of CubeCuboidArithmetic class