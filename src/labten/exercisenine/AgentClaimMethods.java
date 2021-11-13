package labten.exercisenine;

import java.util.Scanner;

public class AgentClaimMethods
{
    Scanner myScanner = new Scanner(System.in);
    int numberOfClaimsBeingMade, numberOfClaimsEntered, arrayPositionCounter;
    long claimId;
    String agentId, policyId, claimDescription;
    double claimAmount, claimAmountBeforeTax, taxAmount;
    boolean completed;

    public void displayClaimDetailsFromArray(String[] agentClaimDetails)
    {
        System.out.println("The claim details entered are");
        for(int arrayCounter=0; arrayCounter<agentClaimDetails.length; arrayCounter+=6)
        {
            if (Boolean.parseBoolean(agentClaimDetails[arrayCounter + 5] ))
            {
                System.out.printf("Claim %s made by agent %s relates to policy %s. %nThe claim amount is $%s and the claim description is%n ===> %s. %nThe status of the claim is ** completed ** and payment will be processed within 3 working days.%n", agentClaimDetails[arrayCounter] , agentClaimDetails[arrayCounter + 1] , agentClaimDetails[arrayCounter + 2] , agentClaimDetails[arrayCounter + 4] , agentClaimDetails[arrayCounter + 3] );
            } else
            {
                System.out.printf("Claim %s made by agent %s relates to policy %s. %nThe claim amount is $%s and the claim description is%n ===> %s. %nThe status of the claim is ** not complete ** and processing of the claim will continue.%n", agentClaimDetails[arrayCounter], agentClaimDetails[arrayCounter + 1], agentClaimDetails[arrayCounter + 2] , agentClaimDetails[arrayCounter + 4] , agentClaimDetails[arrayCounter + 3]);
            }
        } // End of iteration
    } // End of addItemsToArray() method

    public void acceptNumberOfClaims()
    {
        System.out.println("How many claims will be made?");
        numberOfClaimsBeingMade = myScanner.nextInt();
    } // End of acceptNumberOfClaims() method

    public void acceptAllClaimDetails()
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

    public void calculateTaxAmounts()
    {
        taxAmount = claimAmount * 0.20;
        claimAmountBeforeTax = claimAmount - taxAmount;
    } // End of calculateTaxAmounts() method

    public void addItemsToArray(String[] agentClaimDetails)
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