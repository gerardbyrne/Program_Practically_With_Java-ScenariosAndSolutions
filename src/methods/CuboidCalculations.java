package methods;

/*
This is the CuboidCalculations class which has a main method
that calls two methods declared outside the main() method.
*/
public class CuboidCalculations
{
    public static void main(String[] args)
    {
        // Call the surfaceAreaOfTheCuboid() method passing it the required values
        surfaceAreaOfTheCuboid(10.00, 20.00, 50.00);

        // Call the volumeOfTheCuboid() method passing it the required values
        volumeOfTheCuboid(10.00, 20.00, 50.00);
    }

    /* This method is used to return the value of the surface area of the cuboid with the specified dimensions */
    public static double surfaceAreaOfTheCuboid(double lengthPassedIn, double breadthPassedIn, double heightPassedIn)
    {
        double surfaceArea = (lengthPassedIn * breadthPassedIn * 2) + (lengthPassedIn * heightPassedIn * 2) + (heightPassedIn * breadthPassedIn * 2);
        System.out.printf("A cuboid of length %.2f, breadth %.2f and height %.2f has a surface area of %.2f %n", lengthPassedIn, breadthPassedIn, heightPassedIn, surfaceArea);
        return surfaceArea;
    } // End of surfaceAreaOfTheCuboid() method

    /* This method is used to return the value of the volume of the cuboid with the specified dimensions */
    public static double volumeOfTheCuboid(double lengthPassedIn, double breadthPassedIn, double heightPassedIn)
    {
        double volume = (lengthPassedIn * breadthPassedIn * heightPassedIn) ;
        System.out.printf("A cuboid of length %.2f, breadth %.2f and height %.2f has a volume of %.2f %n", lengthPassedIn, breadthPassedIn, heightPassedIn, volume);
        return volume;
    } // End of volumeOfTheCuboid() method

} // End of CuboidCalculations class