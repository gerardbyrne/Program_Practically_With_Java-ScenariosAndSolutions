package arrays;

public class ClaimValuesFiltered2
{
    public static void main(String[] args)
    {
        int filteredCounter = 0, filteredArraySize = 0;

        // Declare the array and the required variables
        double[] AllClaimValues = { 6500, 7200, 6800, 8200, 8400, 9200, 5500, 7000, 8900, 6900 };

        for (int counter = 0; counter < AllClaimValues.length;  counter++)
        {
            if(AllClaimValues[counter] >= 7000)
            {
                filteredArraySize++;
            } // End of if construct
        } // End of for iteration construct


        // Declare the array of size 10 for the filtered values
        double[] AllClaimValuesFiltered  = new double[filteredArraySize];

        // Calculate the total of the claims
        for (int counter = 0; counter < AllClaimValues.length;  counter++)
        {
            if(AllClaimValues[counter] >= 7000)
            {
                AllClaimValuesFiltered[filteredCounter] = AllClaimValues[counter];
                filteredCounter++;
            } // End of if construct
        } // End of for iteration construct

        // Display the values from the filtered array
        System.out.println("The filtered array values are ");

        for(double claimValue:AllClaimValuesFiltered)
        {
            System.out.printf("\t %5.2f", claimValue);
        } // End of foreach iteration construct

    } // End of main() method

} // End of ClaimValuesFiltered class