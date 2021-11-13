package labthree.exercisetwo;

import java.util.Scanner;

public class CircleSphereArithmetic
{
    static Scanner myScanner = new Scanner(System.in);
    static double radius, area,  circumference;

    public static void main(String[] args)
    {
        System.out.println("What is the radius of the circle");
        radius = myScanner.nextDouble();

        System.out.printf("The circle has a radius of %.2f%n", radius);

        // Calculate the area of the circle
        area = 3.14 * radius * radius;

        // Calculate the circumference (perimeter) of the circle
        circumference = 3.14 * radius * 2;

        // Display the circle details
        System.out.printf("The circle has an area of %.2f and a circumference of %.2f ", area, circumference);

    } // End of main() method
} // End of CircleSphereArithmetic class