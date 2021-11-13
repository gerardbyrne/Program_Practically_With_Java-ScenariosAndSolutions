package labnine.exercisesix;

import java.util.Scanner;

public class USStatesMethods
{
    static Scanner myScanner = new Scanner(System.in);

    static String nameOfState, capitalOfState;
    static int sizeOfPopulation, howManyEntries, numberOfEntriesMade, arrayPositionCounter;
    static double sizeOfPopulationInMillions, million = 1000000;

    public static void main(String[] args)
    {
        acceptNumberOfEntries();

        String[] stateDetails = new String[3 * howManyEntries];
        do
        {
            // Consume the additional characters
            myScanner.nextLine();

            acceptUSStateName();

            acceptUSStateCapitalName();

            acceptUSStatePopulation();

            sizeOfPopulationInMillions = sizeOfPopulation / million;

            displayStateDetailsMessage();

            addItemsToArray(stateDetails);

            arrayPositionCounter +=3;
            numberOfEntriesMade++;
    } while( numberOfEntriesMade < howManyEntries); // End of do while iteration

        // Print the state details
        displayStateDetailsFromArray(stateDetails);

    } // End of main() method

    public static void acceptNumberOfEntries()
    {
        System.out.println("How many states will be entered?");
        howManyEntries = myScanner.nextInt();
    }  // End of acceptNumberOfEntries() method

    public static void acceptUSStateName()
    {
        System.out.println("What is the name of the US State?");
        nameOfState = myScanner.nextLine();
    } // End of acceptUSStateName() method

    public static void acceptUSStateCapitalName()
    {
        System.out.println("What is the capital of " + nameOfState);
        capitalOfState = myScanner.nextLine();
    } // End of acceptUSStateCapitalName() method

    public static void acceptUSStatePopulation()
    {
        System.out.println("What is the estimated population " + nameOfState);
        sizeOfPopulation = myScanner.nextInt();
    } // End of acceptUSStatePopulation() method

    public static void displayStateDetailsMessage()
    {
        if (sizeOfPopulationInMillions < 1)
        {
            System.out.printf("The state of %s whose capital is %s has an estimated population of %d (less than one million)%n" , nameOfState, capitalOfState, sizeOfPopulation);
        }
        else
        {
            System.out.printf("The state of %s whose capital is %s has an estimated population of %d (%.5f million)%n" , nameOfState, capitalOfState, sizeOfPopulation, sizeOfPopulationInMillions);
        }
    } // End of displayStateDetailsMessage() method

    public static void addItemsToArray(String[] stateDetails)
    {
        // Add item details to the array and increment the counter by 3
        // to start the next state details at the correct array position
        stateDetails[arrayPositionCounter] = nameOfState;
        stateDetails[arrayPositionCounter+1] = capitalOfState;
        stateDetails[arrayPositionCounter+2] = String.valueOf(sizeOfPopulation);
    } // End of addItemsToArray() method

    public static void displayStateDetailsFromArray(String[] stateDetails)
    {
        System.out.println("The state details are");
        for(int arrayCounter = 0; arrayCounter< stateDetails.length; arrayCounter+=3)
        {
            System.out.printf("The state of %s whose capital is %s has an estimated population of %d%n" , stateDetails[arrayCounter], stateDetails[arrayCounter+1], Integer.parseInt(stateDetails[arrayCounter+2]));
        }
    } // End of displayStateDetailsFromArray() method

} // End of USStatesMethods class