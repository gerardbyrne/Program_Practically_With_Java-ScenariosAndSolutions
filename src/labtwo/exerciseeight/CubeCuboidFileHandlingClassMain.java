package labtwo.exerciseeight;

public class CubeCuboidFileHandlingClassMain
{

/*******************************************************************
 Our main() creates an instance of the class that holds the methods
 we will need to call. We then use the instantiation of the class
 (here it is called myCubeCuboidFileHandlingClassMethods) to call the
 required methods.The main() method is the same as it was before we had
 another class but we have called the methods from the new class so we have
 to use the name of the instantiation followed by a dot and then the method name.
 This is really now making our code more professional
 *******************************************************************/

    public static void main(String[] args)
    {
        // Create an instance of the CubeCuboidFileHandlingClassMethods class
        CubeCuboidFileHandlingClassMethods myCubeCuboidFileHandlingClassMethods = new CubeCuboidFileHandlingClassMethods();

        // Iteration for the input of the two sets of values
        for (int counter = 0; counter < 2; counter++)
        {
            myCubeCuboidFileHandlingClassMethods.askUserToInputShapeDimensions(counter);

            // Calculate the volume of the shape
            myCubeCuboidFileHandlingClassMethods.calculateVolumeOfShape();

            // Calculate the perimeter of the shape
            myCubeCuboidFileHandlingClassMethods.calculatePerimeterOfShape();

            // Write each iof the 5 shape properties to the array
            myCubeCuboidFileHandlingClassMethods.writeValuesToAnArray(counter);

        } // End of for iteration

        myCubeCuboidFileHandlingClassMethods.displayValuesFromTheArray();

        myCubeCuboidFileHandlingClassMethods.writeShapePropertiesToTextFile();
        myCubeCuboidFileHandlingClassMethods.readShapePropertiesFromTextFile();
    } // End of main() method

} // End of CubeCuboidClassMain class