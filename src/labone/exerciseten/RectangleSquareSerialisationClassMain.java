package labone.exerciseten;

public class RectangleSquareSerialisationClassMain
{
/*******************************************************************
 Our main() creates an instance of the class that holds the methods
 we will need to call. We then use the instantiation of the class
 (here it is called myRectangleSquareMethodsClass) to call the required methods.
 The main() method is the same as it was before we had another class
 but we have called the methods from the new class so we have to use
 the name of the instantiation followed by a dot and then the method name.
 This is really now making our code more professional
 *******************************************************************/

    public static void main(String[] args)
    {
        // Create an instance of the RectangleSquareFileHandlingClassMethods
        RectangleSquareSerialisationClassMethods myRectangleSquareSerialisationClassMethods = new RectangleSquareSerialisationClassMethods();

        // Iteration for the input of the two sets of values
        for (int counter = 0; counter < 2; counter++)
        {
            myRectangleSquareSerialisationClassMethods.askUserToInputShapeDimensions(counter);

            myRectangleSquareSerialisationClassMethods.calculateAreaOfShape();

            myRectangleSquareSerialisationClassMethods.calculatePerimeterOfShape();

            myRectangleSquareSerialisationClassMethods.writeValuesToAnArray(counter);

            // Write values to an array and include some String labels
            myRectangleSquareSerialisationClassMethods.writeValuesToAnArrayWithLabels(counter);

        } // End of for iteration

        myRectangleSquareSerialisationClassMethods.displayValuesFromTheArray();
        myRectangleSquareSerialisationClassMethods.writeShapePropertiesToTextFile();
        myRectangleSquareSerialisationClassMethods.readShapePropertiesFromTextFile();

        System.out.println("Write values to the array with labels and the display the array details");

        myRectangleSquareSerialisationClassMethods.displayValuesFromTheArrayWithLabels();

    } // End of main() method

} // End of RectangleSquareFileHandlingClassMain class