package labeight.exerciseeight;

public class QuoteEstimatorMain
{
    static QuoteEstimatorMethods myQuoteEstimatorMethods = new QuoteEstimatorMethods();
    static FileHandlingClass myFileHandlingClass = new FileHandlingClass();

    public static void main(String[] args)
    {
        do
        {
            myQuoteEstimatorMethods.acceptItemDetails();

            // Calculate quote based on vehicle age and enginecc
            myQuoteEstimatorMethods.calculateQuoteEstimate();

            System.out.printf("The vehicle to be insured is %d years old and has an engine size of %d cc. %n", myQuoteEstimatorMethods.vehicleAge, myQuoteEstimatorMethods.engineCC);
            System.out.printf("The quote estimate is $%.2f %n", myQuoteEstimatorMethods.quoteAmount);

            myQuoteEstimatorMethods.addItemsToArray(myQuoteEstimatorMethods.arrayPositionCounter);

            // Check if the user has more items to enter
            myQuoteEstimatorMethods.askIfThereAreMoreEntries();

    } while( myQuoteEstimatorMethods.moreEntries.equalsIgnoreCase("y")); // End of do while iteration

        // Print the quote details
        myQuoteEstimatorMethods.displayQuoteDetails();

        // Call the method that writes the array data to the text file
        myFileHandlingClass.writeQuoteDetailsToTextFile(myQuoteEstimatorMethods.quoteDetails, "quoteestimatortextfile.txt");

        // Call the method that displays the array data from the text file
        myFileHandlingClass.readQuoteDetailsFromTextFile("quoteestimatortextfile.txt");
    } // End of main() method

} // End of QuoteEstimatorMain class