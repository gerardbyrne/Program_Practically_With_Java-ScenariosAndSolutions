package labone.exerciseseven;

import java.util.Scanner;

public class RectangleSquareClassMethods
{
    Scanner myScanner = new Scanner(System.in);
    int arrayPosition = 0;
    double length, breadth, perimeter, area;
    String shape = "rectangle";
    double ShapeProperties[] = new double[8];

    /*******************************************************************
     Methods are reuseable blocks of code outside the main() method.
     Here we call each method from within the main() method but we
     could have a method call another method
     ******************************************************************/
    public void askUserToInputShapeDimensions(int counter)
    {
        if(counter ==0)
        {
            System.out.println("What is the length of the " + shape);
            length = myScanner.nextDouble();

            System.out.println("What is the breadth of the " + shape);
            breadth = myScanner.nextDouble();
        } // End of the if block
        else
        {
            // Set shape as a rectangle
            shape = "square";
            System.out.println("What is the length of the " + shape);
            length = myScanner.nextDouble();

            breadth = length;
        } // End of the else block
    } // End of the askUserToInputShapeDimensions() method

    public void calculateAreaOfShape()
    {
        // Calculate the area - same formula for rectangle and square
        area = length * breadth;
    } // End of the calculateAreaOfShape() method

    public void calculatePerimeterOfShape()
    {
        // Make a selection based on the length and breadth
        if (length == breadth)
        {
            perimeter = 4 * length;
        } // End of the if block
        else
        {
            perimeter = 2 * (length + breadth);
        } // End of the else block

        displayMessage(shape);
    } // End of the calculatePerimeterOfShape() method

    public void displayMessage(String shapePassedIn)
    {
        System.out.printf("The %s has an area of %.2f and a perimeter of %.2f%n", shapePassedIn, area, perimeter);
    }

    public void writeValuesToAnArray(int counter)
    {
        // Keeping all the writing to the array in one location
        if (counter == 1)
        {
            arrayPosition = 4;
        }
        ShapeProperties[arrayPosition] = length;
        ShapeProperties[arrayPosition + 1] = breadth;
        ShapeProperties[arrayPosition + 2] = area;
        ShapeProperties[arrayPosition + 3] = perimeter;
    } // End of the writeValuesToAnArray() method

    public void displayValuesFromTheArray()
    {
        arrayPosition = 0;
        // Iteration for the display of the two sets of values
        for (int counter = 0; counter < 2; counter++)
        {
            // Reset shape to rectangle on iteration one
            if(counter==0)
            {
                shape = "rectangle";
            }
            else
            {
                // Set shape to square on iteration two
                shape = "square";
            }
            // Use shape variable in the display
            System.out.println("***************************************");
            System.out.println("      Properties of the " + shape);
            System.out.println("***************************************");
            System.out.println("The length of the " + shape + " is "  + ShapeProperties[arrayPosition]);
            System.out.println("The breadth of the " + shape + " is "  + ShapeProperties[arrayPosition +1]);
            System.out.println("The area of the " + shape + " is "   + ShapeProperties[arrayPosition +2]);
            System.out.println("The perimeter of the  " + shape + " is " + ShapeProperties[arrayPosition +3]);
            arrayPosition = 4;
        } // End of for iteration
    } // End of the displayValuesFromTheArray() method

}// End of RectangleSquareMethodsClass class
