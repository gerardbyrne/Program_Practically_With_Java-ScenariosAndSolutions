package labfive.exercisenine;

public class ClaimsClassMain
{
    static boolean claimsToBeInvestigated = false;

    public static void main(String[] args)
    {
        // Create instances of the three classes that have been created
        ClaimsCalculationMethods myClaimsCalculationMethods = new ClaimsCalculationMethods();
        ClaimsArrayMethods myClaimsArrayMethods = new ClaimsArrayMethods();
        ClaimsInputAndDisplayMethods myClaimsInputAndDisplayMethods  = new ClaimsInputAndDisplayMethods();
        FileHandlingClass myFileHandlingClass = new FileHandlingClass();

        for (int counter =0; counter < 3; counter++)
        {
            myClaimsInputAndDisplayMethods.acceptClaimValues();

            double totalOfClaims= myClaimsCalculationMethods.calculateTotalOfClaims(myClaimsInputAndDisplayMethods.claimOneAmount, myClaimsInputAndDisplayMethods.claimTwoAmount);

            double averageOfClaims = myClaimsCalculationMethods.calculateAverageOfClaims(totalOfClaims);

            myClaimsInputAndDisplayMethods.displayClaimDetails(myClaimsInputAndDisplayMethods.claimOneAmount, myClaimsInputAndDisplayMethods.claimTwoAmount, totalOfClaims, averageOfClaims);

            areClaimsToBeInvestigated(averageOfClaims);

            // Add the items to the single dimensional array
            myClaimsArrayMethods.storeValuesInSingleDimensionalArray(counter,  myClaimsInputAndDisplayMethods.claimOneAmount, myClaimsInputAndDisplayMethods.claimTwoAmount);

            // Add the items to the array of arrays
            myClaimsArrayMethods.storeValuesInArrayOfArrays(counter, myClaimsInputAndDisplayMethods.claimOneAmount, myClaimsInputAndDisplayMethods.claimTwoAmount, totalOfClaims, averageOfClaims);

        } // End of iteration loop

        myClaimsArrayMethods.displayValuesFromSingleDimensionalArray();

        myClaimsArrayMethods.displayValuesFromArrayOfArrays();

        //Add the item from the array to a text file
        myFileHandlingClass.writeClaimPropertiesToTextFile(myClaimsArrayMethods.ClaimDetails2D, "claimdetails.txt");

        //Read the text file
        myFileHandlingClass.readClaimPropertiesFromTextFile("claimdetails.txt");
    } // End of main() method

    /******************************************************************
     *     THE CODE BELOW ARE THE METHODS USED IN THE APPLICATION     *
     * METHODS ARE CODED OUTSIDE THE MAIN METHOD BUT INSIDE THE CLASS *
     *****************************************************************/

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

} // End of ClaimsClassMain class