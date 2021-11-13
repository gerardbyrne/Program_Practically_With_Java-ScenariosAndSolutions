package labten.exerciseone;

import java.util.Scanner;

public class AgentClaim
{
    static Scanner myScanner = new Scanner(System.in);
    static long claimId;
    static String agentId, policyId, claimDescription;
    static double claimAmount;
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

        System.out.printf("Claim %d made by agent %s relates to policy %s. %nThe claim amount is $%.2f and the claim description is%n ===> %s. %nIt is %b that the claim is completed." , claimId, agentId, policyId, claimAmount, claimDescription, completed);

    } // End of main() method
} // End of AgentClaim class