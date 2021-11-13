package labtwo.exercisenine;

public class CubeCuboidStringHandlingClassMain
{

/*******************************************************************
 Our main() creates an instance of the class that holds the methods
 we will need to call. We then use the instantiation of the class
 (here it is called myCubeCuboidClassMethods) to call the required methods.
 The main() method is the same as it was before we had another class
 but we have called the methods from the new class so we have to use
 the name of the instantiation followed by a dot and then the method name.
 This is really now making our code more professional
 *******************************************************************/

    public static void main(String[] args)
    {
        // Create an instance of the CubeCuboidFileHandlingClassMethods class
        CubeCuboidStringHandlingClassMethods myCubeCuboidStringHandlingClassMethods = new CubeCuboidStringHandlingClassMethods();

        // Iteration for the input of the two sets of values
        for (int counter = 0; counter < 2; counter++)
        {
            myCubeCuboidStringHandlingClassMethods.askUserToInputShapeDimensions(counter);

            // Calculate the volume of the shape
            myCubeCuboidStringHandlingClassMethods.calculateVolumeOfShape();

            // Calculate the perimeter of the shape
            myCubeCuboidStringHandlingClassMethods.calculatePerimeterOfShape();

            // Write each of the 5 shape properties to the array
            myCubeCuboidStringHandlingClassMethods.writeValuesToAnArray(counter);

            // Write values to an array and include some String labels
            myCubeCuboidStringHandlingClassMethods.writeValuesToAnArrayWithLabels(counter);

        } // End of for iteration

        myCubeCuboidStringHandlingClassMethods.displayValuesFromTheArray();

        myCubeCuboidStringHandlingClassMethods.writeShapePropertiesToTextFile();
        myCubeCuboidStringHandlingClassMethods.readShapePropertiesFromTextFile();

        System.out.println("Write values to the array with labels and the display the array details");

        myCubeCuboidStringHandlingClassMethods.displayValuesFromTheArrayWithLabels();
    } // End of main() method

} // End of CubeCuboidStringHandlingClassMain class