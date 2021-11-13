package methods;

/*
This is the CircleCalculations class which has a main method
that calls two methods declared outside the main() method.
*/
public class CircleCalculations
{
    public static void main(String[] args)
    {
        // Call the circumferenceOfTheCircle() method passing it the value 10.00
        circumferenceOfTheCircle(10.00);

        // Call the areaOfTheCircle() method passing it the value 10.00
        areaOfTheCircle(10.00);
    }

    /* This method is used to return the value of the circumference of the circle with the specified radius */
    public static double circumferenceOfTheCircle(double radiusPassedIn)
    {
        double circumference = Math.PI * radiusPassedIn * 2;
        System.out.printf("A circle of radius %.2f has a circumference of %.2f %n", radiusPassedIn, circumference);
        return circumference;
    } // End of circumferenceOfTheCircle() method

    /* This method is used to return the value of the area of the circle with the specified radius */
    public static double areaOfTheCircle(double radiusPassedIn)
    {
        double area = Math.PI * radiusPassedIn * radiusPassedIn;
        System.out.printf("A circle of radius %.2f has an area of %.2f %n", radiusPassedIn, area);
        return area;
    } // End of areaOfTheCircle() method

} // End of CircleCalculations class