package labnine.exerciseseven;

import java.util.Scanner;

public class USStatesMain
{
    static Scanner myScanner = new Scanner(System.in);

    static int sizeOfPopulation, numberOfEntriesMade, arrayPositionCounter;
    static double sizeOfPopulationInMillions, million = 1000000;

    public static void main(String[] args)
    {
        // Create an instance of the class
        USStatesMethods myUSStatesMethods = new USStatesMethods();

        myUSStatesMethods.acceptNumberOfEntries();

        String[] stateDetails = new String[3 * myUSStatesMethods.howManyEntries];

        do
        {
            myUSStatesMethods.acceptUSStateName();

            myUSStatesMethods.acceptUSStateCapitalName();

            myUSStatesMethods.acceptUSStatePopulation();

            sizeOfPopulationInMillions = sizeOfPopulation / million;

            myUSStatesMethods.displayStateDetailsMessage();

            myUSStatesMethods.addItemsToArray(stateDetails, arrayPositionCounter);

            arrayPositionCounter +=3;
            numberOfEntriesMade++;
    } while( numberOfEntriesMade < myUSStatesMethods.howManyEntries); // End of do while iteration

        // Print the state details
        myUSStatesMethods.displayStateDetailsFromArray(stateDetails);

    } // End of main() method

} // End of USStatesMain class