package labfive.exerciseten;

import java.io.Serializable;

public class Claim implements Serializable
{
    double claimOneAmount;
    double claimTwoAmount;
    double totalOfClaims;
    double averageOfClaims;

    public Claim(double claimValueOne, double claimValueTwo, double totalOfClaims, double averageOfClaims)
    {
        this.claimOneAmount = claimValueOne;
        this.claimTwoAmount = claimValueTwo;
        this.totalOfClaims = totalOfClaims;
        this.averageOfClaims = averageOfClaims;
    } // End of Claim constructor

    public double getClaimOneAmount()
    {
        return claimOneAmount;
    }

    public void setClaimOneAmount(double claimOneAmount)
    {
        this.claimOneAmount = claimOneAmount;
    }

    public double getClaimTwoAmount()
    {
        return claimTwoAmount;
    }

    public void setClaimTwoAmount(double claimTwoAmount)
    {
        this.claimTwoAmount = claimTwoAmount;
    }

    public double getTotalOfClaims()
    {
        return totalOfClaims;
    }

    public void setTotalOfClaims(double totalOfClaims)
    {
        this.totalOfClaims = totalOfClaims;
    }

    public double getAverageOfClaims()
    {
        return averageOfClaims;
    }

    public void setAverageOfClaims(double averageOfClaims)
    {
        this.averageOfClaims = averageOfClaims;
    }

    @Override
    public String toString()
    {
        return "Claim{" +
            "claimOneAmount=" + claimOneAmount +
            ", claimTwoAmount=" + claimTwoAmount +
            ", totalOfClaims=" + totalOfClaims +
            ", averageOfClaims=" + averageOfClaims +
            '}';
    } // End of toString() method
} // End of Claim class