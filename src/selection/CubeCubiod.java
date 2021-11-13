package selection;

import java.util.Scanner;

public class CubeCubiod
{
    static Scanner myScanner = new Scanner(System.in);
    static double length, breadth, height, perimeter, volume;

    public static void main(String[] args)
    {
        System.out.println("What is the length of the shape");
        length = myScanner.nextDouble();

        System.out.println("What is the breadth of the shape");
        breadth = myScanner.nextDouble();

        System.out.println("What is the height of the shape");
        height = myScanner.nextDouble();

        // Calculate the volume - same formula for cube and cuboid
        volume = length * breadth * height;

        // Make a selection based on the length, breadth and height
        if(length == breadth && breadth == height)
        {
            perimeter = 12 * length;
            System.out.printf("The cube has a volume of %.2f and a perimeter of %.2f ", volume, perimeter);
        }
        else
        {
            perimeter = 4 * (length + breadth + height );
            System.out.printf("The rectangle has an area of %.2f and a perimeter of %.2f ", volume, perimeter);
        }
    } // End of main() method
} // End of CubeCubiod class