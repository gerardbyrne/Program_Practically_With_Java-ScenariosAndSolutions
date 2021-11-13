package labeight.exercisefour;

import java.util.Scanner;

public class QuoteEstimatorIteration
{
    static Scanner myScanner = new Scanner(System.in);
    static int vehicleAge, engineCC;
    static double quoteAmount, ageValue, engineCCValue;
    static String customerName, moreEntries;

    public static void main(String[] args)
    {
        do
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

        // Check if the user has more items to enter
        System.out.println("Are there more items to enter (Y or N)?");
        moreEntries = myScanner.next();

        // Consume the additional characters
        myScanner.nextLine();

    } while( moreEntries.equalsIgnoreCase("y")); // End of do while iteration
    } // End of main() method
} // End of QuoteEstimatorIteration class