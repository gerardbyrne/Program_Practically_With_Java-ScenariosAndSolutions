package labsix.exerciseten;

import java.io.Serializable;

public class ClaimMonthlyNumbers implements Serializable
{
    String month;
    int numberOfClaims;

    public ClaimMonthlyNumbers(String month, int numberOfClaims)
    {
        this.month = month;
        this.numberOfClaims = numberOfClaims;
    } // End of constructor

    public String getMonth()
    {
        return month;
    }

    public void setMonth(String month)
    {
        this.month = month;
    }

    public int getNumberOfClaims()
    {
        return numberOfClaims;
    }

    public void setNumberOfClaims(int numberOfClaims)
    {
        this.numberOfClaims = numberOfClaims;
    }

    @Override
    public String toString()
    {
        return "ClaimMonthlyNumbers{" +
            "month='" + month + '\'' +
            ", numberOfClaims=" + numberOfClaims +
            '}';
    } // End of toString() method
} // End of ClaimMonthlyNumbers class
