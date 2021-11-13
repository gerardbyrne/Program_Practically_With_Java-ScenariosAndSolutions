package labfive.exerciseeight;

public class ClaimsArrayMethods
{
    double[] ClaimDetails = new double[6];
    double[][] ClaimDetails2D = new double[3][4];

    public void storeValuesInSingleDimensionalArray(int counter, double claimOneAmount, double claimTwoAmount)
    {
        // Add claim values to the array at the correct position
        ClaimDetails[counter * 2] = claimOneAmount;

        ClaimDetails[(counter * 2) + 1] = claimTwoAmount;
    } // End of storeValuesInSingleDimensionalArray() method

    public void displayValuesFromSingleDimensionalArray()
    {
        // Display the contents of the claims array
        for(double claimValue : ClaimDetails)
        {
            System.out.println("Claim value $" + claimValue);
        }// End of for each iteration
    } // End of displayValuesFromSingleDimensionalArray() method

    public void storeValuesInArrayOfArrays(int counter, double claimOneAmount, double claimTwoAmount, double totalOfClaims, double averageOfClaims)
    {
        // Add claim values and calculated values to the array of arrays at the correct position
        ClaimDetails2D[counter][0] = claimOneAmount;
        ClaimDetails2D[counter][1] = claimTwoAmount;
        ClaimDetails2D[counter][2] = totalOfClaims;
        ClaimDetails2D[counter][3] = averageOfClaims;
    } // End of storeValuesInArrayOfArrays() method

    public void displayValuesFromArrayOfArrays()
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

} // End of ClaimsArrayMethods class