package labsix.exercisefour;

import java.util.Scanner;

public class ClaimDataIteration
{
    static Scanner myScanner = new Scanner(System.in);
    static int  monthNumberOfClaims, totalNumberOfClaims;
    static double averageNumberOfClaims;

    public static void main(String[] args)
    {
        for(int counter = 0; counter < 12; counter ++)
        {
            System.out.println("How many claims were made this month?");
            monthNumberOfClaims = myScanner.nextInt();
            totalNumberOfClaims = totalNumberOfClaims + monthNumberOfClaims;
        }

        averageNumberOfClaims = (double)totalNumberOfClaims / 12;

        System.out.printf("The total number of claims is %d and the average number of claims is %.2f%n", totalNumberOfClaims, averageNumberOfClaims);

    } // End of main() method
} // End of ClaimDataIteration class