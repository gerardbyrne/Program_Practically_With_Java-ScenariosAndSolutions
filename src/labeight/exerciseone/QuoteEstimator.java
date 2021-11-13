package labeight.exerciseone;

import java.util.Scanner;

public class QuoteEstimator
{
    static Scanner myScanner = new Scanner(System.in);
    static int vehicleAge, engineCC;
    static String customerName;

    public static void main(String[] args)
    {
        System.out.println("What is the name of the customer?");
        customerName = myScanner.nextLine();

        System.out.println("What is the age of the vehicle?");
        vehicleAge = myScanner.nextInt();

        System.out.println("What is the cubic capacity of the vehicle engine?");
        engineCC = myScanner.nextInt();


        System.out.printf("The vehicle to be insured is %d years old and has an engine size of %d cc. %n", vehicleAge, engineCC);

    } // End of main() method
} // End of QuoteEstimator class