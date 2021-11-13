package labfive.exerciseeight;

import java.util.Scanner;

public class ClaimsInputAndDisplayMethods
{
    static Scanner myScanner = new Scanner(System.in);
    double claimOneAmount, claimTwoAmount;

    public void acceptClaimValues()
    {
        System.out.println("What is the value of the first claim?");
        claimOneAmount = myScanner.nextDouble();

        System.out.println("What is the value of the second claim?");
        claimTwoAmount = myScanner.nextDouble();
    } // End of acceptClaimValues() method

    public void displayClaimDetails(double claimOneAmount, double claimTwoAmount, double totalOfClaims, double averageOfClaims)
    {
        System.out.printf("The value of claim one is $%.2f and the value of claim " +
            "two is $%.2f %nwhich gives us a total claim value of $%.2f and an average " +
            "claim value of $%.2f %n", claimOneAmount, claimTwoAmount, totalOfClaims, averageOfClaims);
    } // End of displayClaimDetails() method

} // End of ClaimsInputAndDisplayMethods class