package classes.agents;

public class AgentTest
{
    /*
    Declare instances of the Agents class using the constructor
    */
    static Agent myAgentOne = new Agent(1, "AGENT1", "agent1@claims.com", "012345678", "Michigan", false);
    static Agent myAgentTwo = new Agent(2, "AGENT2", "agent2@claims.com", "012349876", "Florida", true);

    static AgentClaims myAgentClaimsOne = new AgentClaims(1, myAgentOne, "POLICY1", "Vehicle collision", 6000, false);
    static AgentClaims myAgentClaimsTwo = new AgentClaims(2, myAgentTwo, "POLICY2", "Lost wedding ring", 3000, true);
    static AgentClaims myAgentClaimsThree = new AgentClaims(3, myAgentTwo, "POLICY3", "LCD TV damaged", 1000, true);

    public static void main(String[] args)
    {
        System.out.println(myAgentClaimsOne.toString());
        System.out.println();
        System.out.println(myAgentClaimsTwo.toString());
        System.out.println();
        System.out.println(myAgentClaimsThree.toString());

    } // End of main() method

} // End of CircleTest class