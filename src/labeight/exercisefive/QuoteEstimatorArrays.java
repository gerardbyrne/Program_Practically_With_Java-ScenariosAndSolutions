package labeight.exercisefive;

import java.util.Scanner;

public class QuoteEstimatorArrays
{
    static Scanner myScanner = new Scanner(System.in);
    static int vehicleAge, engineCC;
    static double quoteAmount, ageValue, engineCCValue;
    static String customerName, moreEntries;
    static String[] quoteDetails = new String[8];

    public static void main(String[] args)
    {
        int arrayPositionCounter= 0;
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

        System.out.printf("The vehicle to be insured is %d years old and has an engine size of %d cc. %n", vehicleAge, engineCC);
        System.out.printf("The quote estimate is $%.2f %n", quoteAmount);

            // Add item details to the array and increment the counter by 4
            // to start the next item details at the correct array position
            quoteDetails[arrayPositionCounter] = customerName;
            quoteDetails[arrayPositionCounter + 1] = String.valueOf(vehicleAge);
            quoteDetails[arrayPositionCounter + 2] = String.valueOf(engineCC);
            quoteDetails[arrayPositionCounter + 3] = String.valueOf(quoteAmount);
            arrayPositionCounter+=4;

        // Check if the user has more items to enter
        System.out.println("Are there more items to enter (Y or N)?");
        moreEntries = myScanner.next();

        // Consume the additional characters
        myScanner.nextLine();

    } while( moreEntries.equalsIgnoreCase("y")); // End of do while iteration

        // Print the quote details
        System.out.println("The invoice details are");
        for(int arrayCounter=0; arrayCounter<quoteDetails.length; arrayCounter+=4)
        {
            System.out.printf("The vehicle to be insured for customer %10s is %d years old and has an engine size of %d cc%n", quoteDetails[arrayCounter], Integer.parseInt(quoteDetails[arrayCounter+1]), Integer.parseInt(quoteDetails[arrayCounter+2]));
            System.out.printf("The quote estimate is $%.2f cc%n", Double.parseDouble(quoteDetails[arrayCounter+3]));
        }
    } // End of main() method
} // End of QuoteEstimatorArrays class