package arrays;

import java.util.Arrays;

public class ClaimData
{
    public static void main(String[] args)
    {
        // Declare an array of monthly claim numbers
        int[] monthlyClaimNumbers = {20000, 20000, 40000, 30000, 20000, 10000,
                                        10000, 12000, 6000, 2000, 5000, 5000};

        // Declare an array of monthly claim variances
        double[] monthlyVariances = new double[12];

        // Declare an array of the months of the year
        String[] monthNames = {"January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December"};

        int totalNumberOfClaims = 0;
        double averageNumberOfClaim = 0.00;

        /* Iterate the array and get the average number of claims,
          calculate the variance and write the variance to the monthlyVariances array
         */
        for (int counter = 0; counter < monthlyClaimNumbers.length;  counter++)
        {
            // Accumulate the total number of claims
            totalNumberOfClaims +=monthlyClaimNumbers[counter];
        } // End of selection construct Switch

        // Calculate the average number of claims
        averageNumberOfClaim = totalNumberOfClaims / monthlyClaimNumbers.length;

       /* Iterate the monthlyClaimNumbers array and get the variance between the
          monthly number of claims and the average number of claims using the formula
          monthly number of claims - average number of claims
        */
        for (int counter = 0; counter < monthlyClaimNumbers.length;  counter++)
        {
            // Calculate the monthly variance and write it to the array
            monthlyVariances[counter] = monthlyClaimNumbers[counter] - averageNumberOfClaim;
        } // End of the iteration

        // Display the month name and variance for the item
        for (int counter = 0; counter < monthlyVariances.length;  counter++)
        {
            System.out.printf("The variance for %15s was %10.2f%n", monthNames[counter], monthlyVariances[counter]);
        } // End of the iteration

        // Calculate the maximum number of claims and the minimum number of claims and display them
        Arrays.sort(monthlyClaimNumbers);
        System.out.printf("The maximum number of claims in any month was %10d%n", monthlyClaimNumbers[11]);

        System.out.printf("The minimum number of claims in any month was %10d%n", monthlyClaimNumbers[0]);

        // Display a * for every 100000 claims in a month
        for (int counter = 0; counter < monthlyClaimNumbers.length;  counter++)
        {
            int numberOfStars = monthlyClaimNumbers[counter] / 1000;
            System.out.printf( "%-10s", monthNames[counter]);

            for(int starcounter= 0; starcounter < numberOfStars; starcounter++ )
            {
                System.out.printf( "%s", "*");
            } // End of the inner iteration
            System.out.println("\n");
        } // End of the outer iteration
    } // End of main() method

} // End of ShoppingCart class
