package labnine.exerciseone;

import java.util.Scanner;

public class USStates
{
    static Scanner myScanner = new Scanner(System.in);

    static String nameOfState, capitalOfState;
    static int sizeOfPopulation;

    public static void main(String[] args)
    {
        System.out.println("What is the name of the US State?");
        nameOfState = myScanner.nextLine();

        System.out.println("What is the capital of " + nameOfState);
        capitalOfState = myScanner.nextLine();

        System.out.println("What is the estimated population " + nameOfState);
        sizeOfPopulation = myScanner.nextInt();

        System.out.printf("The state of %s whose capital is %s has an estimated population of %d" , nameOfState, capitalOfState, sizeOfPopulation);

    } // End of main() method
} // End of USStates class