package labten.exercisesix;

import java.util.Scanner;

public class AgentClaimMethods
{
    static Scanner myScanner = new Scanner(System.in);
    static int numberOfClaimsBeingMade, numberOfClaimsEntered, arrayPositionCounter;
    static long claimId;
    static String agentId, policyId, claimDescription;
    static double claimAmount, claimAmountBeforeTax, taxAmount;
    static boolean completed;

    public static void main(String[] args)
    {
        acceptNumberOfClaims();

        String[] agentClaimDetails = new String[6 * numberOfClaimsBeingMade];
        do
        {
            acceptAllClaimDetails();

            // Calculate the tax amount which are included in the claim amount. Rate of tax is 20% which is 0.20
            calculateTaxAmounts();

            // Add claim details to the array and increment the counter by 6
            // to start the next claim details at the correct array position
            addItemsToArray(agentClaimDetails);
        }
        while (numberOfClaimsEntered <numberOfClaimsBeingMade);

        // Print the state details
        displayClaimDetailsFromArray(agentClaimDetails);

    } // End of main() method

    public static void displayClaimDetailsFromArray(String[] agentClaimDetails)
    {
        System.out.println("The claim details entered are");
        for(int arrayCounter=0; arrayCounter<agentClaimDetails.length; arrayCounter+=6)
        {
            if (Boolean.parseBoolean(agentClaimDetails[arrayCounter + 5] ))
            {
                System.out.printf("Claim %s made by agent %s relates to policy %s. %nThe claim amount is $%s and the claim description is%n ===> %s. %nThe status of the claim is ** completed ** and payment will be processed within 3 working days.", agentClaimDetails[arrayCounter] , agentClaimDetails[arrayCounter + 1] , agentClaimDetails[arrayCounter + 2] , agentClaimDetails[arrayCounter + 4] , agentClaimDetails[arrayCounter + 3] );
            } else
            {
                System.out.printf("Claim %s made by agent %s relates to policy %s. %nThe claim amount is $%s and the claim description is%n ===> %s. %nThe status of the claim is ** not complete ** and processing of the claim will continue.%n", agentClaimDetails[arrayCounter], agentClaimDetails[arrayCounter + 1], agentClaimDetails[arrayCounter + 2] , agentClaimDetails[arrayCounter + 4] , agentClaimDetails[arrayCounter + 3]);
            }
        } // End of iteration
    } // End of addItemsToArray() method

    public static void acceptNumberOfClaims()
    {
        System.out.println("How many claims will be made?");
        numberOfClaimsBeingMade = myScanner.nextInt();
    } // End of acceptNumberOfClaims() method

    public static void acceptAllClaimDetails()
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

        // Add one to the number of claims entered tally
        numberOfClaimsEntered++;
    } // End of acceptAllClaimDetails() method

    public static void calculateTaxAmounts()
    {
        taxAmount = claimAmount * 0.20;
        claimAmountBeforeTax = claimAmount - taxAmount;
    } // End of calculateTaxAmounts() method

    public static void addItemsToArray(String[] agentClaimDetails)
    {
        agentClaimDetails[arrayPositionCounter] = String.valueOf(claimId);
        agentClaimDetails[arrayPositionCounter+1] = agentId;
        agentClaimDetails[arrayPositionCounter+2] = policyId;
        agentClaimDetails[arrayPositionCounter+3] = claimDescription;
        agentClaimDetails[arrayPositionCounter+4] = String.valueOf(claimAmount);
        agentClaimDetails[arrayPositionCounter+5] = String.valueOf(completed);

        arrayPositionCounter +=6;
    } // End of displayClaimDetailsFromArray() method

} // End of AgentClaimMethods class