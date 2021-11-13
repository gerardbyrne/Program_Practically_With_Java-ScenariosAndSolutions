package labtwo.exerciseten;

import java.io.*;
import java.util.Scanner;

public class CubeCuboidSerialisationClassMethods
{
    Scanner myScanner = new Scanner(System.in);
    int arrayPosition = 0;
    double length, breadth, height, volume, perimeter;
    String shape = "cuboid";
    double ShapeProperties[] = new double[10];
    String ShapePropertiesWithLabels[] = new String[10];

    String lengthLabel = "The length is ";
    String breadthLabel = "The breadth is ";
    String heightLabel = "The height is ";
    String volumeLabel = "The volume is ";
    String perimeterLabel= "The perimeter is ";

    // Assign the name of the file to be used to a variable.
    static String filePath = "shapepropertiescubecuboid.txt";

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

        // Create an instance of the Shape class
        Shape myShape= new Shape(length, breadth, height, volume, perimeter);
        System.out.println(myShape.toString());
        serialiseTheShapeObject(myShape);
        deSerialiseTheShapeObject();
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

    public void writeShapePropertiesToTextFile()
    {
        System.out.println("***************************");
        System.out.println("Writing to the text file");
        System.out.println("***************************");
        // Enclose the code in a try catch to handle errors
        try
        {
          /*
           Create an instance of the FileWriter and call it fileWriter
           FileWriter is used to write text files in the default encoding.
           false means the existing data will be over written
          */
            FileWriter fileWriter = new FileWriter(filePath, false);

          /*
           Create an instance of the BufferedReader and call it bufferedReader
           we should always wrap a FileWriter in a BufferedWriter
          */
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

          /*
           Write text to the file using the write() method.
           In Java the write method will not automatically use a newline character
           so we will use the newLine() method to add the new line.
           We will use a foreach loop and simply write each value to the file
          */
            for(double arrayItem : ShapeProperties)
            {
                bufferedWriter.write(String.valueOf(arrayItem));
                bufferedWriter.newLine();
            }
            // Close the files.
            bufferedWriter.close();
        }  // End of the try section of the error handling
        catch(IOException ex)
        {
            System.out.println("Error writing file '" + filePath + "'");
        } // End of the catch section of the error handling
    } // End of writeShapePropertiesToTextFile() method

    public void readShapePropertiesFromTextFile()
    {
        System.out.println("***************************");
        System.out.println("Reading from the text file");
        System.out.println("***************************");
        // Set up a string variable to hold the lines read
        String line;

        // Enclose the code in a try catch to handle errors
        try
        {
       /*
        Create an instance of the FileReader and call it fileReader
        FileReader is used to read text files in the default encoding.
       */
            FileReader fileReader= new FileReader(filePath);

       /*
          Create an instance of the BufferedReader and call it bufferedReader
          we should always wrap a FileReader in a BufferedReader
       */
            BufferedReader bufferedReader = new BufferedReader(fileReader);

       /*
      Iterate the buffer and read one line at a time and display it
        */
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }  // End of while iteration

            // Close the files.
            bufferedReader.close();
        }  // End of try section of the error handling

        catch(IOException ex)
        {
            System.out.println("Error reading file '" + filePath + "'");
        } // End of the catch section of the error handling
    } // End of readShapePropertiesFromTextFile() method

    // Write values to an array and include some String labels
    public void writeValuesToAnArrayWithLabels(int counter)
    {
        // Keeping all the writing to the array in one location
        if (counter == 1)
        {
            arrayPosition = 5;
        }
        ShapePropertiesWithLabels[arrayPosition] = shape + " - " + lengthLabel + length;
        ShapePropertiesWithLabels[arrayPosition + 1] = shape + " - " + breadthLabel + breadth;
        ShapePropertiesWithLabels[arrayPosition + 2] = shape + " - " + heightLabel + breadth;
        ShapePropertiesWithLabels[arrayPosition + 3] = shape + " - " + volumeLabel + volume;
        ShapePropertiesWithLabels[arrayPosition + 4] = shape + " - " + perimeterLabel + perimeter;
    } // End of the writeValuesToAnArrayWithLabels() method

    public void displayValuesFromTheArrayWithLabels()
    {
        arrayPosition = 0;
        // Iteration for the display of the two sets of values
        for (int counter = 0; counter < 2; counter++)
        {
            System.out.println(ShapePropertiesWithLabels[arrayPosition]);
            System.out.println(ShapePropertiesWithLabels[arrayPosition +1]);
            System.out.println(ShapePropertiesWithLabels[arrayPosition +2]);
            System.out.println(ShapePropertiesWithLabels[arrayPosition +3]);
            System.out.println(ShapePropertiesWithLabels[arrayPosition +4]);
            arrayPosition = 5;
        } // End of for iteration
    } // End of the displayValuesFromTheArray() method

    public void serialiseTheShapeObject(Shape myShapePassedIn)
    {
        try{
            // A file output stream is an output stream for writing data to a File
            FileOutputStream fileOutputStreamForData = new FileOutputStream("CubeCuboidShapeSerialisedData.ser");

            // An ObjectOutputStream writes primitive data types of Java objects to an OutputStream
            ObjectOutputStream objectOutputStreamForData = new ObjectOutputStream(fileOutputStreamForData);
            objectOutputStreamForData.writeObject(myShapePassedIn);

            objectOutputStreamForData.close();
            fileOutputStreamForData.close();

            System.out.println("The serialisation has been completed");
        } // End of try block
        catch(IOException exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of serialiseTheShapeObject() method

    public void deSerialiseTheShapeObject()
    {
        try{
            /* Create a Customer object  */
           Shape myShape = null;

            /* FileInputStream allows us to read the contents of a file as a stream of bytes */
            FileInputStream fileInputStreamForData = new FileInputStream("CubeCuboidShapeSerialisedData.ser");

            /* An ObjectInputStream deserializes primitive data and objects written using an ObjectOutputStream */
            ObjectInputStream objectInputStreamForData = new ObjectInputStream (fileInputStreamForData);

            /*
            The serialised file has been read and we use the readObject() method to get the
            object, we then cast the object to a Shape object
            */
            myShape = (Shape) objectInputStreamForData.readObject();

            System.out.println("Shape Details");
            System.out.println("Shape length:    " + myShape.getLength());
            System.out.println("Shape breadth:   " + myShape.getBreadth());
            System.out.println("Shape volume:    " + myShape.getVolume());
            System.out.println("Shape perimeter: " + myShape.getPerimeter());

            objectInputStreamForData.close();
            fileInputStreamForData.close();
        } // End of try block
        catch(Exception exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of serialiseTheShapeObject() method

} // End of CubeCuboidSerialisationClassMethods class