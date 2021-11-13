package labsix.exercisenine;

public class ClaimDataMain
{
    public static void main(String[] args)
    {
        // Instantiate the class
        ClaimDataMethods myClaimDataMethods = new ClaimDataMethods();
        FileHandlingClass myFileHandlingClass = new FileHandlingClass();

        myClaimDataMethods.acceptClaimDetails();

        /*********************************************************
         ********** USING THE SINGLE DIMENSIONAL ARRAYS **********
         /********************************************************/

        /* Call the method that calculates the total of the claim numbers in the ClaimNumbers[] array */
        myClaimDataMethods.calculateTotalNumberOfClaims(myClaimDataMethods.ClaimNumbers);

        /* Call the method that calculates the average of the claim numbers in the ClaimNumbers[] array */
        myClaimDataMethods.calculateAverageOfClaims();

        /* Call the method that calculates the variances, the difference between each claim number
         and the average using the claim numbers */
        myClaimDataMethods.calculateMonthlyVariances();

        /* Call the method that displays the claim details, from the single dimensional array of claim numbers */
        myClaimDataMethods.displayClaimDetails();

        /* Call the method that writes the data input by the user to a text file
           The method is passed the single dimensional array of months of the year,
           the single dimensional array of claim numbers and the text file name
        */
        myFileHandlingClass.writeClaimPropertiesToTextFile(myClaimDataMethods.ClaimMonth, myClaimDataMethods.ClaimNumbers, "claimnumbersandmonths.txt");

        /* Call the method that reads the data from the text, the text file name is passed to the method */
        myFileHandlingClass.readClaimPropertiesFromTextFile("claimnumbersandmonths.txt");

        /*********************************************************
         ********** USING THE MULTI DIMENSIONAL ARRAYS ***********
         ************** THE MULTI DIMENSIONAL ARRAYS *************
         /********************************************************/
        /* Call the method that calculates the total of the claim numbers in the claimData2DArray[][] array */
        myClaimDataMethods.calculateTotalNumberOfClaimsFromArrayOfArrays(myClaimDataMethods.claimData2DArray);

        /* Call the method that calculates the average of the claim numbers in the claimData2DArray[][]array */
        myClaimDataMethods.calculateAverageOfClaimsFromArrayOfArrays();

        /* Call the method that calculates the variances, the difference between each claim number
         and the average using the claimData2DArray[][]array */
        myClaimDataMethods.calculateMonthlyVariancesFromArrayOfArrays();

        /* Call the method that displays the claim details, from the array of arrays */
        myClaimDataMethods.displayClaimDetailsFromArrayOfArrays();

        /* Call the method that calculates the maximum of the claim numbers in the claimData2DArray[][]array */
        myClaimDataMethods.calculateMaximumNumberOfClaimsFromArrayOfArrays();

        /* Call the method that calculates the minimum of the claim numbers in the claimData2DArray[][]array */
        myClaimDataMethods.calculateMinimumNumberOfClaimsFromArrayOfArrays();

        /* Call the method that creates a graph like representation of the claim numbers in the claimData2DArray[][]array */
        myClaimDataMethods.displayGraphOfClaimsNumbers();

        /* Call the method that writes the data input by the user to a text file
           The method is passed the array of arrays which holds both the month of
           the year and the corresponding claim number for each of the claim sets
           and the text file name */
        myFileHandlingClass.writeClaimPropertiesFromArrayOfArraysToTextFile(myClaimDataMethods.claimData2DArray, "claimnumbersandmonths2Darray.txt");

        /* Call the method that reads the data from the text, the text file name is passed to the method */
        myFileHandlingClass.readClaimPropertiesFromTextFile("claimnumbersandmonths2Darray.txt");
    } // End of main() method

} // End of ClaimDataMain class