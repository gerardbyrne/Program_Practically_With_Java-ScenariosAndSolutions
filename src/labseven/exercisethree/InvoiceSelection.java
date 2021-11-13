package labseven.exercisethree;

import java.util.Scanner;

public class InvoiceSelection
{
    static Scanner myScanner = new Scanner(System.in);
    static String itemDescription;
    static double itemPrice, itemsTotal, discountAmount, discountRate = .10;
    static int quantityOfItems;

    public static void main(String[] args)
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
        if(quantityOfItems>=5)
        {
            itemsTotal = (itemPrice * quantityOfItems);
            discountAmount = itemsTotal * discountRate;
            itemsTotal = itemsTotal - discountAmount;
            System.out.printf("There are %d %s with a unit price of $%.2f and an items total of $%.2f, which includes a discount of $%.2f%n", quantityOfItems, itemDescription, itemPrice, itemsTotal, discountAmount);
        }
        else
        {
            itemsTotal = itemPrice * quantityOfItems;
            System.out.printf("There are %d %s with a unit price of $%.2f and an items total of $%.2f%n", quantityOfItems, itemDescription, itemPrice, itemsTotal);
        }
    } // End of main() method

} // End of InvoiceSelection class
