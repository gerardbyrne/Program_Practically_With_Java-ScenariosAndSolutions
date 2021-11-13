package labfive.exercisethree;

import java.util.Scanner;

public class ClaimsSelection
{
    static Scanner myScanner = new Scanner(System.in);
    static double claimOneAmount, claimTwoAmount, totalOfClaims, averageOfClaims;
    static boolean claimsToBeInvestigated = false;

    public static void main(String[] args)
    {
        System.out.println("What is the value of the first claim?");
        claimOneAmount = myScanner.nextDouble();

        System.out.println("What is the value of the second claim?");
        claimTwoAmount = myScanner.nextDouble();

        totalOfClaims = claimOneAmount + claimTwoAmount;

        averageOfClaims = totalOfClaims / 2;

        System.out.printf("The value of claim one is $%.2f and the value of claim " +
            "two is $%.2f %nwhich gives us a total claim value of $%.2f and an average " +
            "claim value of $%.2f %n", claimOneAmount, claimTwoAmount, totalOfClaims, averageOfClaims);

        // Set the flag to true
        if (averageOfClaims > 1000.00)
        {
            claimsToBeInvestigated = true;
            System.out.println("This batch of claims has to be investigated");
        }
        else
        // Set the flag to false
        {
            claimsToBeInvestigated = false;
            System.out.println("This batch of claims does not need to be investigated.");
        }
    } // End of main() method
} // End of ClaimsSelection class