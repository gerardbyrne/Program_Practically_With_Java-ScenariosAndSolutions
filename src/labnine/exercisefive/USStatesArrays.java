package labnine.exercisefive;

import java.util.Scanner;

public class USStatesArrays
{
    static Scanner myScanner = new Scanner(System.in);

    static String nameOfState, capitalOfState;
    static int sizeOfPopulation, howManyEntries, numberOfEntriesMade, arrayPositionCounter;
    static double sizeOfPopulationInMillions, million = 1000000;

    public static void main(String[] args)
    {
        System.out.println("How many states will be entered?");
        howManyEntries = myScanner.nextInt();

        String[] stateDetails = new String[3 * howManyEntries];
        do
        {
        // Consume the additional characters
        myScanner.nextLine();

        System.out.println("What is the name of the US State?");
        nameOfState = myScanner.nextLine();

        System.out.println("What is the capital of " + nameOfState);
        capitalOfState = myScanner.nextLine();

        System.out.println("What is the estimated population " + nameOfState);
        sizeOfPopulation = myScanner.nextInt();

        sizeOfPopulationInMillions = sizeOfPopulation / million;

        if (sizeOfPopulationInMillions < 1)
        {
            System.out.printf("The state of %s whose capital is %s has an estimated population of %d (less than one million)%n" , nameOfState, capitalOfState, sizeOfPopulation);
        }
        else
        {
            System.out.printf("The state of %s whose capital is %s has an estimated population of %d (%.5f million)%n" , nameOfState, capitalOfState, sizeOfPopulation, sizeOfPopulationInMillions);
        }

        // Add item details to the array and increment the counter by 3
        // to start the next state details at the correct array position
        stateDetails[arrayPositionCounter] = nameOfState;
        stateDetails[arrayPositionCounter+1] = capitalOfState;
        stateDetails[arrayPositionCounter+2] = String.valueOf(sizeOfPopulation);

        arrayPositionCounter +=3;
        numberOfEntriesMade++;
    } while( numberOfEntriesMade < howManyEntries); // End of do while iteration

        // Print the state details
        System.out.println("The state details are");
        for(int arrayCounter=0; arrayCounter<stateDetails.length; arrayCounter+=3)
        {
            System.out.printf("The state of %s whose capital is %s has an estimated population of %d%n" , stateDetails[arrayCounter], stateDetails[arrayCounter+1], Integer.parseInt(stateDetails[arrayCounter+2]));
        }

    } // End of main() method
} // End of USStatesArrays class