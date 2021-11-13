package arrays;

public class ShoppingCart
{
    public static void main(String[] args)
    {
        // Declare the array of shopping cart items
        String[] shoppingCartValues  = {"Bluetooth Mouse,T1,10.00",
                                        "Jiggler,T1,20.00",
                                        "Mouse Mat,T0,1.00"};

        double vatRate = 0.00, vatAmount = 0.00, itemPriceIncludingVAT = 0.00;

        // Iterate the array and get the tax code and item price
        for (int counter = 0; counter < shoppingCartValues.length;  counter++)
        {
            // Split the array item to get the tax code and item price
            // The split() method puts the items into an array
            // We know the split at the comma gives an array of 3 items
            String[] itemValues = shoppingCartValues[counter].split(",");
            String taxCode = itemValues[1];
            double itemPrice = Double.parseDouble(itemValues[2]);

            // Find the appropriate VAT code, VAT rate and VAT amount
            switch(taxCode)
            {
                case "T0":
                    vatRate = 0.00;
                    vatAmount = 0.00;
                    break;
                case "T1":
                    vatRate = 0.20;
                    vatAmount = itemPrice * vatRate;
                    break;
            } // End of selection construct Switch

            // Calculate the item price inclusive of the VAT amount
            itemPriceIncludingVAT = itemPrice + vatAmount;

            // Display the details for the item
            System.out.printf("The item price is %.2f %n\twith a VAT code of %s%n " +
                              "\ta VAT rate of %.2f %n" +
                              "\ta VAT amount of %.2f to be added %n" +
                              "\tmaking a total item price of %.2f %n%n", itemPrice, taxCode, vatRate, vatAmount, itemPriceIncludingVAT);
        } // End of for iteration construct
    } // End of main() method

} // End of ShoppingCart class
