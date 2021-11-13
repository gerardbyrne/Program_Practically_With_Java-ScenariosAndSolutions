package labtwo.exerciseseven;

import java.util.Scanner;

public class CubeCuboidClassMethods
{
    Scanner myScanner = new Scanner(System.in);
    int arrayPosition = 0;
    double length, breadth, height, volume, perimeter;
    String shape = "cuboid";
    double ShapeProperties[] = new double[10];

/*******************************************************************
 Methods are reuseable blocks of code outside the main() method.
 Here we call each method from within the main() method but we
 could have a method call another method
 ******************************************************************/

    public void askUserToInputShapeDimensions(int counter)
    {
        if(counter==0)
        {
            System.out.println("What is the length of the " + shape);
            length = myScanner.nextDouble();

            System.out.println("What is the breadth of the shape" + shape);
            breadth = myScanner.nextDouble();

            System.out.println("What is the height of the shape" + shape);
            height = myScanner.nextDouble();
        } // End of the if block
        else
        {
            // Set shape as a cube
            shape = "cube";
            System.out.println("What is the length of the shape");
            length = myScanner.nextDouble();

            height = breadth = length;
        } // End of the else block
    } // End of the askUserToInputShapeDimensions() method

    public void calculateVolumeOfShape()
    {
        // Calculate the volume - same formula for cuboid and cube
        volume = length * breadth * height;
    } // End of the calculateVolumeOfShape() method

    public void calculatePerimeterOfShape()
    {
        // Make a selection based on the length, breadth and height
        // Display the shape details
        if(length == breadth && breadth == height)
        {
            perimeter = 12 * (length);
        } // End of if
        else
        {
            perimeter = 4 * (length + breadth + height);
        } // End of else block

        displayMessage(shape);
    } // End of the calculatePerimeterOfShape() method

    public void displayMessage(String shapePassedIn)
    {
        System.out.printf("The %s has a volume of %.2f and a perimeter of %.2f%n", shapePassedIn, volume, perimeter);
    } // End of the displayMessage() method

    public void writeValuesToAnArray(int counter)
    {
        // Keeping all the writing to the array in one location
        if (counter== 1)
        {
            arrayPosition = 5;
        }
        ShapeProperties[arrayPosition] = length;
        ShapeProperties[arrayPosition + 1] = breadth;
        ShapeProperties[arrayPosition + 2] = height;
        ShapeProperties[arrayPosition + 3] = volume;
        ShapeProperties[arrayPosition + 4] = perimeter;
    } // End of the writeValuesToAnArray() method

    public void displayValuesFromTheArray()
    {
        arrayPosition = 0;
        // Iteration for the display of the two sets of values
        for (int counter = 0; counter < 2; counter++)
        {
            // Reset shape to cuboid on iteration one
            if(counter==0)
            {
                shape = "cuboid";
            }
            else
            {
                // Set shape to square on iteration two
                shape = "cube";
            }
            // Use shape variable in the display
            System.out.println("***************************************");
            System.out.println("      Properties of the " + shape);
            System.out.println("***************************************");
            System.out.println("The length of the " + shape + " is "  + ShapeProperties[arrayPosition]);
            System.out.println("The breadth of the " + shape + " is "  + ShapeProperties[arrayPosition +1]);
            System.out.println("The height of the " + shape + " is "  + ShapeProperties[arrayPosition +2]);
            System.out.println("The volume of the " + shape + " is "   + ShapeProperties[arrayPosition +3]);
            System.out.println("The perimeter of the  " + shape + " is " + ShapeProperties[arrayPosition +4]);
            arrayPosition = 5;
        } // End of for iteration
    } // End of the displayValuesFromTheArray() method

} // End of CubeCuboidClassMethods class