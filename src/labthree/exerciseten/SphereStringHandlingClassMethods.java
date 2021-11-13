package labthree.exerciseten;

import java.io.*;

public class SphereStringHandlingClassMethods
{
    static double radius, surfaceArea, volume;
    static int arrayPosition = 0;
    static String shape;

    // Declare and create the array to hold the 3 elements of the sphere
    static double sphereProperties[] = new double[3];

    // Create an instance of the FileHandlingClass
    FileHandlingClass myFileHandlingClass = new FileHandlingClass();
/*******************************************************************
 Methods are reuseable blocks of code and in this example the methods
 are inside a Sphere class and the methods all relate specifically
 to a sphere.
 ******************************************************************/

    public double calculateVolumeOfSphere(double radius)
    {
        // Calculate the volume of the sphere
        volume = (4 * 3.14 * radius * radius * radius) / 3;
        return volume;
    }

    public double calculateSurfaceAreaOfSphere(double radius)
    {
        // Calculate the surface of the sphere
        surfaceArea = 4 * 3.14 * radius * radius;
        return surfaceArea;
    }

    public void addSphereValuesToArray(double radius, double volume, double surfaceArea)
    {
        // Write the circle details to the CircleProperties array
        sphereProperties[arrayPosition] = radius;
        sphereProperties[arrayPosition + 1] = volume;
        sphereProperties[arrayPosition + 2] = surfaceArea;
        myFileHandlingClass.writeShapePropertiesToTextFile(sphereProperties, "spherePropertiesFileHandling.txt");
        myFileHandlingClass.readShapePropertiesFromTextFile("spherePropertiesFileHandling.txt");

        Sphere mySphere = new Sphere(radius, volume, surfaceArea);
        System.out.println(mySphere.toString());

        serialiseTheShapeObject(mySphere);
        deSerialiseTheShapeObject();
    }

    public void displaySphereDetails(double[] spherePropertiesPassedIn)
    {
        // Set shape to sphere on iteration two
        shape = "sphere";
        // Use shape variable in the display
        System.out.println("**********************************************");
        System.out.println("Properties of the " + shape + " from the array");
        System.out.println("**********************************************");
        System.out.printf("The radius of the %s is %.2f%n", shape, spherePropertiesPassedIn[arrayPosition]);
        System.out.printf("The volume of the %s is %.2f%n", shape, spherePropertiesPassedIn[arrayPosition +1]);
        System.out.printf("The surface area of the %s is %.2f%n", shape, spherePropertiesPassedIn[arrayPosition +2]);
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

    public void serialiseTheShapeObject(Sphere mySpherePassedIn)
    {
        try{
            // A file output stream is an output stream for writing data to a File
            FileOutputStream fileOutputStreamForData = new FileOutputStream("SphereShapeSerialisedData.ser");

            // An ObjectOutputStream writes primitive data types of Java objects to an OutputStream
            ObjectOutputStream objectOutputStreamForData = new ObjectOutputStream(fileOutputStreamForData);
            objectOutputStreamForData.writeObject(mySpherePassedIn);

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
            Sphere mySphere = null;

            /* FileInputStream allows us to read the contents of a file as a stream of bytes */
            FileInputStream fileInputStreamForData = new FileInputStream("SphereShapeSerialisedData.ser");

            /* An ObjectInputStream deserializes primitive data and objects written using an ObjectOutputStream */
            ObjectInputStream objectInputStreamForData = new ObjectInputStream (fileInputStreamForData);

            /*
            The serialised file has been read and we use the readObject() method to get the
            object, we then cast the object to a Sphere object
            */
            mySphere = (Sphere) objectInputStreamForData.readObject();

            System.out.println("Shape Details");
            System.out.println("Shape radius:    " + mySphere.getRadius());
            System.out.println("Shape area:   " + mySphere.getVolume());
            System.out.println("Shape circumference:    " + mySphere.getSurfaceArea());

            objectInputStreamForData.close();
            fileInputStreamForData.close();
        } // End of try block
        catch(Exception exceptionGenerated)
        {
            System.out.println(exceptionGenerated);
        } // End of catch block
    } // End of serialiseTheShapeObject() method
} // End of SphereStringHandlingClassMethods class