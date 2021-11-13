package labnine.exercisethree;

import java.util.Scanner;

public class USStatesSelection
{
    static Scanner myScanner = new Scanner(System.in);

    static String nameOfState, capitalOfState;
    static int sizeOfPopulation;
    static double sizeOfPopulationInMillions, million = 1000000;

    public static void main(String[] args)
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

    } // End of main() method
} // End of USStatesSelection class