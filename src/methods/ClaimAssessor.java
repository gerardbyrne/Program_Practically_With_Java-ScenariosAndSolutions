package methods;

import java.util.Scanner;

public class ClaimAssessor
{
    static Scanner myScanner = new Scanner(System.in);
    static int numberOfClaimsBeingMade = 0;

    public static void main(String[] args)
    {
        askHowManyClaimsAreBeingMade();

        for(int counter = 0; counter <numberOfClaimsBeingMade; counter++)
        {
            askForTheClaimAmount();
        } // End of for iteration
    }// End of main() method


    public static int askHowManyClaimsAreBeingMade()
    {
        System.out.println("How many claims are being made?");
        numberOfClaimsBeingMade = myScanner.nextInt();
        return numberOfClaimsBeingMade;
    } // End of askHowManyClaimsAreBeingMade() method

    public static void askForTheClaimAmount()
    {
        System.out.println("What is the claim amount?");
        double claimAmount = myScanner.nextDouble();
        doesTheClaimNeedValidated(claimAmount);
    } // End of askForTheClaimAmount() method

    public static void doesTheClaimNeedValidated(double claimAmount)
    {
        boolean isValidationNeeded;
        if(claimAmount > 999)
        {
            isValidationNeeded = true;
        }
        else
        {
            isValidationNeeded = false;
        }
        if(isValidationNeeded)
        {
            validationLevel(claimAmount);
        }
        else
        {
            displayClaimDetermination(claimAmount);
        }
    } // End of doesTheClaimNeedValidated() method

    public static void validationLevel(double claimAmount)
    {
        String levelOfValidationRequired;
        if(claimAmount >= 5000)
        {
            levelOfValidationRequired = "high";
        }
        else if(claimAmount > 3000 && claimAmount <= 5000)
        {
            levelOfValidationRequired = "moderate";
        }
        else
        {
            levelOfValidationRequired = "low";
        }
        displayClaimDetermination(claimAmount, levelOfValidationRequired);
    } // End of validationLevel() method

    public static void displayClaimDetermination(double claimAmount)
    {
        System.out.printf("The claim amount is %.2f and the claim is being processed %n", claimAmount);
    } // End of displayClaimDetermination() method

    public static  void displayClaimDetermination(double claimAmount, String levelOfValidationRequired)
    {
        System.out.printf("The claim amount is %.2f with a validation level of %s and the claim is being validated prior to being processed %n", claimAmount, levelOfValidationRequired);
    } // End of overloaded displayClaimDetermination() method

} // End of ClaimAssessor class