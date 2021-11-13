package labeight.exercisetwo;

import java.util.Scanner;

public class QuoteEstimatorArithmetic
{
    static Scanner myScanner = new Scanner(System.in);
    static int vehicleAge, engineCC;
    static double quoteAmount;
    static String customerName;

    public static void main(String[] args)
    {
        System.out.println("What is the name of the customer?");
        customerName = myScanner.nextLine();

        System.out.println("What is the age of the vehicle?");
        vehicleAge = myScanner.nextInt();

        System.out.println("What is the cubic capacity of the vehicle engine?");
        engineCC = myScanner.nextInt();

        quoteAmount= vehicleAge + engineCC;

        System.out.printf("The vehicle to be insured is %d years old and has an engine size of %d cc %n", vehicleAge, engineCC);
        System.out.printf("The quote estimate is $%.2f %n", quoteAmount);

    } // End of main() method
} // End of QuoteEstimatorArithmetic class