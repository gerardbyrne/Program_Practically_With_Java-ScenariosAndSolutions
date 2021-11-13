package labfive.exerciseone;

import java.util.Scanner;

public class Claims
{
    static Scanner myScanner = new Scanner(System.in);
    static double claimOneAmount, claimTwoAmount;

    public static void main(String[] args)
    {
        System.out.println("What is the value of the first claim?");
        claimOneAmount = myScanner.nextDouble();

        System.out.println("What is the value of the second claim?");
        claimTwoAmount = myScanner.nextDouble();

        System.out.printf("The value of claim one is $%.2f and the value of claim two is $%.2f ", claimOneAmount, claimTwoAmount);

    } // End of main() method
} // End of Claims class