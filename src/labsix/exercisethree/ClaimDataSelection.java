package labsix.exercisethree;

import java.util.Scanner;

public class ClaimDataSelection
{
    static Scanner myScanner = new Scanner(System.in);
    static String monthOne, monthTwo;
    static int monthOneNumberOfClaims, monthTwoNumberOfClaims, totalNumberOfClaims;
    static double averageNumberOfClaims, monthOneVariance, monthTwoVariance;

    public static void main(String[] args)
    {
        System.out.println("What month are the claims being entered for?");
        monthOne = myScanner.next();

        System.out.println("How many claims were made?");
        monthOneNumberOfClaims = myScanner.nextInt();

        System.out.println("What month are the claims being entered for?");
        monthTwo = myScanner.next();

        System.out.println("How many claims were made?");
        monthTwoNumberOfClaims = myScanner.nextInt();

        totalNumberOfClaims = monthOneNumberOfClaims + monthTwoNumberOfClaims;

        averageNumberOfClaims = (double)totalNumberOfClaims / 2;

        monthOneVariance = monthOneNumberOfClaims - averageNumberOfClaims;

        monthTwoVariance = monthTwoNumberOfClaims - averageNumberOfClaims;

        // Check month one variance and display appropriate message
        if(monthOneVariance > 0)
        {
            System.out.printf("The number of claims in %s are %d which is above the average of %.2f%n", monthOne, monthOneNumberOfClaims, averageNumberOfClaims);
        }
        else if(monthOneVariance < 0)
        {
            System.out.printf("The number of claims in %s are %d which is below the average of %.2f%n", monthOne, monthOneNumberOfClaims, averageNumberOfClaims);
        }
        else
        {
            System.out.printf("The number of claims in %s are %d which is the average of %.2f%n", monthOne, monthOneNumberOfClaims, averageNumberOfClaims);
        }

        // Check month two variance and display appropriate message
        if(monthTwoVariance > 0)
        {
            System.out.printf("The number of claims in %s are %d which is above the average of %.2f%n", monthTwo, monthTwoNumberOfClaims, averageNumberOfClaims);
        }
        else if(monthTwoVariance < 0)
        {
            System.out.printf("The number of claims in %s are %d which is below the average of %.2f%n", monthTwo, monthTwoNumberOfClaims, averageNumberOfClaims);
        }
        else
        {
            System.out.printf("The number of claims in %s are %d which is the average of %.2f%n", monthTwo, monthTwoNumberOfClaims, averageNumberOfClaims);
        }

    } // End of main() method
} // End of ClaimDataSelection class