package labseven.exerciseseven;

public class InvoiceMain
{
    public static void main(String[] args)
    {
        // Create an instance of the InvoiceMethods class where the methods exist
        InvoiceMethods myInvoiceMethods = new InvoiceMethods();

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
    } // End of main() method

} // End of InvoiceMain class
