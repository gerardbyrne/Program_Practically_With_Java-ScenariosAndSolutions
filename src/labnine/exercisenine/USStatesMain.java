package labnine.exercisenine;

import java.util.Scanner;

public class USStatesMain
{
    static Scanner myScanner = new Scanner(System.in);

    static int sizeOfPopulation, numberOfEntriesMade, arrayPositionCounter;
    static double sizeOfPopulationInMillions, million = 1000000;

    static FileHandlingClass myFileHandlingClass = new FileHandlingClass();

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

        // Call the method that writes the array data to the text file
        myFileHandlingClass.writeStateDetailsToTextFile(stateDetails, "statedetailstextfile.txt");

        // Call the method that displays the array data from the text file
        myFileHandlingClass.readStateDetailsFromTextFile("statedetailstextfile.txt");

    } // End of main() method

} // End of USStatesMain class