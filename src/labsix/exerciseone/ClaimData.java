package labsix.exerciseone;

import java.util.Scanner;

public class ClaimData
{
    static Scanner myScanner = new Scanner(System.in);
    static String monthOne, monthTwo;
    static int monthOneNumberOfClaims, monthTwoNumberOfClaims;

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

        System.out.printf("The number of claims in %s are %d and the number of claims in %s are %d", monthOne, monthOneNumberOfClaims, monthTwo, monthTwoNumberOfClaims);

    } // End of main() method
} // End of ClaimData class