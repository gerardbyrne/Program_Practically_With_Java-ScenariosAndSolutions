package labthree.exerciseten;

import java.io.*;
import java.util.Scanner;

public class CircleStringHandlingClassMethods
{
    static Scanner myScanner = new Scanner(System.in);
    static double radius, area, circumference;
    static int arrayPosition = 0;
    static String shape;

    // Declare and create the array to hold the 3 elements of the circle
    static double circleProperties[] = new double[3];

    // Create an instance of the FileHandlingClass
    FileHandlingClass myFileHandlingClass = new FileHandlingClass();

/*******************************************************************
 Methods are reuseable blocks of code and in this example the methods
 are inside a Circle class and the methods all relate specifically
 to a circle.
 ******************************************************************/

    public String userShapeToBeUsed(int counter)
    {
        // Check if this is iteration one so we ask for the shape
        if(counter ==0)
        {
            // Ask the user what there shape is
            System.out.println("Are you working with a circle or sphere?");
            System.out.println("Type C or Circle");
            System.out.println("Type S or Sphere");
            shape = myScanner.next();
        } // End of outer if section
        /* As this is not the first iteration we know what shape the user
           picked the first time so we now need to set the shape to the second
           option i.e. either a c (Circle) or s (Sphere)
         */
        else
        {
            if(shape.equalsIgnoreCase("c") || shape.toLowerCase().charAt(0)=='c')
            {
                shape = "s";
            } // End of inner if section
            else
            {
                shape = "c";
            } // End of inner else section
        } // End of outer else section
        return shape;
    }  // End of getShapeToBeUsed() method

    public double userInputForRadiusOfShape()
    {
        // Ask the user for the radius of the shape
        System.out.println("What is the radius of your shape");
        radius = myScanner.nextDouble();
        return radius;
    } // End of userInputForRadiusOfShape() method

    public double calculateAreaOfCircle(double radius)
    {
        // Calculate the area of the circle
        area = 3.14 * radius * radius;
        return area;
    }

    public double calculateCircumferenceOfCircle(double radius)
    {
        // Calculate the circumference of the circle
        circumference = 3.14 * radius * 2;
        return circumference;
    }

    public void addCircleValuesToArray(double radius, double area, double circumference)
    {
        // Write the circle details to the CircleProperties array
        circleProperties[arrayPosition] = radius;
        circleProperties[arrayPosition + 1] = area;
        circleProperties[arrayPosition + 2] = circumference;
        myFileHandlingClass.writeShapePropertiesToTextFile(circleProperties, "circlePropertiesFileHandling.txt");
        myFileHandlingClass.readShapePropertiesFromTextFile("circlePropertiesFileHandling.txt");

        Circle myCircle = new Circle(radius, area, circumference);
        System.out.println(myCircle.toString());

        serialiseTheShapeObject(myCircle);
        deSerialiseTheShapeObject();
    }

    public void displayCircleDetails(double[] circlePropertiesPassedIn)
    {
        shape = "circle";
        // Use shape variable in the display
        System.out.println("**********************************************");
        System.out.println("Properties of the " + shape + " from the array");
        System.out.println("**********************************************");
        System.out.printf("The radius of the %s is %.2f%n", shape, circlePropertiesPassedIn[arrayPosition]);
        System.out.printf("The area of the %s is %.2f%n", shape, circlePropertiesPassedIn[arrayPosition +1]);
        System.out.printf("The circumference of the %s is %.2f%n", shape, circlePropertiesPassedIn[arrayPosition +2]);
    }

    public void serialiseTheShapeObject(Circle myCirclePassedIn)
    {
        try{
            // A file output stream is an output stream for writing data to a File
            FileOutputStream fileOutputStreamForData = new FileOutputStream("CircleShapeSerialisedData.ser");

            // An ObjectOutputStream writes primitive data types of Java objects to an OutputStream
            ObjectOutputStream objectOutputStreamForData = new ObjectOutputStream(fileOutputStreamForData);
            objectOutputStreamForData.writeObject(myCirclePassedIn);

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
            /* Create a Circle object  */
            Circle myCircle = null;

            /* FileInputStream allows us to read the contents of a file as a stream of bytes */
            FileInputStream fileInputStreamForData = new FileInputStream("CircleShapeSerialisedData.ser");

            /* An ObjectInputStream deserializes primitive data and objects written using an ObjectOutputStream */
            ObjectInputStream objectInputStreamForData = new ObjectInputStream (fileInputStreamForData);

            /*
            The serialised file has been read and we use the readObject() method to get the
            object, we then cast the object to a Circle object
            */
            myCircle = (Circle) objectInputStreamForData.readObject();

            System.out.println("Shape Details");
            System.out.println("Shape radius:    " + myCircle.getRadius());
            System.out.println("Shape area:   " + myCircle.getArea());
            System.out.println("Shape circumference:    " + myCircle.getCircumference());

            objectInputStreamForData.close();
            fileInputStreamForData.close();
        } // End of try block
        catch(Exception exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of serialiseTheShapeObject() method
} // End of CircleStringHandlingClassMethods class