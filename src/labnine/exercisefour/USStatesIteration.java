package labnine.exercisefour;

import java.util.Scanner;

public class USStatesIteration
{
    static Scanner myScanner = new Scanner(System.in);

    static String nameOfState, capitalOfState, moreEntries;
    static int sizeOfPopulation;
    static double sizeOfPopulationInMillions, million = 1000000;

    public static void main(String[] args)
    {
        do
        {
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

        // Check if the user has more items to enter
        System.out.println("Are there more states to enter (Y or N)?");
        moreEntries = myScanner.next();

        // Consume the additional characters
        myScanner.nextLine();
    } while( moreEntries.equalsIgnoreCase("y")); // End of do while iteration

    } // End of main() method
} // End of USStatesIteration class