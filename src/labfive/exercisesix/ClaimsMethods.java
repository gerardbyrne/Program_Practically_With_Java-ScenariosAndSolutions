package labfive.exercisesix;

import java.util.Scanner;

public class ClaimsMethods
{
    static Scanner myScanner = new Scanner(System.in);
    static double claimOneAmount, claimTwoAmount;
    static boolean claimsToBeInvestigated = false;

    static double[] ClaimDetails = new double[6];
    static double[][] ClaimDetails2D = new double[3][4];

    public static void main(String[] args)
    {
        for (int counter =0; counter < 3; counter++)
        {
            acceptClaimValues();

            double totalOfClaims= calculateTotalOfClaims(claimOneAmount, claimTwoAmount);

            double averageOfClaims = calculateAverageOfClaims(totalOfClaims);

            displayClaimDetails(claimOneAmount, claimTwoAmount, totalOfClaims, averageOfClaims);

            areClaimsToBeInvestigated(averageOfClaims);

            storeValuesInSingleDimensionalArray(counter, claimOneAmount, claimTwoAmount);

            storeValuesInArrayOfArrays(counter, claimOneAmount, claimTwoAmount, totalOfClaims, averageOfClaims);

        } // End of iteration loop

        displayValuesFromSingleDimensionalArray();

        displayValuesFromArrayOfArrays();

    } // End of main() method

    /******************************************************************
     *     THE CODE BELOW ARE THE METHODS USED IN THE APPLICATION     *
     * METHODS ARE CODED OUTSIDE THE MAIN METHOD BUT INSIDE THE CLASS *
     *****************************************************************/

    public static void acceptClaimValues()
    {
        System.out.println("What is the value of the first claim?");
        claimOneAmount = myScanner.nextDouble();

        System.out.println("What is the value of the second claim?");
        claimTwoAmount = myScanner.nextDouble();
    } // End of acceptClaimValues() method

    public static double calculateTotalOfClaims(double claimOneAmount, double claimTwoAmount)
    {
        return  claimOneAmount + claimTwoAmount;
    } // End of calculateAverageOfClaims() method

    public static double calculateAverageOfClaims(double totalOfClaims)
    {
        return  totalOfClaims / 2;
    } // End of calculateAverageOfClaims() method

    public static void displayClaimDetails(double claimOneAmount, double claimTwoAmount, double totalOfClaims, double averageOfClaims)
    {
        System.out.printf("The value of claim one is $%.2f and the value of claim " +
            "two is $%.2f %nwhich gives us a total claim value of $%.2f and an average " +
            "claim value of $%.2f %n", claimOneAmount, claimTwoAmount, totalOfClaims, averageOfClaims);
    } // End of displayClaimDetails() method

    public static void areClaimsToBeInvestigated(double averageOfClaims)
    {
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
    } // End of areClaimsToBeInvestigated() method

    public static void storeValuesInSingleDimensionalArray(int counter, double  claimOneAmount, double claimTwoAmount)
    {
        // Add claim values to the array at the correct position
        ClaimDetails[counter * 2] = claimOneAmount;

        ClaimDetails[(counter * 2) + 1] = claimTwoAmount;
    } // End of storeValuesInSingleDimensionalArray() method


    public static void displayValuesFromSingleDimensionalArray()
    {
        // Display the contents of the claims array
        for(double claimValue : ClaimDetails)
        {
            System.out.println("Claim value $" + claimValue);
        }// End of for each iteration
    } // End of displayValuesFromSingleDimensionalArray() method

    public static void storeValuesInArrayOfArrays(int counter, double claimOneAmount, double claimTwoAmount, double totalOfClaims, double averageOfClaims)
    {
        // Add claim values and calculated values to the array of arrays at the correct position
        ClaimDetails2D[counter][0] = claimOneAmount;
        ClaimDetails2D[counter][1] = claimTwoAmount;
        ClaimDetails2D[counter][2] = totalOfClaims;
        ClaimDetails2D[counter][3] = averageOfClaims;
    } // End of storeValuesInArrayOfArrays() method

    public static void displayValuesFromArrayOfArrays()
    {
        // Display the contents of the array of arrays
        for (int outerCounter = 0; outerCounter < ClaimDetails2D.length; outerCounter++)
        {
            for (int innerCounter = 0; innerCounter < ClaimDetails2D[outerCounter].length; innerCounter++)
            {
                System.out.print("Index [" + outerCounter + "][" + innerCounter + "]: ");
                System.out.println("$ " + ClaimDetails2D[outerCounter][innerCounter]);
            }
        }
    } // End of displayValuesFromArrayOfArrays() method

} // End of ClaimsMethods class