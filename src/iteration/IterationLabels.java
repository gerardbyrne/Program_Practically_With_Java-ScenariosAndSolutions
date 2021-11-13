package iteration;

import java.util.Scanner;

public class IterationLabels
{
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args)
    {
        int numberOfParcelsInTheOrder;
        String customerName, customerAddress, customerCity, customerZipCode;

        System.out.println("How many parcels are in the customer?");
        numberOfParcelsInTheOrder = myScanner.nextInt();
        myScanner.nextLine();

        for (int counter=0; counter<numberOfParcelsInTheOrder; counter++ )
        {
            System.out.println("What is the customers name?");
            customerName = myScanner.nextLine();

            System.out.println("What is the customers address?");
            customerAddress = myScanner.nextLine();

            System.out.println("What is the customers city?");
            customerCity = myScanner.nextLine();

            System.out.println("What is the customers zip code?");
            customerZipCode = myScanner.nextLine();

            System.out.println(customerName);
            System.out.println(customerAddress);
            System.out.println(customerCity);
            System.out.println(customerZipCode);
            System.out.println("Label " + (counter + 1) + " of " + numberOfParcelsInTheOrder);
        } // End of for iteration

    } // End of main() method

} // End of IterationClaimsFor class