package labseven.exercisefive;

import java.util.Scanner;

public class InvoiceArrays
{
    static Scanner myScanner = new Scanner(System.in);
    static String itemDescription, moreEntries;
    static double itemPrice, itemsTotal, discountAmount, discountRate = .10, invoiceTotal;
    static int quantityOfItems;
    static String invoiceItems[] = new String[6];

    public static void main(String[] args)
    {
        int arrayPositionCounter= 0;
        do
        {
            // Request the user input
            System.out.println("What is the description of the item?");
            itemDescription = myScanner.nextLine();

            System.out.println("What is the price of the item?");
            itemPrice = myScanner.nextDouble();

            System.out.println("How many of the items are there?");
            quantityOfItems = myScanner.nextInt();

        /* Calculate the total price for the quantity of items based
           on whether a discount is applicable */
            if (quantityOfItems >= 5)
            {
                itemsTotal = (itemPrice * quantityOfItems);
                discountAmount = itemsTotal * discountRate;
                itemsTotal = itemsTotal - discountAmount;
                System.out.printf("There are %d %s with a unit price of $%.2f and an items total of $%.2f, which includes a discount of $%.2f%n", quantityOfItems, itemDescription, itemPrice, itemsTotal, discountAmount);
            } else
            {
                itemsTotal = itemPrice * quantityOfItems;
                System.out.printf("There are %d %s with a unit price of $%.2f and an items total of $%.2f%n", quantityOfItems, itemDescription, itemPrice, itemsTotal);
            }

            // Add item details to the array and increment the counter by 3
            // to start the next item details at the correct array position
            invoiceItems[arrayPositionCounter] = itemDescription;
            invoiceItems[arrayPositionCounter + 1] = String.valueOf(quantityOfItems);
            invoiceItems[arrayPositionCounter + 2] = String.valueOf(itemsTotal);
            arrayPositionCounter+=3;

            // Check if the user has more items to enter
            System.out.println("Are there more items to enter (Y or N)?");
            moreEntries = myScanner.next();

            // Consume the additional characters
            myScanner.nextLine();
        } while( moreEntries.equalsIgnoreCase("y")); // End of do while iteration

        // Print the invoice details
        System.out.println("The invoice details are");
        for(int arrayCounter=0; arrayCounter<invoiceItems.length; arrayCounter+=3)
        {
            System.out.printf("%10s %-40s = $%.2f%n", invoiceItems[arrayCounter +1], invoiceItems[arrayCounter], Double.parseDouble(invoiceItems[arrayCounter+2]));
            invoiceTotal += Double.parseDouble(invoiceItems[arrayCounter+2]);
        }
        System.out.printf("%53s $%.2f%n", "Invoice total =", invoiceTotal);
    } // End of main() method

} // End of InvoiceArrays class
