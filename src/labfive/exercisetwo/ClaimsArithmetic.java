package labfive.exercisetwo;

import java.util.Scanner;

public class ClaimsArithmetic
{
    static Scanner myScanner = new Scanner(System.in);
    static double claimOneAmount, claimTwoAmount, totalOfClaims, averageOfClaims;

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

    } // End of main() method
} // End of ClaimsArithmetic class