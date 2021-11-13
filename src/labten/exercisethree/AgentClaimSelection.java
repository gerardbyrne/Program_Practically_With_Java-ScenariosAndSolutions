package labten.exercisethree;

import java.util.Scanner;

public class AgentClaimSelection
{
    static Scanner myScanner = new Scanner(System.in);
    static long claimId;
    static String agentId, policyId, claimDescription;
    static double claimAmount, claimAmountBeforeTax, taxAmount;
    static boolean completed;

    public static void main(String[] args)
    {
        System.out.println("What is the claim id?");
        claimId = myScanner.nextLong();

        myScanner.nextLine();

        System.out.println("What is the agent id?");
        agentId = myScanner.nextLine();

        System.out.println("What is the policy id");
        policyId = myScanner.nextLine();

        System.out.println("Describe the reason for the claim");
        claimDescription = myScanner.nextLine();

        System.out.println("What is the claim amount");
        claimAmount = myScanner.nextDouble();

        System.out.println("Has the claim been completed? (type the word true or false)");
        completed = myScanner.nextBoolean();

        // Calculate the tax amount which are included in the claim amount. Rate of tax is 20% which is 0.20
        taxAmount = claimAmount * 0.20;
        claimAmountBeforeTax = claimAmount - taxAmount;

        if (completed)
        {
            System.out.printf("Claim %d made by agent %s relates to policy %s. %nThe claim amount is $%.2f, which is %.2f plus %.2f taxes and the claim description is%n ===> %s. %nThe status of the claim is ** completed ** and payment will be processed within 3 working days." , claimId, agentId, policyId, claimAmount, claimAmountBeforeTax, taxAmount, claimDescription);
        }
        else
        {
            System.out.printf("Claim %d made by agent %s relates to policy %s. %nThe claim amount is $%.2f, which is %.2f plus %.2f taxes and the claim description is%n ===> %s. %nThe status of the claim is ** not complete ** and processing of the claim will continue.", claimId, agentId, policyId, claimAmount, claimAmountBeforeTax, taxAmount, claimDescription);
        }

    } // End of main() method
} // End of AgentClaimSelection class