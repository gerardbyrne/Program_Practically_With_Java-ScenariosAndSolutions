package arrays;

public class ClaimStatistics
{
    public static void main(String[] args)
    {
        // Declare the array and the required variables
        double[] claimValues = {900, 900, 800, 580, 920, 700};
        double sumOfTheClaims = 0;
        double averageOfTheClaims = 0.00;

        // Calculate the total of the claims
        for (int counter = 0; counter < claimValues.length;  counter++) {
            sumOfTheClaims += claimValues[counter];
        } // End of for iteration construct


//        for(double claimValue:claimValues)
//        {
//            sumOfTheClaims += claimValue;
//        } // End of foreach iteration construct


        // Calculate the average of the claims
        averageOfTheClaims = sumOfTheClaims / claimValues.length;

        // Display the results
        System.out.printf("The total of the claims is: $%.2f%n", sumOfTheClaims);
        System.out.printf("The average claim value is: $%.2f%n", averageOfTheClaims);
    } // End of main() method

} // End of ClaimStatistics class
