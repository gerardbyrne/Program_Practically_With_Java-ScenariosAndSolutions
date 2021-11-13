package iteration;

import java.util.Scanner;

public class IterationClaimsDoWhile
{
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int numberOfClaimsBeingMade = 0, counter = 0;
        double claimValue = 0.00, totalOfClaimValues = 0.00 , averageOfClaimValues = 0.00;

        System.out.println("How many claims are being made?");
        numberOfClaimsBeingMade = myScanner.nextInt();

        do
        {
            System.out.println("What is the value of claim " + (counter +1 ) + "?");
            claimValue = myScanner.nextDouble();
            totalOfClaimValues= totalOfClaimValues + claimValue;
            counter++;
        } while(counter < numberOfClaimsBeingMade);// End of do while iteration

        averageOfClaimValues = totalOfClaimValues / numberOfClaimsBeingMade;
        System.out.printf("The total value of the claims is %.2f%n", totalOfClaimValues);
        System.out.printf("The average value of the claims is %.2f%n",averageOfClaimValues);
    } // End of main() method

} // End of IterationClaimsDoWhile class