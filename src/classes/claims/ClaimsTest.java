package classes.claims;

public class ClaimsTest
{
    /*
    Declare instances of the Claims class using the overlad constructor
    */
    static Claims myClaimsOne = new Claims(1, "AGENT1", "POLICY1", "Vehicle collision", 6000, false);
    static Claims myClaimsTwo = new Claims(2, "AGENT2", "POLICY2", "Lost wedding ring", 3000, true);
    static Claims myClaimsThree = new Claims(3, "AGENT2", "POLICY3", "LCD TV damaged", 1000, true);

    public static void main(String[] args)
    {
        totalOfAllClaims();
        totalOfClaimsPerAgentId("Agent2");
    } // End of main() method

    public  static void totalOfAllClaims()
    {
        /*
        Use an iteration to accumulate the claim values
        */
        double totalOfAllClaims =  myClaimsOne.getClaimAmount()
                                                    + myClaimsTwo.getClaimAmount()
                                                    + myClaimsThree.getClaimAmount();
        System.out.printf("The total of the claims is $%.2f %n", totalOfAllClaims);
    }  // End of totalOfAllClaims()

    public  static void totalOfClaimsPerAgentId(String agentId)
    {
        double totalOfAllAnAgentsClaims = 0.00;

        /*
        This will involve a selection construct based on the agent id and
        we check each of the three instances of the Claims
        */
            if (myClaimsOne.getAgentId().equalsIgnoreCase(agentId))
            {
                totalOfAllAnAgentsClaims += myClaimsOne.getClaimAmount();
            }
            else if (myClaimsTwo.getAgentId().equalsIgnoreCase(agentId))
            {
                totalOfAllAnAgentsClaims += myClaimsOne.getClaimAmount();
            }
            else if (myClaimsThree.getAgentId().equalsIgnoreCase(agentId))
            {
                totalOfAllAnAgentsClaims += myClaimsOne.getClaimAmount();
            }
            else
            {
                // Do nothing
        }
        System.out.printf("The total of the claims for %s is  $%.2f %n", agentId, totalOfAllAnAgentsClaims);
    }  // End of totalOfAllClaims()

} // End of CircleTest class