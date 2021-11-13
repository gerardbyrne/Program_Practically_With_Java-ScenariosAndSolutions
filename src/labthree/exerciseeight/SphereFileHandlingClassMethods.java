package labthree.exerciseeight;

public class SphereFileHandlingClassMethods
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

} // End of SphereFileHandlingClassMethods class