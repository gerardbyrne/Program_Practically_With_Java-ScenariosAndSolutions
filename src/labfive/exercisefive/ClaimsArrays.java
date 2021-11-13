package labfive.exercisefive;

import java.util.Scanner;

public class ClaimsArrays
{
    static Scanner myScanner = new Scanner(System.in);
    static double claimOneAmount, claimTwoAmount, totalOfClaims, averageOfClaims;
    static boolean claimsToBeInvestigated = false;

    static double[] ClaimDetails = new double[6];
    static double[][] ClaimDetails2D = new double[3][4];

    public static void main(String[] args)
    {
        for (int counter =0; counter < 3; counter++)
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
            } else
            // Set the flag to false
            {
                claimsToBeInvestigated = false;
                System.out.println("This batch of claims does not need to be investigated.");
            }

            // Add claim values to the array at the correct position
            ClaimDetails[counter * 2] = claimOneAmount;

            ClaimDetails[(counter * 2) + 1] = claimTwoAmount;

            // Add claim values and calculated values to the array of arrays at the correct position
            ClaimDetails2D[counter][0] = claimOneAmount;
            ClaimDetails2D[counter][1] = claimTwoAmount;
            ClaimDetails2D[counter][2] = totalOfClaims;
            ClaimDetails2D[counter][3] = averageOfClaims;

        } // End of iteration loop

        // Display the contents of the claims array
        for(double claimValue : ClaimDetails)
        {
            System.out.println("Claim value $" + claimValue);
        }// End of for each iteration

        // Display the contents of the array of arrays
        for (int outerCounter = 0; outerCounter < ClaimDetails2D.length; outerCounter++)
        {
            for (int innerCounter = 0; innerCounter < ClaimDetails2D[outerCounter].length; innerCounter++)
            {
                System.out.print("Index [" + outerCounter + "][" + innerCounter + "]: ");
                System.out.println("$ " + ClaimDetails2D[outerCounter][innerCounter]);
            }
        }

    } // End of main() method
} // End of ClaimsArrays class