package arrays;

public class CircleStatistics
{
    public static void main(String[] args)
    {
        // Declare the array and the required variables
        double[] radiusValues = {2, 5, 8, 9, 10};
        double[] circumferenceValues = new double[5];
        double[] areaValues = new double[5];

        double cicrumferenceOfTheCircle = 0.00;
        double areaOfTheCircle = 0.00;

        // Calculate the circumference of each circle and add itbtom the new array
        for (int position = 0; position < radiusValues.length;  position++)
        {
            circumferenceValues[position] =  2 * radiusValues[position] * Math.PI;
            areaValues[position] =  Math.PI * radiusValues[position] * radiusValues[position];
        } // End of for iteration construct

        // Display the circumferencee
        for(double circumference:circumferenceValues)
        {
            System.out.printf("The circumference of the circle is: %.2f%n", circumference);
        } // End of foreach iteration construct

        // Display the radius and the area of the circles
        for (int position = 0; position < radiusValues.length;  position++)
        {
            System.out.printf("A circle with radius %.2f has an area of %.2f%n", radiusValues[position], areaValues[position]);
        } // End of for iteration construct
    } // End of main() method

} // End of CircleStatistics class
