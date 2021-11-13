package labeight.exercisethree;

import java.util.Scanner;

public class QuoteEstimatorSelection
{
    static Scanner myScanner = new Scanner(System.in);
    static int vehicleAge, engineCC;
    static double quoteAmount, ageValue, engineCCValue;
    static String customerName;

    public static void main(String[] args)
    {
        System.out.println("What is the name of the customer?");
        customerName = myScanner.nextLine();

        System.out.println("What is the age of the vehicle?");
        vehicleAge = myScanner.nextInt();

        System.out.println("What is the cubic capacity of the vehicle engine?");
        engineCC = myScanner.nextInt();

        // Calculate quote based on vehicle age and enginecc
        if (vehicleAge > 10)
        {
            ageValue = 200;
        }
        else
        {
            ageValue = 100;
        }
        if (engineCC > 2000)
        {
            engineCCValue = 300;
        }
        else
        {
            engineCCValue = 200;
        }
        quoteAmount = ageValue + engineCCValue;

        System.out.printf("The vehicle to be insured is %d years old and has an engine size of %d cc %n", vehicleAge, engineCC);
        System.out.printf("The quote estimate is $%.2f %n", quoteAmount);

    } // End of main() method
} // End of QuoteEstimatorSelection class