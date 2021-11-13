package labten.exerciseten;

public class AgentClaimMain
{
    static int numberOfClaimsBeingMade, numberOfClaimsEntered;
    public static void main(String[] args)
    {
        AgentClaimMethods myAgentClaimMethods = new AgentClaimMethods();

        // Create an instance of the FileHandlingClass class
        FileHandlingClass myFileHandlingClass = new FileHandlingClass();

        myAgentClaimMethods.acceptNumberOfClaims();

        String[] agentClaimDetails = new String[6 * myAgentClaimMethods.numberOfClaimsBeingMade];
        do
        {
            myAgentClaimMethods.acceptAllClaimDetails();

            // Calculate the tax amount which are included in the claim amount. Rate of tax is 20% which is 0.20
            myAgentClaimMethods.calculateTaxAmounts();

            // Add claim details to the array and increment the counter by 6
            // to start the next claim details at the correct array position
            myAgentClaimMethods.addItemsToArray(agentClaimDetails);
        }
        while (myAgentClaimMethods.numberOfClaimsEntered <myAgentClaimMethods.numberOfClaimsBeingMade);

        // Print the state details
        myAgentClaimMethods.displayClaimDetailsFromArray(agentClaimDetails);

        // Call the method that writes the array data to the text file
        myFileHandlingClass.writeClaimDetailsToTextFile(agentClaimDetails, "agentclaimstextfile.txt");

        // Call the method that displays the array data from the text file
        myFileHandlingClass.readClaimDetailsFromTextFile("agentclaimstextfile.txt");


    } // End of main() method
} // End of AgentClaimMain class