package labsix.exercisetwo;

import java.util.Scanner;

public class ClaimDataArithmetic
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

        averageNumberOfClaims = totalNumberOfClaims / 2;

        monthOneVariance = monthOneNumberOfClaims - averageNumberOfClaims;

        monthTwoVariance = monthTwoNumberOfClaims - averageNumberOfClaims;

        System.out.printf("The number of claims in %s are %d which is %.2f from the average%n", monthOne, monthOneNumberOfClaims, monthOneVariance);

        System.out.printf("The number of claims in %s are %d which is %.2f from the average%n", monthTwo, monthTwoNumberOfClaims, monthTwoVariance);

    } // End of main() method
} // End of ClaimDataArithmetic class