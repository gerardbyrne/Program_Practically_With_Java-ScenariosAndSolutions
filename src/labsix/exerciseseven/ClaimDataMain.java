package labsix.exerciseseven;

public class ClaimDataMain
{
    public static void main(String[] args)
    {
        // Instantiate the class
        ClaimDataMethods myClaimDataMethods = new ClaimDataMethods();

        myClaimDataMethods.acceptClaimDetails();

        myClaimDataMethods.calculateTotalNumberOfClaims(myClaimDataMethods.ClaimNumbers);

        myClaimDataMethods.calculateAverageOfClaims();

        myClaimDataMethods.calculateMonthlyVariances();

        myClaimDataMethods.displayClaimDetails();

        myClaimDataMethods.calculateTotalNumberOfClaimsFromArrayOfArrays(myClaimDataMethods.claimData2DArray);

        myClaimDataMethods.calculateAverageOfClaimsFromArrayOfArrays();

        myClaimDataMethods.calculateMonthlyVariancesFromArrayOfArrays();

        myClaimDataMethods.displayClaimDetailsFromArrayOfArrays();

        myClaimDataMethods.calculateMaximumNumberOfClaimsFromArrayOfArrays();

        myClaimDataMethods.calculateMinimumNumberOfClaimsFromArrayOfArrays();

        myClaimDataMethods.displayGraphOfClaimsNumbers();

    } // End of main() method

} // End of ClaimDataMain class