package methods;

import java.util.Scanner;

public class Invoice
{
    static Scanner myScanner = new Scanner(System.in);
    static double itemPrice, quantityCost, invoiceTotal, vatAmount;
    static int quantityPurchased;

    public static void main(String[] args)
    {
        askUserToInputTheItemPrice();
        askUserToInputQuantityBeingPurchased();
        calculateQuantityCost(itemPrice, quantityPurchased);
        calculateItemsVAT(quantityCost);
        calculateInvoiceTotal(quantityCost, vatAmount);
        displayInvoice(itemPrice, quantityPurchased, vatAmount, invoiceTotal);
    }

    static double askUserToInputTheItemPrice()
    {
        System.out.println("What is the item price?");
        itemPrice = myScanner.nextDouble();
        return itemPrice;
    } // End of askUserToInputTheItemPrice() method

    static int askUserToInputQuantityBeingPurchased()
    {
        System.out.println("What quantity of items are being purchased?");
        quantityPurchased = myScanner.nextInt();
        return quantityPurchased;
    } // End of askUserToInputQuantityBeingPurchased() method

    static double calculateQuantityCost(double itemPricePassedIn, int quantityPurchasedPassedIn)
    {
        quantityCost = itemPricePassedIn * quantityPurchasedPassedIn;
        return quantityCost;
    } // End of calculateQuantityCost() method

    static double calculateItemsVAT(double quantityCostPassedIn)
    {
        vatAmount= quantityCostPassedIn * 0.20;
        return vatAmount;
    } // End of calculateItemsVAT() method

    static double calculateInvoiceTotal(double quantityCostPassedIn, double vatAmountPassedIn)
    {
        invoiceTotal = quantityCostPassedIn + vatAmountPassedIn;
        return invoiceTotal;
    } // End of calculateInvoiceTotal() method

    static void displayInvoice(double itemPricePassedIn, int quantityPurchasedPassedIn,
                               double vatAmountPassedIn, double invoiceTotalPassedIn)
    {
        System.out.printf("The item price is: £%.2f %n", itemPricePassedIn);
        System.out.printf("The quantity is: £%d %n", quantityPurchasedPassedIn);
        System.out.printf("Cost before VAT is: £%.2f %n", quantityCost);
        System.out.printf("The VAT amount is: £%.2f %n", vatAmountPassedIn);
        System.out.printf("Invoice total is: £%.2f %n", invoiceTotalPassedIn);
    } // End of displayInvoice() method

} // End of Invoice class