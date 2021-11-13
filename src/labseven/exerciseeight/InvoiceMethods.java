package labseven.exerciseeight;

import java.util.Scanner;

public class InvoiceMethods
{
    Scanner myScanner = new Scanner(System.in);
    String itemDescription, moreEntries;
    double itemPrice, itemsTotal, discountAmount, discountRate = .10, invoiceTotal;
    int quantityOfItems;
    String invoiceItems[] = new String[6];

    public void acceptItemDetails()
    {
        // Request the user input
        System.out.println("What is the description of the item?");
        itemDescription = myScanner.nextLine();

        System.out.println("What is the price of the item?");
        itemPrice = myScanner.nextDouble();

        System.out.println("How many of the items are there?");
        quantityOfItems = myScanner.nextInt();
    } // End of acceptItemDetails() method

    public void calculateTotalItemPrice()
    {
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
    } // End of calculateTotalItemPrice() method

    public void addItemDetailsToArray(int arrayPositionCounter)
    {
        // Add item details to the array and increment the counter by 3
        // to start the next item details at the correct array position
        invoiceItems[arrayPositionCounter] = itemDescription;
        invoiceItems[arrayPositionCounter + 1] = String.valueOf(quantityOfItems);
        invoiceItems[arrayPositionCounter + 2] = String.valueOf(itemsTotal);
    }

    public void askIfThereAreMoreEntries()
    {
        // Check if the user has more items to enter
        System.out.println("Are there more items to enter (Y or N)?");
        moreEntries = myScanner.next();

        // Consume the additional characters
        myScanner.nextLine();
    }

    public void displayInvoiceDetails()
    {
        // Print the invoice details
        System.out.println("The invoice details are");
        for(int arrayCounter=0; arrayCounter<invoiceItems.length; arrayCounter+=3)
        {
            System.out.printf("%10s %-40s = $%.2f%n", invoiceItems[arrayCounter +1], invoiceItems[arrayCounter], Double.parseDouble(invoiceItems[arrayCounter+2]));
            invoiceTotal += Double.parseDouble(invoiceItems[arrayCounter+2]);
        }
        System.out.printf("%53s $%.2f%n", "Invoice total =", invoiceTotal);
    } // End of displayInvoiceDetails() method

} // End of InvoiceMethods class
