package labseven.exercisenine;

public class InvoiceMain
{
    public static void main(String[] args)
    {
        // Create an instance of the InvoiceMethods class where the methods exist
        InvoiceMethods myInvoiceMethods = new InvoiceMethods();

        // Create an instance of the FileHandlingClass class
        FileHandlingClass myFileHandlingClass = new FileHandlingClass();

        int arrayPositionCounter= 0;
        do
        {
            myInvoiceMethods.acceptItemDetails();

        /* Calculate the total price for the quantity of items based
           on whether a discount is applicable */
            myInvoiceMethods.calculateTotalItemPrice();

            // Add item details to the array
            myInvoiceMethods.addItemDetailsToArray(arrayPositionCounter);
            arrayPositionCounter +=3;

            myInvoiceMethods.askIfThereAreMoreEntries();

        } while(myInvoiceMethods.moreEntries.equalsIgnoreCase("y")); // End of do while iteration

        myInvoiceMethods.displayInvoiceDetails();

        // Call the method that writes the array data to the text file
        myFileHandlingClass.writeInvoiceItemsToTextFile(myInvoiceMethods.invoiceItems, "invoicetextfile.txt");

        // Call the method that displays the array data from the text file
        myFileHandlingClass.readInvoiceItemsFromTextFile("invoicetextfile.txt");

    } // End of main() method

} // End of InvoiceMain class