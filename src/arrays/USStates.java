package arrays;

public class USStates
{
    public static void main(String[] args)
    {
        // Declare an array of 6 states of the USA
        String[] stateName = {"Alabama", "Arizona",
            "Illinois", "Maine",
            "Utah", "Vermont"};

        // Declare an array for the 6 capitals cities of the states
        String[] stateCapital = {"Montgomery", "Phoenix",
            "Springfield", "Augusta",
            "Salt Lake City", "Montpelier"};

        // Declare an array for the populations of the 6 states
        int[] statePopulation = {5025000, 7150000,
            12800000, 1360000,
            3200000, 650000};

        System.out.println("*************************************************************************************");
        System.out.println("                                 1 Dimensional Array                                 ");
        System.out.println("*************************************************************************************");
        // Iterate the array and get the state from it but also
        // reference the equivalent capital and population
        for (int counter = 0; counter < stateName.length; counter++)
        {
            // Display the appropriate message
            System.out.printf("The state of %-10s whose capital is %-15s has a population of %d%n",
                                stateName[counter], stateCapital[counter],statePopulation[counter]);
        } // End of if construct

        // Declare an array of arrays. One array of 3 items for each state
        String[][] stateDetails  = {
                                    {"Alabama", "Montgomery", "5025000"},
                                    {"Arizona", "Phoenix", "7150000"},
                                    {"Illinois", "Springfield", "12800000"},
                                    {"Maine", "Augusta", "1360000"},
                                    {"Utah", "Salt Lake City", "3200000"},
                                    {"Vermont", "Montpelier", "650000"}
                               };

        System.out.println("*************************************************************************************");
        System.out.println("                                 2 Dimensional Array                                 ");
        System.out.println("*************************************************************************************");
        // Iterate the outside array and inside this iterate the inner array
        for (int outercount = 0; outercount < stateDetails.length; outercount++)
        {
                // Display the appropriate message
                System.out.printf("The state of %-10s whose capital is %-15s has a population of %d%n",
                    stateDetails[outercount][0], stateDetails[outercount][1], Integer.parseInt(stateDetails[outercount][2]));
        } // End of if construct

    } // End of main() method
} // End of USStates class
