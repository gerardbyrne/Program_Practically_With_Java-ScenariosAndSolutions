package labthree.exerciseseven;

public class CircleSphereClassMain
{
    static double radius, area, circumference, surfaceArea, volume;
    static int arrayPosition = 0;
    static String shape;

    public static void main(String[] args)
    {
        CircleClassMethods myCircleClassMethods = new CircleClassMethods();
        SphereClassMethods mySphereClassMethods = new SphereClassMethods();

        // Iterate to allow for 2 sets of values
        for (int counter = 0; counter < 2; counter++)
        {
            shape = myCircleClassMethods.userShapeToBeUsed(counter);

            radius = myCircleClassMethods.userInputForRadiusOfShape();

            // Select the shape based on the letter input by the user
        // If it is c for circle we perform the calculations for a circle
        if(shape.equalsIgnoreCase("c"))
        {
            area = myCircleClassMethods.calculateAreaOfCircle(radius);

            circumference = myCircleClassMethods.calculateCircumferenceOfCircle(radius);

            // Write the circle details to the CircleProperties array
            myCircleClassMethods.addCircleValuesToArray(radius, area, circumference);

            System.out.printf("The circle has an area of %.2f and a circumference of %.2f%n", area, circumference);
        }
        // If it is s for sphere we perform the calculations for a sphere
        else if (shape.equalsIgnoreCase("s"))
        {
            volume = mySphereClassMethods.calculateVolumeOfSphere(radius);

            surfaceArea = mySphereClassMethods.calculateSurfaceAreaOfSphere(radius);

            // Write the sphere details to the SphereProperties array
            mySphereClassMethods.addSphereValuesToArray(radius, volume, surfaceArea);

            System.out.printf("The sphere has a volume of %.2f and a surface area of %.2f%n", volume, surfaceArea);
        }
        } // End of for iteration

        arrayPosition = 0;
        // Iteration for the display of the two sets of values
        for (int counter = 0; counter < 2; counter++)
        {
            // Reset shape on iteration one
            if(counter==0)
            {
                // Pass the array to the display method
                myCircleClassMethods.displayCircleDetails(CircleClassMethods.circleProperties);
            } // End of if section
            else
            {
                mySphereClassMethods.displaySphereDetails(mySphereClassMethods.sphereProperties);
            } // End of else section
        } // End of for iteration
    } // End of main() method

} // End of CircleSphereClassMain class