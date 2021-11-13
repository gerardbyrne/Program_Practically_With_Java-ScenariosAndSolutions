package labten.exerciseten;

import java.io.Serializable;

public class Claim implements Serializable
{
    long claimId;
    String agentId;
    String policyId;
    String claimDescription;
    double claimAmount;
    boolean completed;

    public Claim(long claimId, String agentId, String policyId, String claimDescription, double claimAmount, boolean completed)
    {
        this.claimId = claimId;
        this.agentId = agentId;
        this.policyId = policyId;
        this.claimDescription = claimDescription;
        this.claimAmount = claimAmount;
        this.completed = completed;
    } // End of constructor

    public long getClaimId()
    {
        return claimId;
    }

    public void setClaimId(long claimId)
    {
        this.claimId = claimId;
    }

    public String getAgentId()
    {
        return agentId;
    }

    public void setAgentId(String agentId)
    {
        this.agentId = agentId;
    }

    public String getPolicyId()
    {
        return policyId;
    }

    public void setPolicyId(String policyId)
    {
        this.policyId = policyId;
    }

    public String getClaimDescription()
    {
        return claimDescription;
    }

    public void setClaimDescription(String claimDescription)
    {
        this.claimDescription = claimDescription;
    }

    public double getClaimAmount()
    {
        return claimAmount;
    }

    public void setClaimAmount(double claimAmount)
    {
        this.claimAmount = claimAmount;
    }

    public boolean getCompleted()
    {
        return completed;
    }

    public void setCompleted(boolean completed)
    {
        this.completed = completed;
    }

    @Override
    public String toString()
    {
        return "The Agent Claim has the details{" +
            "claimId=" + claimId +
            ", agentId='" + agentId + '\'' +
            ", policyId='" + policyId + '\'' +
            ", claimDescription='" + claimDescription + '\'' +
            ", claimAmount=" + claimAmount +
            ", completed=" + completed +
            '}';
    } // End of toString() method
} // End of Claim class
