package classes.agents;

/*
This is the Claims class which has a property,
two constructors and two methods.
*/
public class AgentClaims
{
    /*
    The properties are declared with an access modifier of private
    which means they only accessible from outside the class by using the
    getter methods.
    */
    private long claimId;
    private Agent agentDetails;
    private String policyId;
    private String claimDescription;
    private double claimAmount;
    private boolean completed;

    /*
     We have two constructors so we have what is called constructor overloading
     This first constructor is the default constructor and does not do anything
     to the radius property. Remember that the primary purpose of the
     constructor is to change the default values of the properties
    */
    public AgentClaims()
    {
    } // End of Claims constructor() that accepts no parameters

    /*
    This constructor is used to create a Claims instance with the values
     that are passed into the constructor at the time it is created
    */
    public AgentClaims(long claimId, Agent agentDetails, String policyId, String claimDescription, double claimAmount, boolean completed)
    {
        this.claimId = claimId;
        this.agentDetails = agentDetails;
        this.policyId = policyId;
        this.claimDescription = claimDescription;
        this.claimAmount = claimAmount;
        this.completed = completed;
    } // End of Claims constructor() that accepts a parameter

    /* This getter method is used to return the value of the claim id property */
    public double getClaimId()
    {
        return claimId;
    } // End of getRadius() method

    /* This setter method is used to amend the value of the claim id property */
    public void setClaimId(long claimId)
    {
        this.claimId = claimId;
    }

    /* This getter method is used to return the value of the Agent (class) property */
    public Agent getAgentDetails()
    {
        return agentDetails;
    }

    /* This setter method is used to amend the value of the Agent (class)  property */
    public void setAgentId(Agent agentDetails)
    {
        this.agentDetails = agentDetails;
    }

    /* This getter method is used to return the value of the policy id property */
    public String getPolicyId()
    {
        return policyId;
    }

    /* This setter method is used to amend the value of the policy id property */
    public void setPolicyId(String policyId)
    {
        this.policyId = policyId;
    }

    /* This getter method is used to return the value of the claim description property */
    public String getClaimDescription()
    {
        return claimDescription;
    }

    /* This setter method is used to amend the value of the claim description property */
    public void setClaimDescription(String claimDescription)
    {
        this.claimDescription = claimDescription;
    }

    /* This getter method is used to return the value of the claim amount property */
    public double getClaimAmount()
    {
        return claimAmount;
    }

    /* This setter method is used to amend the value of the claim amount property */
    public void setClaimAmount(double claimAmount)
    {
        this.claimAmount = claimAmount;
    }

    /* This getter method is used to return the value of the claim completed property */
    public boolean isCompleted()
    {
        return completed;
    }

    /* This setter method is used to amand the value of the claim completed property */
    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }

    @Override
    public String toString()
    {
        return "Claims{\n" +
            "claimId=" + claimId +
            ", \nagentDetails=\n\t" + agentDetails +
            ", policyId=" + policyId +
            ", claimDescription=" + claimDescription + 
            ", claimAmount=" + claimAmount +
            ", completed=" + completed +
            '}';
    }
} // End of Claims class