package labnine.exercisetwo;

import java.util.Scanner;

public class USStatesArithmetic
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

        System.out.printf("The state of %s whose capital is %s has an estimated population of %d (%.5f million)" , nameOfState, capitalOfState, sizeOfPopulation, sizeOfPopulationInMillions);

    } // End of main() method
} // End of USStatesArithmetic class