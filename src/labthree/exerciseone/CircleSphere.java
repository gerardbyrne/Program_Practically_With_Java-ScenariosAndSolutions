package labthree.exerciseone;

import java.util.Scanner;

public class CircleSphere
{
    static Scanner myScanner = new Scanner(System.in);
    static double radius;

    public static void main(String[] args)
    {
        System.out.println("What is the radius of the circle");
        radius = myScanner.nextDouble();

        System.out.printf("The circle has a radius of %.2f ", radius);

    } // End of main() method
} // End of CircleSphere class