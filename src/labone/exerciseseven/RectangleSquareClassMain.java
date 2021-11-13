package labone.exerciseseven;

public class RectangleSquareClassMain
{
/*******************************************************************
 Our main() creates an instance of the class that holds the methods
 we will need to call. We then use the instantiation of the class
 (here it is called myRectangleSquareMethodsClass) to call the
 required methods.
 The main() method is the same as it was before we had another class
 but we have called the methods from the new class so we have to use
 the name of the instantiation followed by a dot and then the method
 name.
 This is really now making our code more professional
 *******************************************************************/

    public static void main(String[] args)
    {
        // Create an instance of the RectangleSquareMethods Class
        RectangleSquareClassMethods myRectangleSquareMethodsClass = new RectangleSquareClassMethods();

        // Iteration for the input of the two sets of values
        for (int counter = 0; counter < 2; counter++)
        {
            myRectangleSquareMethodsClass.askUserToInputShapeDimensions(counter);

            myRectangleSquareMethodsClass.calculateAreaOfShape();

            myRectangleSquareMethodsClass.calculatePerimeterOfShape();

            myRectangleSquareMethodsClass.writeValuesToAnArray(counter);
        } // End of for iteration

        myRectangleSquareMethodsClass.displayValuesFromTheArray();

    } // End of main() method

} // End of RectangleSquareMethods class