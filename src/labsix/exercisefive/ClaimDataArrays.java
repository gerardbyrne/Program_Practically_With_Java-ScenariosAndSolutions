package labsix.exercisefive;

import java.util.Scanner;

public class ClaimDataArrays
{
    static Scanner myScanner = new Scanner(System.in);
    static int totalNumberOfClaims;
    static double averageNumberOfClaims;
    static int ClaimNumbers[] = new int[12];
    static String ClaimMonth[] = {"January", "February", "March", "April", "May", "June",
                                  "July", "August", "September", "October", "November","December"};
    static String claimData2DArray[][] = new String[12][2];

    public static void main(String[] args)
    {
        for(int counter = 0; counter < 12; counter ++)
        {
            System.out.printf("How many claims were made in %s?", ClaimMonth[counter]);
            ClaimNumbers[counter] = myScanner.nextInt();
            claimData2DArray[counter][0] = ClaimMonth[counter];
            claimData2DArray[counter][1] = String.valueOf(ClaimNumbers[counter]);
        }

        // Iterate the array and accumulate the total
        for(int monthlyNumberOfClaims : ClaimNumbers)
        {
            totalNumberOfClaims = totalNumberOfClaims + monthlyNumberOfClaims;
        }

        // Calculate the average number of
        // claims per month
        averageNumberOfClaims = (double)totalNumberOfClaims / 12;

        // Iterate the array and calculate the monthly variance between the
        // actual number of claims and the average monthly claims
        for(int counter =0 ; counter < 12; counter++)
        {
            double monthlyVariance = ClaimNumbers[counter] - averageNumberOfClaims;
            System.out.printf("The number of claims in %10s are %5d which is %10.2f from the average.%n", ClaimMonth[counter], ClaimNumbers[counter], monthlyVariance );
        }

        // Display the contents of the array of arrays
        for (int outerCounter = 0; outerCounter < claimData2DArray.length; outerCounter++)
        {
            for (int innerCounter = 0; innerCounter < claimData2DArray[outerCounter].length; innerCounter++)
            {
                System.out.print("Index [" + outerCounter + "][" + innerCounter + "]: ");
                System.out.println(claimData2DArray[outerCounter][innerCounter]);
            }
        }
    } // End of main() method
} // End of ClaimDataArrays class