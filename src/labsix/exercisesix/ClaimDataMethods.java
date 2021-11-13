package labsix.exercisesix;

import java.util.Scanner;

public class ClaimDataMethods
{
    static Scanner myScanner = new Scanner(System.in);
    static int totalNumberOfClaims, totalNumberOfClaimsFromArrayOfArrays;
    static double averageNumberOfClaims, averageNumberOfClaimsFromArrayOfArrays;
    static int ClaimNumbers[] = new int[12];
    static String ClaimMonth[] = {"January", "February", "March", "April", "May", "June",
                                  "July", "August", "September", "October", "November","December"};
    static String claimData2DArray[][] = new String[12][2];

    public static void main(String[] args)
    {
        acceptClaimDetails();

        calculateTotalNumberOfClaims(ClaimNumbers);

        calculateAverageOfClaims();

        calculateMonthlyVariances();

        displayClaimDetails();

        calculateTotalNumberOfClaimsFromArrayOfArrays(claimData2DArray);

        calculateAverageOfClaimsFromArrayOfArrays();

        calculateMonthlyVariancesFromArrayOfArrays();

        displayClaimDetailsFromArrayOfArrays();
    } // End of main() method


    public static void acceptClaimDetails()
    {
        for(int counter = 0; counter < 12; counter ++)
        {
            System.out.printf("How many claims were made in %s?", ClaimMonth[counter]);
            ClaimNumbers[counter] = myScanner.nextInt();
            claimData2DArray[counter][0] = ClaimMonth[counter];
            claimData2DArray[counter][1] = String.valueOf(ClaimNumbers[counter]);
        }
    }  // End of acceptClaimDetails() method

    public static void calculateTotalNumberOfClaims(int[] ClaimNumbers)
    {
        // Iterate the array and accumulate the total
        for(int monthlyNumberOfClaims : ClaimNumbers)
        {
            totalNumberOfClaims = totalNumberOfClaims + monthlyNumberOfClaims;
        }
    }// End of calculateTotalNumberOfClaims() method

    public static void calculateAverageOfClaims()
    {
        // Calculate the average number of
        // claims per month
        averageNumberOfClaims = (double)totalNumberOfClaims / ClaimNumbers.length;
    }// End of calculateAverageOfClaims() method

    public static void calculateMonthlyVariances()
    {
        // Iterate the array and calculate the monthly variance between the
        // actual number of claims and the average monthly claims
        for(int counter =0 ; counter < 12; counter++)
        {
            double monthlyVariance = ClaimNumbers[counter] - averageNumberOfClaims;
            System.out.printf("The number of claims in %10s are %5d which is %10.2f from the average.%n", ClaimMonth[counter], ClaimNumbers[counter], monthlyVariance );
        }
    }// End of calculateMonthlyVariances() method

    private static void displayClaimDetails()
    {
        // Display the contents of the single dimensional array
        for (int counter = 0; counter < 12; counter++)
        {
                System.out.print("Index [" + counter + "]: ");
                System.out.println(ClaimNumbers[counter]);
        }
    }// End of displayClaimDetails() method

    public static void calculateTotalNumberOfClaimsFromArrayOfArrays(String ClaimNumbers[][])
    {
        // Iterate the array and accumulate the total
        // Display the contents of the array of arrays
        for (int outerCounter = 0; outerCounter < 12; outerCounter++)
        {
            for (int innerCounter = 0; innerCounter < 2; innerCounter++)
            {
                totalNumberOfClaimsFromArrayOfArrays = totalNumberOfClaimsFromArrayOfArrays + Integer.parseInt(claimData2DArray[outerCounter][1]);
            }
        }
    }// End of calculateTotalNumberOfClaimsFromArrayOfArrays() method


    public static void calculateAverageOfClaimsFromArrayOfArrays()
    {
        // Calculate the average number of
        // claims per month
        averageNumberOfClaimsFromArrayOfArrays = (double)totalNumberOfClaimsFromArrayOfArrays / 12;
    }// End of calculateAverageOfClaimsFromArrayOfArrays() method

    public static void calculateMonthlyVariancesFromArrayOfArrays()
    {
        // Iterate the array and calculate the monthly variance between the
        // actual number of claims and the average monthly claims
        for(int counter =0 ; counter < 12; counter++)
        {
            double monthlyVarianceFromArrayOfArrays = Integer.parseInt(claimData2DArray[counter][1]) - averageNumberOfClaimsFromArrayOfArrays;
            System.out.printf("The number of claims in %10s are %5s which is %10.2f from the average.%n", claimData2DArray[counter][0],  claimData2DArray[counter][1], monthlyVarianceFromArrayOfArrays );
        }
    }// End of calculateMonthlyVariancesFromArrayOfArrays() method

    public static void displayClaimDetailsFromArrayOfArrays()
    {
        // Display the contents of the array of arrays
        for (int outerCounter = 0; outerCounter < 12; outerCounter++)
        {
            for (int innerCounter = 0; innerCounter < 2; innerCounter++)
            {
                System.out.print("Index [" + outerCounter + "][" + innerCounter + "]: ");
                System.out.println(claimData2DArray[outerCounter][innerCounter]);
            }
        }
    }// End of displayClaimDetailsFromArrayOfArrays() method

} // End of ClaimDataMethods class