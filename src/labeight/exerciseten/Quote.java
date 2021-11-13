package labeight.exerciseten;

import java.io.Serializable;

public class Quote implements Serializable
{
    String customerName;
    int vehicleAge, engineCC;
    double quoteAmount;

    public Quote(String customerName, int vehicleAge, int engineCC, double quoteAmount)
    {
        this.customerName = customerName;
        this.vehicleAge = vehicleAge;
        this.engineCC = engineCC;
        this.quoteAmount = quoteAmount;
    } // End of constructor

    public String getCustomerName()
    {
        return customerName;
    }

    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public int getVehicleAge()
    {
        return vehicleAge;
    }

    public void setVehicleAge(int vehicleAge)
    {
        this.vehicleAge = vehicleAge;
    }

    public int getEngineCC()
    {
        return engineCC;
    }

    public void setEngineCC(int engineCC)
    {
        this.engineCC = engineCC;
    }

    public double getQuoteAmount()
    {
        return quoteAmount;
    }

    public void setQuoteAmount(double quoteAmount)
    {
        this.quoteAmount = quoteAmount;
    }

    @Override
    public String toString()
    {
        return "Quote details{" +
            "customerName='" + customerName + '\'' +
            ", vehicleAge=" + vehicleAge +
            ", engineCC=" + engineCC +
            ", quoteAmount=" + quoteAmount +
            '}';
    } // End of toString() method
} // End of Quote class