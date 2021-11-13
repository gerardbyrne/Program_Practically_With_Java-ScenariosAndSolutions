package labeight.exercisesix;

import java.util.Scanner;

public class QuoteEstimatorMethods
{
    static Scanner myScanner = new Scanner(System.in);
    static int vehicleAge, engineCC, arrayPositionCounter;
    static double quoteAmount, ageValue, engineCCValue;
    static String customerName, moreEntries;
    static String[] quoteDetails = new String[8];

    public static void main(String[] args)
    {
        do
        {
            acceptItemDetails();

            // Calculate quote based on vehicle age and enginecc
            calculateQuoteEstimate();

            System.out.printf("The vehicle to be insured is %d years old and has an engine size of %d cc. %n", vehicleAge, engineCC);
            System.out.printf("The quote estimate is $%.2f %n", quoteAmount);

            addItemsToArray(arrayPositionCounter);

            // Check if the user has more items to enter
            askIfThereAreMoreEntries();

    } while( moreEntries.equalsIgnoreCase("y")); // End of do while iteration

        // Print the quote details
        displayQuoteDetails();
    } // End of main() method

    public static void acceptItemDetails()
    {
        System.out.println("What is the name of the customer?");
        customerName = myScanner.nextLine();

        System.out.println("What is the age of the vehicle?");
        vehicleAge = myScanner.nextInt();

        System.out.println("What is the cubic capacity of the vehicle engine?");
        engineCC = myScanner.nextInt();
    } // End of acceptItemDetails() method

    public static void calculateQuoteEstimate()
    {
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
    } // End of calculateQuoteEstimate class

    public static void addItemsToArray(int arrayPositionCounterPassedIn)
    {
        // Add item details to the array and increment the counter by 3
        // to start the next item details at the correct array position
        quoteDetails[arrayPositionCounterPassedIn] = customerName;
        quoteDetails[arrayPositionCounterPassedIn + 1] = String.valueOf(vehicleAge);
        quoteDetails[arrayPositionCounterPassedIn + 2] = String.valueOf(engineCC);
        quoteDetails[arrayPositionCounterPassedIn + 3] = String.valueOf(quoteAmount);
        arrayPositionCounter+=4;
    } // End of addItemsToArray() method

    public static void askIfThereAreMoreEntries()
    {
        System.out.println("Are there more items to enter (Y or N)?");
        moreEntries = myScanner.next();

        // Consume the additional characters
        myScanner.nextLine();
    } // End of askIfThereAreMoreEntries() method

    public static void displayQuoteDetails()
    {
        System.out.println("The invoice details are");
        for(int arrayCounter=0; arrayCounter<quoteDetails.length; arrayCounter+=4)
        {
            System.out.printf("The vehicle to be insured for customer %10s is %d years old and has an engine size of %d cc%n", quoteDetails[arrayCounter], Integer.parseInt(quoteDetails[arrayCounter+1]), Integer.parseInt(quoteDetails[arrayCounter+2]));
            System.out.printf("The quote estimate is $%.2f cc%n", Double.parseDouble(quoteDetails[arrayCounter+3]));
        }
    } // End of displayQuoteDetails() method

} // End of QuoteEstimatorMethods class