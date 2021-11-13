package methods;

import java.util.Scanner;

public class InsuranceQuote
{
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args)
    {
        int vehicleAge = askUserToInputTheVehicleAge();
        int engineCC = askUserToInputVehicleEngineSize();
        double quoteAmount = calculateQuote(vehicleAge, engineCC);
        System.out.printf("For a vehicle of age %d with an engine size of %d the quote amount is $%.2f", vehicleAge, engineCC, quoteAmount);
    } // End of main() method

    public static int askUserToInputTheVehicleAge()
    {
        System.out.println("What is the age of the vehicle?");
        int vehicleAge = myScanner.nextInt();
        return vehicleAge;
    } //End of askUserToInputTheVehicleAge() method

    public static int askUserToInputVehicleEngineSize()
    {
        System.out.println("What is the cubic capacity of the vehicle engine?");
        int engineCC = myScanner.nextInt();
        return engineCC;
    } //End of askUserToInputTheVehicleAge() method

    public static double calculateQuote (int vehicleAge, int engineCC )
    {
        double ageValue, engineCCValue, quoteAmount;
        if (vehicleAge > 10)
        {
            ageValue = 200;
        }
        else
        {
            ageValue = 100;
        }
        if (engineCC > 2000)
        {
            engineCCValue = 300;
        }
        else
        {
            engineCCValue = 200;
        }
        quoteAmount = ageValue + engineCCValue;
        return quoteAmount;
    } //End of askUserToInputTheVehicleAge() method

} // End of class
